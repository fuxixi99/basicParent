package com.hf.basic.rule.pojo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "http响应结果封装")
public class ResponseData<T> {

    /** 请求是否成功 */

    @ApiModelProperty(value = "请求是否成功")
    private Boolean success;

    /** 响应状态码 */

    @ApiModelProperty(value = "响应状态码")
    private String code;

    /** 响应信息 */

    @ApiModelProperty(value = "响应信息")
    private String message;

    /** 响应对象 */

    @ApiModelProperty(value = "响应对象")
    private T data;

    public ResponseData() {}

    public ResponseData(Boolean success, String code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

