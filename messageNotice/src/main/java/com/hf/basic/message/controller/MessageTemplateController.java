package com.hf.basic.message.controller;

import com.hf.basic.message.entity.MessageTemplate;
import com.hf.basic.message.entity.SysMessage;
import com.hf.basic.message.service.MessageTemplateService;
import com.hf.basic.rule.pojo.response.ResponseData;
import com.hf.basic.rule.pojo.response.SuccessResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/messageTemplate")
public class MessageTemplateController {
    @Autowired
    private MessageTemplateService messageTemplateService;
    @PostMapping("/add")
    public ResponseData<?> add(@RequestBody MessageTemplate messageTemplate){
        messageTemplateService.save(messageTemplate);
        return new SuccessResponseData<>();
    }

    @GetMapping("list")
    public ResponseData<?> list(){
        return new SuccessResponseData<>(messageTemplateService.list());
    }
}
