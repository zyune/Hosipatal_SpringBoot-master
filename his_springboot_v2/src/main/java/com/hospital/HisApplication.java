package com.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan("com.hospital.mapper")
@EnableSwagger2
class HisApplication {
    public static void main(String[] args) {
        SpringApplication.run(HisApplication.class, args);
    }

}
