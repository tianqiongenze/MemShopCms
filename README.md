# MemShop-Cms 微会员商城基础后台

提醒：微会员商城基础后台项目，系个人参考网络相关资源，学习基于Spring Cloud Alibaba 和Dubbo体系微服务架构的练习，不能作为生产使用。
## 开发工具

--------
Intellij IDEA 

SwitchHosts 

Postman 

dbForge Studio for MySQL 

## 商业组件

服务 | 说明 | 地址
----|----|----
Aliyun SDK OSS | 阿里云对象存储服务 | [官网](https://help.aliyun.com/product/31815.html?spm=a2c4g.750001.list.19.3cce7b13L4uLgg)

## 后端技术

技术 | 说明 | 地址
----|----|----
Spring Boot | 新一代 JavaEE 开发标准 
Spring Cloud Alibaba | 阿里巴巴基于 Spring Cloud 编程模型的微服务生态
Spring Cloud Alibaba Dubbo | 与 Spring Cloud Alibaba 生态相结合的高性能 Java RPC 框架 
Spring Cloud Alibaba Nacos  |Spring Cloud 微服务服务注册发现实现组件
Spring Cloud Alibaba RocketMQ | 分布式消息系统 
Spring Security oAuth2 | 安全认证和授权框架 
TkMyBatis | 基于 MyBatis 二次开发的轻量级框架，用于简化 MyBatis 操作 
MyBatisGenerator | Maven 插件，用于 MyBatis 相关代码生成 
MybatisCodeHelper | Intellij IDEA 插件，用于 MyBatis 相关代码生成 
PageHelper | MyBatis 分页插件 | [GitHub](https://github.com/pagehelper/Mybatis-PageHelper)
Swagger | API 文档生成工具 | [GitHub](https://github.com/swagger-api/swagger-ui)
HikariCP | 数据库连接池 | [GitHub](https://github.com/brettwooldridge/HikariCP)
Docker | 容器化引擎 | [官网](https://www.docker.com/)
Docker Compose | 容器编排工具 | [官网](https://docs.docker.com/compose/)
Kubernetes | 容器编排系统 | [官网](https://kubernetes.io/)
TiDB | 分布式数据库 | [官网](https://pingcap.com/)
OKHttp3 | 轻量级网络框架 | [GitHub](https://github.com/square/okhttp)
OpenFeign | 声明式 HTTP 客户端 | [GitHub](https://github.com/OpenFeign/feign)
UserAgentUtils | 用户代理检查工具 | [GitHub](https://github.com/HaraldWalker/user-agent-utils)

## 前端技术

技术 | 说明 | 地址
----|----|----
Vue | 前端框架，MVVM 模式的实现者 | [GitHub](https://github.com/vuejs/vue)
Vue CLI | Vue 脚手架，基于 NodeJS | [GitHub](https://github.com/vuejs/vue-cli)
Vue Router | Vue 路由框架 | [GitHub](https://github.com/vuejs/vue-router)
Vuex | Vue 全局状态管理框架 | [GitHub](https://github.com/vuejs/vuex)
Axios | 前端 HTTP 框架 | [GitHub](https://github.com/axios/axios)
Element UI | 饿了么 UI 框架 | [官网](https://element.eleme.cn)
Vue Element Admin | 基于 Element UI 的前端后台解决方案 | [GitHub](https://github.com/PanJiaChen/vue-element-admin)
Vue Image Crop Upload | Vue 图片剪裁上传组件 | [GitHub](https://github.com/dai-siki/vue-image-crop-upload)

# 后台功能清单

### 后台登录

功能 | 完成 
----|----
用户注册 | ✔ 
用户登录 | ✔ 
获取 Token | ✔ 

### 个人信息

功能 | 完成 
----|----
查看信息 | ✔ 
更新信息 | ✔ 
更新密码 | ✔ 
更新头像 | ✔ 

### 权限管理

角色 | 菜单 
----|----
超级管理员 | 所有菜单权限 
运营人员 | 首页、用户、促销、运营、内容 

功能 | 说明 | 完成 
----|----|----
权限管理 | 添加权限、删除权限、修改权限、以树形结构返回权限 | 
角色管理 | 添加角色、删除角色、更新角色、角色列表、获取角色权限、修改角色权限 | 
成员管理 | CRUD、为成员分配角色、获取成员角色、权限分配、获取权限列表 | 

# 前台功能清单

功能 | 完成 
----|----
用户注册 | ✔
用户登录 | ✔ 
获取 Token | ✔ 

头像上传 | ✔

## 后台服务规划

### 数据访问

服务名 | 端口 | 说明 
----|----|----
manager-service-provider | 随机 | 管理员服务提供者 
manager-login-log-service-provider | 随机 | 管理员登录日志服务提供者   

### 业务逻辑

服务名 | 端口 | 说明 
----|----|----
reg-business | 9000 | 注册业务服务
oauth2-business | 9001 | 认证业务服务
profile-business | 9002 | 个人信息管理服务

### 云服务

服务名 | 端口 | 说明 
----|----|----
upload-on-cloud | 10001 | 文件上传服务
message-center | 10002 | 消息队列服务 

### 消息队列

服务名 | 端口 | 说明 
----|----|----
message-admin-login-log | 20001 | 管理员登录日志消费者 

### 网关

服务名 | 端口 | 说明 
----|----|----
gateway | 8888 | Spring Cloud Gateway

备注：以上所有服务均既提供基于Http协议的Rest风格的服务API，也提供基于RPC协议的Dubbo服务：

    1、其中有的Dubbo服务消费者同时又提供Rest服务
    
    2、对外部经网关访问的服务使用Http协议
    
    3、内部各微服务模块之间经网关访问的服务使用Dubbo协议。
## 基础设施部署规划（测试环境）
### Docker
### Kubernetes

| 主机名               | IP                 | 角色   | CPU/MEM | 磁盘     |
| -------------------- | ------------------ | ------ | ------- | -------- |
| kubernetes\-master   | 177\.17\.225\.179 | Master | 2 核 2G | 20G      |
| kubernetes\-node\-01 | 177\.17\.225\.180 | Node   | 2 核 4G | 20G + 40G      |
| kubernetes\-node\-02 | 177\.17\.225\.181 | Node   | 2 核 4G | 20G + 40G      |    |
# MemShopCms
