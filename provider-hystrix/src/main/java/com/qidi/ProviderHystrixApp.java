package com.qidi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created with IntelliJ IDEA.
 * User: qidi
 * Date: 2018/8/1
 * Time: 下午2:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //启动服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ProviderHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApp.class, args);
    }
}
