###项目梗概  

这个项目是个微服务小项目，整合了常见的工具 同时也是为了把 provider和consumer的pom独立开。直接clone想要的项目就可以直接下载依赖，不用整个都弄下来。 然后根据项目需要的引入依赖。这个可以当脚手架用，然后注册中心是nacos 2.0.4  
### 注册中心：nacos  
### 网关服务：spring-cloud-gateway  
###  JPA：spring-boot-data-jpa

gateway：网关项目。 引入了nacos config做配置， 使用spring-cloud-gateway 进行做网关控制，实现了动态刷新路由，配置中心在application.yaml里面  
  
consumer: 典型的消费者项目， 同时使用了openFeign调用provider，简单直接  

loginService: 这就是生产者项目， 使用了spring-boot-data-jpa， 然后实现了数据库配置动态加载刷新。因为放在了配置中心。配置中心的内容在application.yaml里面