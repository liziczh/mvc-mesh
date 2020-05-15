# nut-archetype
#### Module

- api
- redis
- kafka
- ref
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
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>archetype-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<!--spring-redis-->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

##### kafka

```

```

##### ref

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
	<artifactId>archetype-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>archetype-redis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

##### service

```xml
<!--log-->
<dependency>
	<groupId>org.slf4j</groupId>
	<artifactId>slf4j-api</artifactId>
</dependency>
<!--base-jackson-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-jackson</artifactId>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>base-aop</artifactId>
</dependency>
<!--biz-->
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>archetype-api</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>archetype-dao</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
<dependency>
	<groupId>com.liziczh</groupId>
	<artifactId>archetype-redis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

##### web

```

```

##### mgm

```

```