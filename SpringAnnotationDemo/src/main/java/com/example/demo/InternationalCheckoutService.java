package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InternationalCheckoutService {

	private final PaymentGateway paymentGateway;
	
	public InternationalCheckoutService(@Qualifier("paypalGateway") PaymentGateway paymentGateway) {
		this.paymentGateway=paymentGateway;
	}
	
	public void checkOut(double amount) {
		paymentGateway.pay(amount);
	}
	
}
