package com.jnote.utils;

/**
 * Created by sang on 2017/12/17.
 */
public class RespUtil {
    private Integer code;
    private String msg;

    public RespUtil() {
    }

    public RespUtil(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
