package com.qidi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * User: qidi
 * Date: 2018/8/1
 * Time: 下午2:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //启动服务发现
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
