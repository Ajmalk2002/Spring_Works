package com.customexception.Blogic;

import com.customexception.exception.InsufficientFund;
import com.customexception.exception.InvalidAmountException;

public interface Bank {
	void deposit(double amount) throws InvalidAmountException;
	
	double withdraw(double amount) throws InsufficientFund;
	
	void balEnquiry();

}
