package com.hf.basic.file;

import com.hf.basic.rule.pojo.response.ResponseData;
import com.hf.basic.rule.pojo.response.SuccessResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/")
public class FileController {
    @GetMapping("product/provider/get")
    public ResponseData<?> selectById(@RequestParam Long id){
        return new SuccessResponseData<>(id);
    }
}
