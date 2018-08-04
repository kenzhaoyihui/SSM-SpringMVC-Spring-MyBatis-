package com.yzhao.web;

import com.yzhao.dto.Exposer;
import com.yzhao.dto.SeckillExecution;
import com.yzhao.dto.SeckillResult;
import com.yzhao.entity.Seckill;
import com.yzhao.enums.SeckillStateEnum;
import com.yzhao.exception.RepeatKillException;
import com.yzhao.exception.SeckillCloseException;
import com.yzhao.exception.SeckillException;
import com.yzhao.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/seckill")
public class SeckillController {

    private static final Logger logger = LoggerFactory.getLogger(SeckillController.class);

    @Autowired
    private SeckillService seckillService;

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        dateFormat.setLenient(true);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<Seckill> seckills = seckillService.getSeckillList();

        model.addAttribute("list", seckills);
        //list.jsp + model = ModelAndView
        return "list"; // WEB-INF/jsp/list.jsp
    }

    @RequestMapping(value = "/{seckillId}/detail", method = RequestMethod.GET)
    public String detail(@PathVariable("seckillId") Long seckillId, Model model) {
        if (seckillId == null) {
            return "redirect:/seckill/list";
        }

        Seckill seckill = seckillService.getById(seckillId);
        if (seckill == null) {
            return "forward:/seckill/list";
        }

        model.addAttribute("seckill", seckill);
        return "detail";
    }

    // ajax json
    @RequestMapping(value = "/{seckillId}/exposer", method = RequestMethod.POST,
                    produces = {"application/json; charset=utf-8"})
    @ResponseBody //注解表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，一般在异步获取数据时使用
    public SeckillResult<Exposer> exposer(@PathVariable("seckillId") long seckillId) {
        SeckillResult<Exposer> result;
        try {
            Exposer exposer = seckillService.exportSeckillUrl(seckillId);
            result = new SeckillResult<Exposer>(true, exposer);
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
            result = new SeckillResult<Exposer>(false, e.getMessage());
        }

        return result;
    }

    @RequestMapping(value = "/{seckillId}/{md5}/execution", method = RequestMethod.POST,
                    produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public SeckillResult<SeckillExecution> execute(@PathVariable("seckillId") Long seckillId,
                                                   @PathVariable("md5") String md5,
                                                   @CookieValue(value = "killPhone", required = false) Long phone) {
        //springmvc valid
        if (phone == null) {
            return new SeckillResult<SeckillExecution>(false, "not register");
        }

        try {
            // 存储过程调用
            SeckillExecution execution = seckillService.executeSeckill(seckillId, phone, md5);
            return new SeckillResult<SeckillExecution>(true, execution);
        }catch (RepeatKillException e) {
            SeckillExecution execution =  new SeckillExecution(seckillId, SeckillStateEnum.REPEAT_KILL);
            return new SeckillResult<SeckillExecution>(true, execution);
        }catch (SeckillCloseException e) {
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillStateEnum.END);
            return new SeckillResult<SeckillExecution>(true, execution);
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillStateEnum.INNER_ERROR);
            return new SeckillResult<SeckillExecution>(true, execution);
        }
    }

    @RequestMapping(value = "/time/now", method = RequestMethod.GET)
    @ResponseBody
    public SeckillResult<Date> time() {
        Date now = new Date();
        return new SeckillResult<Date>(true, now);
    }

    @RequestMapping(value = "/time/noww", method = RequestMethod.POST)
    @ResponseBody
    public void time1(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date date) {
        System.out.println(date);
    }

    @RequestMapping(value = "/time/nowww", method = RequestMethod.POST)
    @ResponseBody
    public void time2(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        System.out.println(date);
    }


}
