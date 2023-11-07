package com.mindgate.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class HrPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPortalApplication.class, args);
		System.out.println("application running");
	}

}
