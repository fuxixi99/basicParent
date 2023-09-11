package com.hf.basic.rule.pojo.response;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "响应成功的封装类")
public class SuccessResponseData<T> extends ResponseData<T> {

    public SuccessResponseData() {
        super(Boolean.TRUE, "200","请求成功", null);
    }

    public SuccessResponseData(T object) {
        super(Boolean.TRUE, "200", "请求成功", object);
    }

    public SuccessResponseData(String code, String message, T object) {
        super(Boolean.TRUE, code, message, object);
    }
}
