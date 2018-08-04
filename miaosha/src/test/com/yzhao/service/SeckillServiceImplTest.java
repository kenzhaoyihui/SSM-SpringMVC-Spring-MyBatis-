package com.yzhao.service;

import com.yzhao.BaseTest;
import com.yzhao.dto.Exposer;
import com.yzhao.dto.SeckillExecution;
import com.yzhao.entity.Seckill;
import com.yzhao.exception.RepeatKillException;
import com.yzhao.exception.SeckillCloseException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SeckillServiceImplTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(SeckillServiceImplTest.class);

    @Autowired
    private SeckillService seckillService;

    @Test
    public void testGetSeckillList() {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list={}", list);
    }

    @Test
    public void testGetById() {
        long id = 1000;
        Seckill seckill = seckillService.getById(id);
        logger.info("seckill={}", seckill);
    }

    @Test
    public void testSeckillLogic() {
        long id = 1004;
        Exposer exposer = seckillService.exportSeckillUrl(id);

        if (exposer.isExposed()) {
            logger.info("exposer={}", exposer);
            long phone = 12345678912L;
            String md5 = exposer.getMd5();

            try {
                SeckillExecution execution = seckillService.executeSeckill(id, phone, md5);
                logger.info("execution={}", execution);
            }catch (RepeatKillException e) {
                logger.error(e.getMessage());
            }catch (SeckillCloseException e) {
                logger.error(e.getMessage());
            }
        }else {
            // 秒杀未开启
            logger.error("exposer={}", exposer);
        }
    }
}
