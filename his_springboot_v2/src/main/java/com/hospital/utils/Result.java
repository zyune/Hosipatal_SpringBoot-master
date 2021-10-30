package com.hospital.utils;

import java.io.Serializable;

/**
 * @Description  使用的返回结果这个结果是一个响应体的json数据格式
 * 其中包含code响应码以及它的描述，如果具有data,那么就返回data对象。
 *
 * 无set/get函数，只能通过二个构造方法进行生成对象，通过进行new。
 * 而且这个对象仅仅只能在Controller进行使用，其他的时候不可使用。
 * @Date 9:48 2019/6/12
 * @Param
 * @return
 **/
public class Result  implements Serializable {

    private int code;
    private String msg;
    // 这个是返回的数据，可以返回list或者java对象
    private Object data;

    public Result(ResultCode resultCode, Object data) {
        this(resultCode);
        this.data = data;
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        data = null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}