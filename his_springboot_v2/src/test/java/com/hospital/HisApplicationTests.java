package com.hospital;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HisApplicationTests {


    @Autowired
    RedisTemplate rt;
    @Test
    public void contextLoads() {
        rt.opsForValue().append("xxx","xxxs");
        String xxx =(String) rt.opsForValue().get("xxx");
        System.out.println("dd"+xxx);

    }


}

