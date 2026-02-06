package rev_work;

abstract class Test{
	abstract void m1();
	
	abstract void m2();
	
	abstract void m3();
}

abstract class Demo extends Test{
	void m1() {
		System.out.println("this is m1 check");
	}
	
	void m2() {
		System.out.println("this is m2 check");
	}
	
	void m3() {
		System.out.println("this is m3 check");
	}
};

class absDemo extends Demo{
	void m3() {
		System.out.println("m3 method");
	}
}    

public class AbstractDemo {
	
	public static void main(String[] args) {
		absDemo ab = new absDemo();
		ab.m1();
		ab.m2();
		ab.m3();
	}

}
