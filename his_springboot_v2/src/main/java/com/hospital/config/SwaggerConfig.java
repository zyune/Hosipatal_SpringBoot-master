package com.hospital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import static com.google.common.base.Predicates.or;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @Description  swagger的配置
 * @Date 11:56 2019/6/13
 * @Param
 * @return
 **/
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hospital.controller.*"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("HIS云医院api文档")
                .description("云医院的restfun风格")
                .termsOfServiceUrl("119.23.69.23")
                .contact(new Contact("his云医院小组", "www.119.23.69.23.com", "173485406@qq.com"))//作者
                .version("1.0")
                .build();
    }

    @SuppressWarnings("unchecked")
    @Bean
    public Docket commonApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("common")
                .genericModelSubstitutes(DeferredResult.class)
//                   .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .build()
                .apiInfo(commonApiInfo());
    }

    private ApiInfo commonApiInfo() {
        return new ApiInfoBuilder()
                .title("页面API")//大标题
                .description("云医院的Springboot平台的REST API")//详细描述
                .version("1.0")//版本
                .contact(new Contact("his云医院小组", "www.119.23.69.23.com", "173485406@qq.com"))//作者
                .build();
    }


}