# Springboot-Cloud-
Spring-Boot cloud application development .
Spring framework is widely use Java framework out there and it makes web and microservices application development a lot easy for Java developers.

Spring framwork provide Java developers with spring-boot a branche of or sub-project of spring framework .
The features of spring-boot helps Java developers or spring developers to become more productive because it comes with pre-configurations,dependencis .

You can build spring application but accessing https://start.spring.io/ there you  can select the language you will love to use and build tool to use .

You can use Java,Kotlin,Groovy and Scala for spring and spring-boot applicaiton development and for the build tool you can select maven or gradle.

And don't forget we need JDK too so the supported JDK versions are listed there you just need to select the version you have on your system. And after that you need to add your dependencies to the project . 

spring-boot comes with in built server example tomcat server so you don't need applicaiton server like Java EE or Jakarta EE does .

In this simple project  i use couple of spring dependencies and the tools i used.
For the development tools

1. Eclipse IDE
2. Mysql DB
3. Maven
4. Brave Brower
5. Postman for testing apis

For Spring Dependencies 
1. spring-boot-starter-web
2. spring-boot-starter-data-jpa
3. mysql-connector-java
4. spring-cloud-function-web
5. spring-cloud-starter
6. spring-cloud-starter-task
7. spring-boot-starter-test
8. junit-vintage-engine

Spring-boot applications needs to be configured.
application.properties configuration.

spring.datasource.url=jdbc:mysql://localhost:3306/springcloud
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect

I only configured my database which is mysql db .

By Mark Kpodo Enjoy.
