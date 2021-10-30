package com.hospital.controller;

import com.hospital.model.User;
import com.hospital.service.od.odlmp.UserServerLmp;
import com.hospital.utils.ExceptionAndLogAop;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName  该类是进行登陆、退出、以及显示无限访问的操作的一个根控制类
 * @Description 进行测试开发的
 * @Author 方聪
 * @Date 2019/6/6 10:06
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@Api(tags = {"系统shiro登陆api"})
public class ShiroController {
    private Logger logger = LoggerFactory.getLogger(ExceptionAndLogAop.class);

    @Autowired
    UserServerLmp userServerLmp;

//    @PostMapping(value = "/login")
//    public Result TestController(@RequestBody  String[] login){
//
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token=new UsernamePasswordToken(login[0],login[1]);
//        Result r = null;
//        try {
//            subject.login(token);
//            subject.getSession().setAttribute("userName",login[0]);
//            //查询role
//            User user = userServerLmp.findByUserName(login[0]);
//            r = new Result(ResultCode.SUCCESS,user);
//        }catch (RuntimeException e) {
//            token.clear();
//            r = new Result(ResultCode.ERROR_URSERlOGIN);
//        }
//        return r;
//    }
    /**
     * @Description 登陆操作，
     * @Date 11:43 2019/6/12
     * @Param [username, password] 用户名和用户密码
     * @return com.hospital.utils.Result BindingResult result
     **/
    @GetMapping(value = "/login")
    public Result LoginHandler(String username,String password){
        if(username == null || password == null){
          return  new Result(ResultCode.ERROR_URSERlOGIN);
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        Result r = null;
        try {
            subject.login(token);
            //查询role
            User user = userServerLmp.findByUserName(username);
            r = new Result(ResultCode.SUCCESS,user);
        }catch (RuntimeException e) {
            token.clear();
            r = new Result(ResultCode.ERROR_URSERlOGIN);
        }
        return r;
    }


    /**
     * @Description  无权限访问会执行这个Controller
     * @Date 11:44 2019/6/12
     * @Param []
     * @return com.hospital.utils.Result
     **/
    @RequestMapping("/unauth")
    public Result unauth(){
        Result r = new Result(ResultCode.FORBID);
        return r;
    }
    /**
     * @Description 用户退出的Controller
     * @Date 11:45 2019/6/12
     * @Param []
     * @return com.hospital.utils.Result
     **/
    @RequestMapping("/logout")
    public Result logout(){
        Result r = new Result(ResultCode.SUCCESS);
        return r;
    }













}
