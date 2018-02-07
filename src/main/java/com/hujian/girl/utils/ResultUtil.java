package com.hujian.girl.utils;

import com.hujian.girl.domain.Result;

public class ResultUtil {

    public static <T> Result<T> success(T value) {
        Result <T>result = new Result<T>();
        result.setCode(0);
        result.setMessage("success");
        result.setData(value);
        return result;
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> error(Integer code, String message) {
        Result <T>result = new Result<T>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
