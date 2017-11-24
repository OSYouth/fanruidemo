package com.tianbiaoge.example.fanruidemo.domain;

/**
 * @Describe 结果(错误)类
 * @Author lc
 * @CreateTime 2017/11/23
 */
public class Result<T> {

    private Integer code;    /** 错误码. */

    private String msg;   /** 提示信息. */

    private T data;    /** 具体的内容. */

    /**
     * @Describe 这个类里面各个变量的setter和getter方法
     */
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
