package com.customexception.Blogic;

import com.customexception.exception.InsufficientFund;
import com.customexception.exception.InvalidAmountException;

public class HDFCBank implements Bank {
    private double balance;
    
    // ✅ FIX: Constructor added
    public HDFCBank() {
        this.balance = 10000.0;
    }
    
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(amount + " is not valid");
        }
        balance += amount;
    }
    
    public double withdraw(double amount) throws InsufficientFund {
        if (balance < amount) {
            throw new InsufficientFund("Insufficient funds");
        }
        balance -= amount;
        return amount;
    }
    
    // ✅ FIX: Method name matches interface EXACTLY
    public void balEnquiry() {  // ← Changed from balanceEnquiry()
        System.out.println("Current balance = " + balance);
    }
}
