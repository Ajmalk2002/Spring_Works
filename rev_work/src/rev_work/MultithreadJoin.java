package rev_work;

class PaymentTask extends Thread{
	
	public void run() {
		System.out.println("Thread Started");
		try {
			Thread.sleep(2000);
		}catch (Exception e){
			
		}
		System.out.println("Completed");
	}
	
}

class InvoiceTask extends Thread {
	

	public void run() {
		System.out.println("Invoice generated");
	}
	
}

public class MultithreadJoin {
	
	public static void main(String[] args) throws InterruptedException {
		PaymentTask p2 = new PaymentTask();
		InvoiceTask I1 = new InvoiceTask();
		
		p2.start();
		
		p2.join();
		
		I1.start();
	}

}
