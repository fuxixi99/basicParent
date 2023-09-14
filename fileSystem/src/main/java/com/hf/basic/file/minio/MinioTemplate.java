package com.hf.basic.file.minio;

import com.hf.basic.file.config.MinioConfig;
import io.minio.*;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Component
public class MinioTemplate {
    @Autowired
    private MinioClient minioClient;

    @Autowired
    private MinioConfig minioConfig;

    private static final String TMP_DIR;
    /**
     * 判断桶是否存在
     */
    public Boolean bucketExists(String bucketName){
        Boolean bucketExists;
        try{
            bucketExists=minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return bucketExists;
    }

    /**
     * 创建桶
     */
    public Boolean createBucket(String bucketName){
        try{
            minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 删除桶
     */
    public Boolean removeBucket(String bucketName){
        try {
            minioClient.removeBucket(RemoveBucketArgs.builder().bucket(bucketName).build());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 添加文件到桶,多种方式,基础方式
     */
    public Boolean putObject(String bucketName, String objectName, InputStream stream,String contextType){
        try{
            minioClient.putObject(PutObjectArgs.builder().bucket(bucketName).object(objectName).stream(stream,(long) stream.available(),-1).contentType(contextType).build());
        } catch (Exception e){
            e.printStackTrace();
            return  false;
        }
        return  true;
    }
    /**
     * 添加文件到桶,只提供文件原本名和文件输入流
     */
    public void putObject(String objectName, InputStream stream,String contextType) {
        this.putObject(minioConfig.getBucketName(), objectName, stream,contextType);
    }
    /**
     * 从桶移除文件
     */
    public void removeObject(String bucketName,String objectName){
        try {
            minioClient.removeObject(RemoveObjectArgs.builder().bucket(bucketName).object(objectName).build());
        } catch (Exception e) {
           e.printStackTrace();
           throw new RuntimeException(e);
        }
    }
    /**
     * 从桶移除文件
     */
    public void removeObject(String objectName) {
        this.removeObject(minioConfig.getBucketName(), objectName);
    }
    /**
     * 从桶获取文件输入流
     */
    public InputStream getStream(String bucketName,String objectName){
        try {
            return minioClient.getObject(GetObjectArgs.builder().bucket(bucketName).object(objectName).build());
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    /**
     * 从桶获取文件
     */
    public File getFile(String bucketName,String objectName) throws IOException {
        InputStream in=this.getStream(bucketName, objectName);
        File dir=new File(TMP_DIR);
        if(!dir.exists()||dir.isFile()){
            dir.mkdirs();
        }
        File file=new File(TMP_DIR+objectName);
        FileUtils.copyInputStreamToFile(in,file);
        in.close();
        return file;

    }
    /**
     * 从桶获取文件
     */
    public File getFile(String objectName) throws IOException {
        return this.getFile(minioConfig.getBucketName(), objectName);
    }
    static {
        TMP_DIR = System.getProperty("java.io.tmpdir") + File.separator;
    }
}
