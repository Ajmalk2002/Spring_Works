package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PaypalGateway  implements PaymentGateway{
	
	@Override
	public void pay(double amount) {
		System.out.println("paid " + amount + " using paypal");
	}

}
