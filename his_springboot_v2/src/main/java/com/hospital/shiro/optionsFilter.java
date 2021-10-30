package com.hospital.shiro;

import org.apache.shiro.web.filter.authc.PassThruAuthenticationFilter;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName optionsFilter
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/25 10:42
 * @Version 1.0
 **/

public class optionsFilter extends PassThruAuthenticationFilter {
    /**
     * @Description 实现请求过滤器，把options的请求的方式进行过滤掉。然后把这个过滤器放到其中
     * @Date 10:43 2019/6/25
     * @Param [request, response, mappedValue]
     * @return boolean
     **/

    @Override
    public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
            throws Exception {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        if(req.getMethod().equals(RequestMethod.OPTIONS.name())){
            return true;
        }
        return super.onPreHandle(request, response, mappedValue);
    }

}
