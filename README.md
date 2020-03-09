# Springboot-Cloud-
Spring-Boot cloud application development.
Spring framework widely use Java framework out there and it makes web and microservices application development a lot easy for Java developers.
Spring framework provides Java developers with spring-boot a branch of or sub-project of spring framework.
The features of spring-boot help Java developers or spring developers to become more productive because it comes with pre-configurations, dependencies.
You can build spring application by accessing https://start.spring.io/ there you can select the language you will love to use and build tools to use.
You can use Java, Kotlin, Groovy, and Scala for spring and spring-boot application development and for the build tool you can select maven or Gradle.
And don't forget we need JDK too so the supported JDK versions are listed there you just need to select the version you have on your system. And after that, you need to add your dependencies to the project.
spring-boot comes with an inbuilt server example tomcat server so you don't need an application server like Java EE or Jakarta EE does.
In this simple project, I use a couple of spring dependencies, and I have listed the tools and dependencies for the project.
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
I only configured my database which is mysql db .
By Mark Kpodo Enjoy.
