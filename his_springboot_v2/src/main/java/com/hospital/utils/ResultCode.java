package com.hospital.utils;

import java.io.Serializable;

/**
 * @Description 该enum集合是定义一些返回code的，也就是说我们需要在之下定义响应状态码
 *  状态码：100~199：表示成功接收请求，要求客户端继续提交下一次请求才能完成整个处理过程。
 *  200~299：表示成功接收请求并已完成整个处理过程。常用200
 *  300~399：为完成请求，客户需进一步细化请求。例如：请求的资源已经移动一个新地址、常用302（意味着你请求我，我让你去找别人）,307和304（我不给你这个资源，自己拿缓存）
 *  400~499：客户端的请求有错误，常用404（意味着你请求的资源在web服务器中没有）403（服务器拒绝访问，权限不够）
 *  500~599：服务器端出现错误，常用500
 *
 * l200（正常）
 * 表示一切正常，返回的是正常请求结果。
 * l302/307（临时重定向）
 * 指出被请求的文档已被临时移动到别处，此文档的新的URL在Location响应头中给出。
 * l304（未修改）
 * 表示客户机缓存的版本是最新的，客户机应该继续使用它。
 * l403（禁止）
 * 服务器理解客户端请求，但拒绝处理它。通常由于服务器上文件或目录的权限设置所致。
 * l404（找不到）
 * 服务器上不存在客户机所请求的资源。
 * l500（内部服务器错误）
 * 服务器端的CGI、ASP、JSP等程序发生错误。
 *
 *
 * 这个类是我们定义的ResultCode的类，需要我们进行编写
 * ------------------------------------------
 * 但是服务器会返回404 、 500 以及405 ，所以我们不能使用这三个进行定义。
 *404 未找到页面是不会进行controller的，，500 是服务器错误，是不会进行返回controller的
 * 405 get/post请求不对应是不会进入controller的
 *
 *
 * @Date 9:15 2019/6/12
 * @Param
 * @return
 **/
public enum ResultCode implements Serializable {

    SUCCESS(200,"请求成功"),
    FORBID(403,"无请求权限"),
    NOTLOGIN(401,"用户未登陆"),
    ERROR_URSERlOGIN(406,"用户登陆失败，密码账号错误"),
    // 只要是业务具有异常的话都使用这个，或者传入的参数也错误异常的话都使用这个
    ERROR_ALL(407,"数据库无查询结果或（业务执行异常）"),//业务错误，就是一些找不到值啊，mybaits 应该我没用做为null的判断，出现这个407大多数是参数为空，或者返回结果为空
    ERROR(505,"服务器出现错误");

    private int code;
    private String mes;

    ResultCode(int code,String mes){
        this.code = code;
        this.mes = mes;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return mes;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }}
