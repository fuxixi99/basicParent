package com.hf.basic.message.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author : http://www.chiner.pro
 * @date : 2023-9-11
 */
@ApiModel(value = "",description = "")
@TableName(value = "sys_message")
@Data
public class SysMessage implements Serializable{
    private static final long serialVersionUID = 1L;
    /** 消息的id */
    @ApiModelProperty(name = "消息的id",notes = "")
    @TableId(value = "message_id")
    private Long messageId ;
    /** 模板id */
    @ApiModelProperty(name = "模板id",notes = "")
    @TableField(value = "template_id")
    private Long templateId ;
    /** 接收用户id */
    @ApiModelProperty(name = "接收用户id",notes = "")
    @TableField(value = "receive_user_id")
    private Long receiveUserId ;
    /** 接收端类型 */
    @ApiModelProperty(name = "接收端类型",notes = "")
    @TableField(value = "receive_type")
    private String receiveType ;
    /** 消息标题 */
    @ApiModelProperty(name = "消息标题",notes = "")
    @TableField(value = "message_title")
    private String messageTitle ;
    /** 消息内容 */
    @ApiModelProperty(name = "消息内容",notes = "")
    @TableField(value = "message_content")
    private String messageContent ;
    /** 消息类型 */
    @ApiModelProperty(name = "消息类型",notes = "")
    @TableField(value = "message_type")
    private String messageType ;
    /** 消息发送时间 */
    @ApiModelProperty(name = "消息发送时间",notes = "")
//    @TableField(value = "message_send_time")
    @TableField(fill = FieldFill.INSERT,value = "message_send_time")
    private Date messageSendTime ;
    /** 阅读状态：0-未读，1-已读 */
    @ApiModelProperty(name = "阅读状态：0-未读，1-已读",notes = "")
    @TableField(value = "read_flag")
    private Integer readFlag ;
    /** 创建人 */
    @ApiModelProperty(name = "创建人",notes = "")
    @TableField(value = "create_user")

    private Long createUser ;
    /** 创建时间 */
    @ApiModelProperty(name = "创建时间",notes = "")
    @TableField(value="create_time")
    private LocalDateTime createTime ;
    /** 修改人 */
    @ApiModelProperty(name = "修改人",notes = "")
    @TableField(value = "update_user")
    private Long updateUser ;
    /** 修改时间 */
    @ApiModelProperty(name = "修改时间",notes = "")
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime ;
}