package com.yzhao.dao;

import com.yzhao.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SeckillDao {

    /**
     * reduce seckill
     * @param seckillId
     * @param killTime
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);


    /**
     * query the seckill object via seckillId
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 使用存储过程执行秒杀
     * @param paramMap
     */
    void killByProcedure(Map<String, Object> paramMap);
}
