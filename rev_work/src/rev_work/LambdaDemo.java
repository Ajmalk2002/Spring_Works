package rev_work;

public class LambdaDemo {

	public static void main(String[] args) {

		// without lambda

//		Runnable task=new Runnable() {
//			public void run() {
//				System.out.println(" Hello from Task");
//			}
//		};
//		
//		task.run();

		// using lambda

//		Runnable task = () -> System.out.println(" with lambda ");
//		task.run();
//		

		// method reference with non static method

		LambdaDemo ld = new LambdaDemo();
//		
//		Runnable task =() -> System.out.println();
//		
//		Runnable task = ld::sayHello;
//		
//		// :: it is reference method
//		//Runnable task = ld :: nonStatic;
//		Thread t1 = new Thread(task);
//		
//		t1.start();
		
		

	}

	static void SayHello() {
		System.out.println("Hey welcome to this show");
	}

	void nonStatic() {
		System.out.println("This is non static show");
	}
}
