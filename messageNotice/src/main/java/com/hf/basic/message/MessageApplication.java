package com.hf.basic.message;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
//scanBasePackages = {"com.hf.basic.message"}
@ServletComponentScan
//@EnableTransactionManagement
//@MapperScan("com.hf.basic.message.mapper")
//@ComponentScan(basePackages = {
//        "com.hf.basic.message.*"})
@EnableConfigurationProperties //开启服务的注册
public class MessageApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class,args);
    }
}
