package com.customexception.user;
import java.util.*;

import com.customexception.Blogic.HDFCBank;     // Specific class import
import com.customexception.Blogic.Bank;        // Interface import
import com.customexception.exception.*;

public class Clerk {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            Bank acc1 = new HDFCBank();  // Polymorphism ✓
            
            String option = "";
            do {
                System.out.println("1. DEPOSIT");
                System.out.println("2. WITHDRAW"); 
                System.out.println("3. BALANCE ENQUIRY");
                System.out.println("ENTER OPTION");
                option = sc.next();
                
                switch (option) {
                    case "1":
                        {
                            System.out.println("ENTER DEPOSIT AMOUNT");
                            double amt = sc.nextDouble();
                            acc1.deposit(amt);
                            acc1.balEnquiry();  // ✅ FIXED: balEnquiry()
                            break;
                        }
                    case "2":
                        {
                            System.out.println("ENTER WITHDRAW AMOUNT");
                            double amt = sc.nextDouble();
                            double wd = acc1.withdraw(amt);
                            System.out.println("WITHDRAW AMOUNT IS: " + wd);
                            acc1.balEnquiry();  // ✅ FIXED: balEnquiry()
                            break;
                        }
                    case "3":
                        {
                            acc1.balEnquiry();  // ✅ FIXED: balEnquiry()
                            break;
                        }
                    default:
                        System.out.println("INVALID OPTION");
                }
                System.out.println("DO YOU WANT TO CONTINUE (YES/NO)");
                option = sc.next();
            } while (option.equalsIgnoreCase("YES"));
        }
        catch (InvalidAmountException iae) {
            System.out.println(iae.getMessage());
        }
        catch (InsufficientFund insFund) {  // ✅ Fixed variable name
            System.out.println(insFund.getMessage());
        }
        catch (java.util.InputMismatchException ime) {
            System.out.println("Enter valid NUMBER!");
            if (sc != null) sc.nextLine();  // Clear invalid input
        }
        finally {
            if (sc != null) sc.close();  // Resource cleanup
        }
    }
}
