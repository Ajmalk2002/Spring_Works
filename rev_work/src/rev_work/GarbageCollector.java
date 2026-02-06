package rev_work;

public class GarbageCollector {
	
	public void finalize() {
		System.out.println("Garbage collection is worked");
	}
	
	public static void main(String[] args) {
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();
		
		System.out.println(g1);
		System.out.println(g2);
		
		g1=null;
		g2=null;
		
		System.out.println(g1);
		System.out.println(g2);
		
		System.gc();
	}

}
