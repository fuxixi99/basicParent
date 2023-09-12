package com.hf.basic.message.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ;
 * @author : http://www.chiner.pro
 * @date : 2023-9-11
 */
@ApiModel(value = "",description = "")
@TableName("sys_message")
@Data
public class SysMessage implements Serializable,Cloneable{
    /** 消息的id */
    @ApiModelProperty(name = "消息的id",notes = "")
    @TableId
    private Long messageId ;
    /** 模板id */
    @ApiModelProperty(name = "模板id",notes = "")
    private Long templateId ;
    /** 接收用户id */
    @ApiModelProperty(name = "接收用户id",notes = "")
    private Long receiveUserId ;
    /** 接收端类型 */
    @ApiModelProperty(name = "接收端类型",notes = "")
    private String receiveType ;
    /** 消息标题 */
    @ApiModelProperty(name = "消息标题",notes = "")
    private String messageTitle ;
    /** 消息内容 */
    @ApiModelProperty(name = "消息内容",notes = "")
    private String messageContent ;
    /** 消息类型 */
    @ApiModelProperty(name = "消息类型",notes = "")
    private String messageType ;
    /** 消息发送时间 */
    @ApiModelProperty(name = "消息发送时间",notes = "")
    private Date messageSendTime ;
    /** 阅读状态：0-未读，1-已读 */
    @ApiModelProperty(name = "阅读状态：0-未读，1-已读",notes = "")
    private Integer readFlag ;
    /** 创建人 */
    @ApiModelProperty(name = "创建人",notes = "")
    private Long createUser ;
    /** 创建时间 */
    @ApiModelProperty(name = "创建时间",notes = "")
    private Date createTime ;
    /** 修改人 */
    @ApiModelProperty(name = "修改人",notes = "")
    private Long updateUser ;
    /** 修改时间 */
    @ApiModelProperty(name = "修改时间",notes = "")
    private Date updateTime ;
}