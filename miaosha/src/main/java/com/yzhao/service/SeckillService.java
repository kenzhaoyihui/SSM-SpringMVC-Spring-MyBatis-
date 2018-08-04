package com.yzhao.service;


import com.yzhao.dto.Exposer;
import com.yzhao.dto.SeckillExecution;
import com.yzhao.entity.Seckill;
import com.yzhao.exception.RepeatKillException;
import com.yzhao.exception.SeckillCloseException;
import com.yzhao.exception.SeckillException;
import java.util.List;

public interface SeckillService {

    /**
     * 查询所有秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();


    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);


    /**
     * 秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间
     * @param seckillId
     * @return
     */
    Exposer exportSeckillUrl(long seckillId);


    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     * @throws SeckillException
     * @throws SeckillCloseException
     * @throws RepeatKillException
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, SeckillCloseException, RepeatKillException;


    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5)
        throws SeckillException, SeckillCloseException, RepeatKillException;
}
