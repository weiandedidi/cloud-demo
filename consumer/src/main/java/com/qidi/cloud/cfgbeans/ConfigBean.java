package com.qidi.cloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.qidi.rule.RandomRule_ZY;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @LoadBalanced 加入负载均衡立马No instances available for ip  因为它是通过ip计算的，不能用ip直接访问
 * 客户端配置负载均衡
 * User: qidi
 * Date: 2018/8/1
 * Time: 下午2:41
 */
@Configuration
public class ConfigBean { //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml

    @Bean
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    //选用服务器的方法
    @Bean
    public IRule myRule(){
//        return new RandomRule();
        return new RoundRobinRule();    //轮询    一旦有服务断掉，访问还是会打在断掉的服务上
//        return new RetryRule();
//        return new RandomRule_ZY();

    }
}
