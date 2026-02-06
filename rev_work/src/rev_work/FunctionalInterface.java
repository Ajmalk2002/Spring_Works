package rev_work;

import java.time.temporal.TemporalAmount;

interface DiscountRule{
	double apply(double cartAmount);
}

class DiscountService{
	public double finalAmount(double cartAmount, DiscountRule rule) {
		return cartAmount-rule.apply(cartAmount);
	}
}

public class FunctionalInterface {

	public static void main(String[] args) {
		DiscountService ds = new DiscountService();
		
		DiscountRule festivalDiscount = amount -> amount * 0.10;
		DiscountRule premiumDiscount = amount -> amount * 0.15;
		
		System.out.println("After festival discount " + ds.finalAmount(2000, festivalDiscount));
		System.out.println("After  Premium discount final Amount "+ ds.finalAmount(2000, premiumDiscount));

		
	}
	
}
