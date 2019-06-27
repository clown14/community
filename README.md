## Spring boot学习

## 资料
[Spring 文档](https://spring.io/guides)  
[Spirng web 文档](https://spring.io/guides/gs/serving-web-content/)  
[es社区](https://elasticsearch.cn)  
[Bootstrap文档](https://v3.bootcss.com/getting-started/)  
[Github OAuth 文档](https://developer.github.com/apps/building-github-apps/creating-a-github-app/)  
[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)  


## 工具


## 脚本
```sql
CREATE TABLE USER
(
    ID integer AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID varchar(100),
    NAME varchar(50),
    TOKEN varchar(36),
    GMT_CREATE bigint,
    GMT_MODIFIED bigint
)
```