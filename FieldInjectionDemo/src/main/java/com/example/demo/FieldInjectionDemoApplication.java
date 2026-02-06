package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FieldInjectionDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FieldInjectionDemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(FieldInjectionDemoApplication.class, args);
		MobilePhone mobilePhone = context.getBean(MobilePhone.class);
		mobilePhone.makeCall();
	}

}
