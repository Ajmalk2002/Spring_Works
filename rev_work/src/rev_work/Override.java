package rev_work;


class Parent{
	void marryme() {
		System.out.println("This is to marry me");
	}
	
	void parent() {
		System.out.println("this is parent class");
	}
}

class Child extends Parent{
	void marryme() {
		System.out.println("THIS is Demo override");
	}
}
public class Override {
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.marryme();
		ch.parent();
		
		
		Parent p = new Parent();
		
		p.parent();
		p.marryme();
		
		Parent p1= new Child(); // this is for override Polymorphism
		p1.parent();
		p1.marryme();
		
	}

}
