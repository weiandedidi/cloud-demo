package com.qidi.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 需求：
 *      轮询，每个service调用五次
 * User: qidi
 * Date: 2018/8/2
 * Time: 下午7:16
 */
@Configuration
public class MyConfigRule {
    @Bean
    public IRule myRule(){

//        return new RandomRule();
        return new RandomRule_ZY();
    }
}
