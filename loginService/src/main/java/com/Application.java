package com;//import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;


@SpringBootApplication
@EnableDiscoveryClient
//@MapperScan("com.db.mapper")
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class);
    }
}
