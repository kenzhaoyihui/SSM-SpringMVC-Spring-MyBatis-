package com.yzhao.dao.cache;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import com.yzhao.entity.Seckill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisDao {
    private static final Logger logger = LoggerFactory.getLogger(RedisDao.class);

    private final JedisPool jedisPool;

    // Use the protobuf to serialization
    private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);

    public RedisDao(String ip, int port) {
        jedisPool = new JedisPool(ip, port);
    }

    public String putSeckill(Seckill seckill) {
        // set Object(Seckill) -> 序列号 -> byte[]
        try {
            Jedis jedis = jedisPool.getResource();
            try {
                String key = "seckill:" + seckill.getSeckillId();
                byte[] bytes = ProtobufIOUtil.toByteArray(seckill, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));

                // just one hour
                int timeout = 60*60;
                String result = jedis.setex(key.getBytes(), timeout, bytes);
                return result;
            }finally {
                jedis.close();
            }
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public Seckill getSeckill(long seckillId) {
        try {
            Jedis jedis = jedisPool.getResource();
            try {
                String key = "seckill:" + seckillId;

                // 并没有实现内部序列化操作
                // get -> byte[] -> 反序列化 -> object[Seckill]
                // 采用自定义序列化
                // protostuff : pojo.
                byte[] bytes = jedis.get(key.getBytes());
                if (bytes != null) {
                    Seckill seckill = schema.newMessage();
                    ProtobufIOUtil.mergeFrom(bytes, seckill, schema);
                    // seckill被反序列化
                    return seckill;
                }
            }finally {
                jedis.close();
            }
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}
