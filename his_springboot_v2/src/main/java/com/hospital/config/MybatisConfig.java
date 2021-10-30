package com.hospital.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName MybatisConfig
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/21 16:04
 * @Version 1.0
 **/
@Configuration
public class MybatisConfig {
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("dialect", "Mysql");
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}
