package com.qidi.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: qidi
 * Date: 2018/8/1
 * Time: 下午2:17
 */
@Configuration
@MapperScan(value = "com.qidi.cloud.dao")
public class MybatisConfig {

}
