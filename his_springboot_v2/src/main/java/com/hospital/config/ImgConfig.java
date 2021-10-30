package com.hospital.config;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName ImgConfig
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/26 18:07
 * @Version 1.0
 **/


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ImgConfig extends WebMvcConfigurerAdapter {

    //图片存放根路径
    @Value("${file.rootPath}")
    private String ROOT_PATH;
    //图片存放根目录下的子目录
    @Value("${file.sonPath}")
    private String SON_PATH;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        String filePath = "file:" + ROOT_PATH + SON_PATH;
        //指向外部目录
        registry.addResourceHandler("img//**").addResourceLocations(filePath);
        super.addResourceHandlers(registry);
    }
}