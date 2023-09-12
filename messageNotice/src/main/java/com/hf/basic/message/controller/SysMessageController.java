package com.hf.basic.message.controller;


import com.hf.basic.message.entity.SysMessage;
import com.hf.basic.message.mapper.SysMessageMapper;
import com.hf.basic.message.service.SysMessageService;
import com.hf.basic.rule.pojo.response.ResponseData;
import com.hf.basic.rule.pojo.response.SuccessResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Leo
 * @since 2023-09-12
 */
@Controller
@RequestMapping("/sys-message")
public class SysMessageController {
    @Autowired
    private SysMessageService sysMessageService;
    @Autowired
    private SysMessageMapper sysMessageMapper;
    @PostMapping("/add")
    public ResponseData<?> add(SysMessage sysMessage){
        sysMessageMapper.insert(sysMessage);
        return new SuccessResponseData<>();
    }

    @GetMapping("/list")
    public ResponseData<?> list(){
        return new SuccessResponseData<>(sysMessageMapper.getList());
    }
}
