package com.qidi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created with IntelliJ IDEA.
 * User: qidi
 * Date: 2018/8/7
 * Time: 上午11:12
 */
@SpringBootApplication
@EnableZuulProxy    //默认加入发现@EnableDiscoveryClient和@EnableCircuitBreaker
public class ZuulGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApp.class, args);
    }
}
