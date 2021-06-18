# mvc-mesh
#### Module

- api
- redis
- ref
- kafka
- dao
- service
- web
- mgm

##### api

```xml
<!--base-common-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-common</artifactId>
</dependency>
```

##### redis

```xml
<!--spring-redis-->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

##### ref

```xml
<!--web-->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

##### kafka

```

```

##### dao

```xml
<!-- jdbc -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
<!--mysql-->
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency>
<!-- druid -->
<dependency>
	<groupId>com.alibaba</groupId>
	<artifactId>druid-spring-boot-starter</artifactId>
</dependency>
<!-- mybatis -->
<dependency>
	<groupId>org.mybatis.spring.boot</groupId>
	<artifactId>mybatis-spring-boot-starter</artifactId>
</dependency>
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-redis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

##### service

```xml
<!--base-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-service</artifactId>
</dependency>
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-mybatis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-redis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-ref</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

##### web

```XML
<!--swagger-->
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
</dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
</dependency>
<!--base-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-mvc</artifactId>
</dependency>
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-service</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

##### mgm

```xml
<!--base-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-swagger</artifactId>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-mvc</artifactId>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-service</artifactId>
</dependency>
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-mybatis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-redis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>mvc-mesh-ref</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```
