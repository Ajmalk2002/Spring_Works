package rev_work;

class LoadMenu implements Runnable {
	
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Menu loading " + i + "|" + Thread.currentThread());
		}
	}
}

class LoadOffer implements Runnable{
	
	
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Offer Loading " + i + "|" + Thread.currentThread());
		}
	}
	
}
public class MultiThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new LoadMenu(),"Menu- Thread");
		Thread t2 = new Thread(new LoadOffer(),"Offer- thread");
		
		t1.start();
		t2.start();
		
	}
}
