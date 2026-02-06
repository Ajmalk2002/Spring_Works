package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CheckOutService {

	
	private final PaymentGateway paymentGatway;
	
	
	public CheckOutService(PaymentGateway paymentGateway) {
		this.paymentGatway=paymentGateway;
	}
	
	public void checkout(double amount) {
		paymentGatway.pay(amount);
	}
}
