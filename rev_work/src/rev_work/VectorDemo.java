package rev_work;

import java.util.*;
public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<String> tickets = new Vector<>();
		
		tickets.add("TK001");
		tickets.add("TK002");
		tickets.add("TK003");
		
		System.out.println("Initial Tickets :" + tickets);
		
		tickets.add(1,"TK005");
		
		System.out.println("Updated Tickets :" + tickets);
		
		System.out.println("Total tickets: " + tickets.size());
		
		System.out.println("Contains TK002? " + tickets.contains("TK002"));
		
		System.out.println("Ticket at index 2: " + tickets.get(2));
		
		tickets.set(2, "TKT2002");
		
		System.out.println("Updated Tickets :" + tickets);
		
		System.out.println("Index of TK003: " + tickets.indexOf("TK003"));
		
		tickets.remove("TK001");
		
		System.out.println("Updated Tickets :" + tickets);
		
		


		
	}

}
