package com.hf.basic.message.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hf.basic.message.entity.SysMessage;
import com.hf.basic.message.mapper.SysMessageMapper;
import com.hf.basic.message.service.SysMessageService;
import org.springframework.stereotype.Service;


@Service
public class SysMessageServiceImpl extends ServiceImpl<SysMessageMapper, SysMessage> implements SysMessageService {
   @Override
    public void add(SysMessage sysMessage){
       this.save(sysMessage);
   }

}
