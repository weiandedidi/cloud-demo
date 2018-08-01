package com.qidi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * User: qidi
 * Date: 2018/8/1
 * Time: 下午3:23
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurakaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(EurakaServerApp.class, args);
    }
}
