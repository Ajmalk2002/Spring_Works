package rev_work;

class Payment{
	void pay(double amount) {
		System.out.println("The payable amount for this is " + amount);
	}
}

class CreditPay extends Payment{
	void pay(double amount) {
		System.out.println("This is credit caard amount" + amount);
		System.out.println("Steps -> OTP");
	}
}

class UPIPay extends Payment{
	void pay(double amount) {
		System.out.println("This is for UPI" + amount);
		System.out.println("Steps -> UPI Id");
	}
}

public class Override2 {
	
	public static void main(String[] args) {
		Payment p1 = new CreditPay();
		p1.pay(5000);
		
		Payment p2 = new UPIPay();
		p2.pay(2500);
		
		
	
		
	}

}
