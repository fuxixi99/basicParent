package com.hf.basic.message.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hf.basic.message.entity.SysMessage;
import com.hf.basic.message.mapper.SysMessageMapper;
import com.hf.basic.message.service.SysMessageService;
import com.hf.basic.rule.pojo.response.ResponseData;
import com.hf.basic.rule.pojo.response.SuccessResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Leo
 * @since 2023-09-12
 */
@Slf4j
@RestController
@RequestMapping("/sysMessage")
public class SysMessageController {
    @Autowired
    private SysMessageService sysMessageService;
    @Autowired
    private SysMessageMapper sysMessageMapper;
    @PostMapping("/add")
    public ResponseData<?> add(@RequestBody SysMessage sysMessage){
        sysMessageService.save(sysMessage);
        return new SuccessResponseData<>();
    }

    @GetMapping("/list")
    public ResponseData<?> list(){
        LambdaQueryWrapper<SysMessage> queryWrapper=new LambdaQueryWrapper<>();
        return new SuccessResponseData<>(sysMessageService.list(queryWrapper));
    }

}
