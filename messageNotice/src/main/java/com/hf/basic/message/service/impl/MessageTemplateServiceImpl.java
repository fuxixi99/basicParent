package com.hf.basic.message.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hf.basic.message.entity.MessageTemplate;
import com.hf.basic.message.mapper.MessageTemplateMapper;
import com.hf.basic.message.service.MessageTemplateService;
import org.springframework.stereotype.Service;

@Service
public class MessageTemplateServiceImpl extends ServiceImpl<MessageTemplateMapper, MessageTemplate> implements MessageTemplateService {
}
