package com.example.demo;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAnnotationDemoApplication {

    private final InternationalCheckoutService internationalCheckoutService;

    SpringAnnotationDemoApplication(InternationalCheckoutService internationalCheckoutService) {
        this.internationalCheckoutService = internationalCheckoutService;
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationDemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runDemo(
			CheckOutService checkOutService,
			InternationalCheckoutService internationalCheckoutService,
			VipCheckoutService vipCheckoutService) {
		return args ->{
			System.out.println("Spring Annotation started");
			checkOutService.checkout(1000);
			internationalCheckoutService.checkOut(4000);
			vipCheckoutService.checkOut(8000);
			
			System.out.println("Annotation ends");
		};
	}

}
