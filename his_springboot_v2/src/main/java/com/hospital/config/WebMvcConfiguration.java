package com.hospital.config;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName WebMvcConfigurerAdapter
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/27 10:47
 * @Version 1.0
 **/

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/image/**").addResourceLocations("file:E://img/");
        super.addResourceHandlers(registry);


    }
}

