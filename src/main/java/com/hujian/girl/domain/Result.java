package com.hujian.girl.domain;

/**
 * Http Response Outermost Layer Object
 */
public class Result<T> {
    // Code
    private Integer code;
    // Message
    private String message;
    // Data
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
