## 这个是生产者项目

这个项目是实现了数据库动态加载配置中心的项目。 DB使用的是spring-boot-data-jpa,干净卫生你懂的。 额外的框架可以自己加

## 主要包解释

### config包

为了实现动态刷新数据库配置写的

## controller

springboot 的路由，懂的都懂，就是个正常路由

## db

用来坐jpa的持久化，你可以换别的orm

## service

使用了jpaDSL做复杂查询， 写了个样例



