package rev_work;

public class Poly {
	
	void one() {
		System.out.println("One");
	}
	
	void two() {
		System.out.println("Two");
	}

}

class Polymorphism extends Poly{
	
	public static void main(String[]args) {
	Poly py = new Poly();
	
	py.one();
	py.two();
	}
}


