package com.hf.basic.file.config;

import io.minio.MinioClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "minio")
public class MinioConfig {
    /**
     * minio服务器地址
     */
    private String url;
    /**
     * 用户名
     */
    private String accessKey;
    /**
     * 密钥
     */
    private String secretKey;

    /**
     * 桶名称
     * @return
     */
    private String bucketName;

//    @SneakyThrows
    @Bean
//    @RefreshScope
    public MinioClient minioClient(){
        return MinioClient.builder().endpoint(url).credentials(accessKey,secretKey).build();
    }
}
