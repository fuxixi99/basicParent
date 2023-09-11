package com.hf.basic.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {"com.hf.basic.file"})
//@MapperScan("com.hf.basic")
@EnableConfigurationProperties //开启服务的注册
public class FileSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileSysApplication.class,args);
    }
}
