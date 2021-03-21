# SpringCloud

[视频教程-bilibili](https://www.bilibili.com/video/av93813318)

MindManager
```text
MindManager 2020 v20.1.234 x32/x64 官方安装包（2020/03/05）// 非 China 特供版
http://dwnld.mindjet.com/stubs/Builds/MindManager2020.1/20_1_234/64Bit/MindManager 2020.msi
http://dwnld.mindjet.com/stubs/Builds/MindManager2020.1/20_1_234/32Bit/MindManager 2020.msi
key：MP20-888-MP11-AAA5-BBBB
中文界面设置：https://www.mindmanager.cn/rumenjiaocheng/language-mm2020.html
```

修改 hosts，C:\Windows\System32\drivers\etc\hosts
```text
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com
```

[Consul 注册中心](https://www.consul.io/downloads.html)  
相关命令：consul --version：查看版本信息 consul agent -dev：运行部署consul

[zipkin-server-exec 查看链路调用](https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/)  
管理界面：http://localhost:9411/zipkin/

nacos 注册中心与配置中心  
管理界面：http://localhost:8848/nacos/，用户名/密码：nacos/nacos

Sentinel 限流
管理界面：http://localhost:8848/nacos/，用户名/密码：sentinel/sentinel


[Seata-server 分布式事务](https://github.com/seata/seata/releases/download/v0.9.0/seata-server-0.9.0.zip)

## 工具
* JMeter
* RabbitMq
* Zookeeper
