package com.log4j.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Log4jSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4jSampleApplication.class, args);
	
		Log4J2Conf logger=new Log4J2Conf();
		logger.performSomeTask();
		Log4J2Conf2 logger2=new Log4J2Conf2();
		logger2.performSomeTask();
		
	}
}
