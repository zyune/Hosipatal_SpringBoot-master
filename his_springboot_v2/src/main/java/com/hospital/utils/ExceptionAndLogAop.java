package com.hospital.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName ExceptionAop
 * @Description 异常处理的AOP，这个AOP是用来作全局的异常处理，处理所有的Controller未进行
 * catch的异常，如为在controller进行catch异常，如出现异常则会进行aop处理
 * @Author 方聪
 * @Date 2019/6/12 10:18
 * @Version 1.0
 **/
@Component
@Aspect
public class ExceptionAndLogAop {
    // slf4j的日志操作
    private Logger logger = LoggerFactory.getLogger(ExceptionAndLogAop.class);
    /**
     * @Description  设置一个poinTCut切入点 controller 任何的一个方法
     * @Date 11:07 2019/6/12
     * @Param []
     * @return void
     **/
    @Pointcut(value = "execution(* com.hospital.controller..*(..))")
    public void point(){}

    @Before("point()")
    public void logBefore(JoinPoint p){
        logger.info("执行了"+p.getSignature().getName()+"方法");
        if(p.getArgs() != null)
            logger.info("执行了"+p.getSignature().getName()+"方法,传入的参数为"+ Arrays.toString(p.getArgs()));
    }
//    /**
//     * @Description 使用环绕通知进行异常处理并且返回错误的code
//     * @Date 11:07 2019/6/12
//     * @Param
//     * @return
//     **/
//    @Around("point()")
//    public Result serviceAOP(ProceedingJoinPoint pjp) {
//        Result newResultVo = null;
//        try {
//            newResultVo = (Result)pjp.proceed();
//            // 可以处理自定义异常
//        } catch (Throwable e) {
//            logger.info("业务异常:" +pjp.getSignature().getName()+"方法出现了异常为:"+ e.getMessage());
////            业务异常:getMedicalRecordPageByPatientBLH方法出现了异常为:Index: 0, Size: 0
//            newResultVo = new Result(ResultCode.ERROR_ALL);
//        }
//
//        return newResultVo;
//    }
//





}
