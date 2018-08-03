-- 建表
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门号码',
  `dname` varchar(60) DEFAULT NULL COMMENT '部门名',
  `db_source` varchar(60) DEFAULT NULL COMMENT '数据源头',
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- 插入数据
insert into dept (dname,db_source) values('人事部',DAtabase());
insert into dept (dname,db_source) values('开发部',DAtabase());
insert into dept (dname,db_source) values('财务部',DAtabase());
insert into dept (dname,db_source) values('市场部',DAtabase());
insert into dept (dname,db_source) values('运维部',DAtabase());