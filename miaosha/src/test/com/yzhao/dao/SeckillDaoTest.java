package com.yzhao.dao;

import com.yzhao.BaseTest;
import com.yzhao.entity.Seckill;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

public class SeckillDaoTest extends BaseTest{

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void testQueryById() {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void testQueryAll() {
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for (Seckill seckill : seckills) {
            System.out.println(seckill);
        }
    }

    @Test
    public void reduceNumber() {
        /**
         * if the nowTime<endTime , updateCount will be 1
         * else the nowTime>endTime, updateCount will be 0
         */
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1004L, killTime);
        System.out.println("updateCount=" + updateCount);
    }
}
