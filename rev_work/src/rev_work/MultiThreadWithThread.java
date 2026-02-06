package rev_work;

class PrintNumbers extends Thread{
	 
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(getName() + "->" + i);
		}
	}
}

public class MultiThreadWithThread {
	
	public static void main(String[] args) {
		PrintNumbers p = new PrintNumbers();
		p.setName("Thread 1");
		p.start();
	}

}
