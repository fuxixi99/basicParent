package com.hf.basic.message.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hf.basic.message.entity.SysMessage;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface SysMessageMapper extends BaseMapper<SysMessage> {
//    List<Map<String,Object>> getList();
}