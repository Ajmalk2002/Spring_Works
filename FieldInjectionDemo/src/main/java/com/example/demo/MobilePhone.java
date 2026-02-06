package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobilePhone {

	@Autowired
	private SimCard simcard;
	
	public void makeCall() {
		System.out.println(simcard.Conncet());
		System.out.println("making call");
	}
}
