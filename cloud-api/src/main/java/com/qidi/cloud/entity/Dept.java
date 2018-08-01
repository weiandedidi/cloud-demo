package com.qidi.cloud.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: qidi
 * Date: 2018/8/1
 * Time: 上午11:20
 */
@Data
@Accessors(chain=true)      //链式构造
public class Dept implements Serializable {
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

}
