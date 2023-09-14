package com.hf.basic.message.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

@ApiModel(value = "",description = "")
@TableName("message_template")
public class MessageTemplate implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @ApiModelProperty(name = "id", notes = "")
    @TableId(value = "template_id")
    private BigInteger templateId;
    /**
     * 模板编号
     */
    @ApiModelProperty(name = "模板编号", notes = "")
    private String templateCode;
    /**
     * 消息内容
     */
    @ApiModelProperty(name = "消息内容", notes = "")
    private String messageContent;
    /**
     * 通知对象列表
     */
    @ApiModelProperty(name = "通知对象列表", notes = "")
    private String receiveUserList;
    /**
     * 接收端类型列表
     */
    @ApiModelProperty(name = "接收端类型列表", notes = "")
    private String receiveTypeList;
    /**
     * 状态（1正常，0停用）
     */
    @ApiModelProperty(name = "状态（1正常，0停用）", notes = "")
    private Integer status;
    /**
     * 创建人
     */
    @ApiModelProperty(name = "创建人", notes = "")
    private BigInteger createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "")
    private LocalDateTime createTime;
    /**
     * 修改人
     */
    @ApiModelProperty(name = "修改人", notes = "")
    private BigInteger updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(name = "修改时间", notes = "")
    private LocalDateTime updateTime;
}
