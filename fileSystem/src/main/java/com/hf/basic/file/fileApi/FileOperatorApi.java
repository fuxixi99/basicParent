package com.hf.basic.file.fileApi;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileOperatorApi {
    void storageFile(String bucketName, String objectName, MultipartFile multipartFile) throws IOException;
}
