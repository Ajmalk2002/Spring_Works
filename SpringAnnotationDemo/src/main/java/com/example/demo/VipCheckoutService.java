package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VipCheckoutService {

	
	private final PaymentGateway  paymentGateway;
	
	public VipCheckoutService(@Qualifier("stripeGateway ") PaymentGateway paymentGateway) {
		this.paymentGateway=paymentGateway;
	}
	
	public void checkOut(double amount) {
		paymentGateway.pay(amount);
	}
}
