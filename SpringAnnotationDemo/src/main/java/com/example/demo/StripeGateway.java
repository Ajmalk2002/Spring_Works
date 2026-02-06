package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StripeGateway implements PaymentGateway{

	@Override
	public void pay(double amount) {
		System.out.println("paid " +amount + " Using stripe");
	}
}
