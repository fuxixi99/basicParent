package com.hf.basic.file.minio;

import com.hf.basic.file.fileApi.FileOperatorApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public class MinioFileOperator implements FileOperatorApi {
    @Autowired
    private MinioTemplate minioTemplate;
    @Override
    public void storageFile(String bucketName, String objectName, MultipartFile multipartFile) throws IOException {
       if(!minioTemplate.bucketExists(bucketName)){
           minioTemplate.createBucket(bucketName);
       }
       minioTemplate.putObject(bucketName,objectName, multipartFile.getInputStream(), multipartFile.getContentType() );

    }
}
