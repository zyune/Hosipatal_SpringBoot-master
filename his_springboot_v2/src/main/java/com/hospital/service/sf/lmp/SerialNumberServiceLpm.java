package com.hospital.service.sf.lmp;

import com.hospital.config.RedisCacheManager;
import com.hospital.service.sf.SF_SerialNumberService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SerialNumberServiceLpm implements SF_SerialNumberService {
    @Resource
    private RedisTemplate redisTemplate;
    /**
     * 定义流水号工单默认前缀
     */
    private static final String SERIAL_NUMBER = "itsm:serial:";
    private static final String REGISTRATION_CODE = "RG";

    @Override
    public String generateRegistrationId() throws ParseException {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisTemplate(redisTemplate);
        //获取当前时间,返回格式如yyyyMMdd
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());

        //构造redis过期时间 UnixMillis
        //设置过期时间为当天的最后一秒
        long expire = (new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse(date + " 23:59:59").getTime() - new Date().getTime()) / 1000;

        //构造redis的key
        String key = SERIAL_NUMBER + date + ":" + REGISTRATION_CODE;

        //判断key是否存在
        Boolean exists = redisCacheManager.hasKey(key);

        Long incr = redisCacheManager.incr(key, 1);

        //设置过期时间
        if (!exists) {
            redisCacheManager.expire(key, expire);
        }

        //默认编码需要3位，位数不够前面补0
        String number = String.format("%03d", incr);
        StringBuilder sb = new StringBuilder(20);
        //转换成业务需要的格式  bizCode + date + incr
        sb.append(REGISTRATION_CODE).append(date).append(number);

        return sb.toString();
    }
}
