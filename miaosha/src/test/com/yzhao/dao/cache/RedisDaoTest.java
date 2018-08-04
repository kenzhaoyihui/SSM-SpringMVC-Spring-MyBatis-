package com.yzhao.dao.cache;

import com.yzhao.BaseTest;
import com.yzhao.dao.SeckillDao;
import com.yzhao.entity.Seckill;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisDaoTest extends BaseTest {
    private long id = 1001;

    @Autowired
    private RedisDao redisDao;

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void testGetSeckill() {
        Seckill seckill = redisDao.getSeckill(id);
        if (seckill == null) {
            seckill = seckillDao.queryById(id);
            if (seckill != null) {
                String result = redisDao.putSeckill(seckill);
                System.out.println("Put: " + result);
                seckill = redisDao.getSeckill(id);
                System.out.println("Get: " + seckill);
            }
        }
    }
    @Test
    public void testPutSeckill() {

    }
}
