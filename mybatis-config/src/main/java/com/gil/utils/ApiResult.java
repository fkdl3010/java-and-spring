package com.gil.utils;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ApiResult<T> {

    private static final String SUCCESS = "success";

    private static final String FAIL = "fail";

    private final T data;

    private final String result;

    private final String message;

    ApiResult(T data, String result, String message) {
        this.data = data;
        this.result = result;
        this.message = message;
    }

    public static <T> ApiResult<T> succeed(T data) {
        return new ApiResult<>(data, SUCCESS, null);
    }

    public static <T> ApiResult<T> succeed(T data, String message) {
        return new ApiResult<>(data, SUCCESS, message);
    }

    public static ApiResult<?> failed(Throwable throwable) {
        return failed(throwable.getMessage());
    }

    public static ApiResult<?> failed(String message) {
        return new ApiResult<>(null, FAIL, message);
    }

    public String getResult() {
        return result;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("data", data).append("message", message).toString();
    }
}