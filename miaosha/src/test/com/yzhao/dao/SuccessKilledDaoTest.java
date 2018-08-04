package com.yzhao.dao;

import com.yzhao.BaseTest;
import com.yzhao.entity.Seckill;
import com.yzhao.entity.SuccessKilled;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class SuccessKilledDaoTest extends BaseTest {

    @Autowired
    private SuccessKilledDao successKilledDao;

    @Test
    public void testInsertSuccessKilled() {
        /**
         * First run: insertCount=1
         * Second run: insertCount=0
         */
        long id = 1004;
        long phone = 1234567890L;
        int insertCount = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount=" + insertCount);
    }

    @Test
    public void testQueryByIdWithSeckill() {
        long id = 1004;
        long phone = 1234567890L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }

}
