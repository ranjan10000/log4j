# log4j_sample
 Apache Log4j2 with Spring Boot
 
 # Apache Log4j 2
Apache Log4j 2 est une mise à niveau vers Log4j qui fournit des améliorations significatives par rapport à son prédécesseur, Log4j 1.x, et fournit plusieurs améliorations disponibles dans Logback tout en réparant certains problèmes inhérents à l'architecture de Logback. [ Read more ](https://logging.apache.org/log4j/2.0/index.html).
  
 # Log4J 2 Spring Boot Dependencies

 Exclude logback from default log dependency of Spring Boot
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter</artifactId>
	<exclusions>
		<exclusion>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-logging</artifactId>
		</exclusion>
	</exclusions>
</dependency>
```
– Add Log4j2 dependency

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-log4j2</artifactId>
</dependency>
```
 # Configure Log4j2.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration monitorInterval="60">
    <Properties>
        <Property name="path">logs</Property>
    </Properties>
    <Appenders>
        <Console name="Console-Appender" target="SYSTEM_OUT">
            <PatternLayout>
                <pattern>
                    [%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
                </pattern>>
            </PatternLayout>
        </Console>
        <File name="App-Appender" fileName="${path}/app_log.log" >
            <PatternLayout>
                <pattern>
                    [%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
                </pattern>
            </PatternLayout>
        </File>
        <File name="SpringBoot-Appender" fileName="${path}/springboot_log.log" >
            <PatternLayout>
                <pattern>
                    [%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
                </pattern>
            </PatternLayout>
        </File>
    </Appenders>
    <Loggers>
        <Logger name="org.springframework.web" level="info" additivity="false">
            <AppenderRef ref="SpringBoot-Appender"/>
            <AppenderRef ref="Console-Appender"/>
        </Logger> 
        <Logger name="com.log4j.sample.Log4J2Conf" level="info" additivity="false">
            <AppenderRef ref="App-Appender"/>
            <AppenderRef ref="Console-Appender"/>
         </Logger>
        <Root>
            <AppenderRef ref="Console-Appender"/>
        </Root>
    </Loggers>
</Configuration>
```
- You can use log4js2 with:

1.  Log4J 2 Configuration: Using Properties File

2. Log4J 2 Configuration: Using XML

3.  Log4J 2 Configuration: Using JSON

4. Log4J 2 Configuration: Using YAML
