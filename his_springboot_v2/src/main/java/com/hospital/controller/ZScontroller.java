package com.hospital.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName TestController
 * @Description 进行测试开发的
 * @Author 方聪
 * @Date 2019/6/6 10:06
 * @Version 1.0
 **/
@RestController
@RequestMapping("/zs")
@RequiresPermissions(value = "/zs/*")
public class ZScontroller {

    @RequestMapping("/hi")
   public String sayHello(){
       return "hello zs";
   }

}
