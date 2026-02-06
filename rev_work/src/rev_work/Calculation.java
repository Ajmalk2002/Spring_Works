package rev_work;

public class Calculation {
	public int max (int num1, int num2) {
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	public static void main(String[] args) {
		Calculation	 calc = new Calculation();
		int max = calc.max(100, 200);
		
		System.out.print(max);
	}

}
