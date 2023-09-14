package com.hf.basic.file;

import com.hf.basic.file.fileApi.FileOperatorApi;
import com.hf.basic.rule.pojo.response.ResponseData;
import com.hf.basic.rule.pojo.response.SuccessResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileOperatorApi fileOperatorApi;
    /**
     * 上传文件
     */
    @GetMapping("/upload")
    public ResponseData<?> uploadFile(@RequestParam("uploadFile") MultipartFile uploadFile) throws IOException {
        //1, 上传文件
        fileOperatorApi.storageFile("hfbasictest", uploadFile.getName(),uploadFile );
        //2. 保存文件信息到文件表里，建表，
        //3. 获取文件下载url,返回给前端。
        return new SuccessResponseData<>();
    }
}
