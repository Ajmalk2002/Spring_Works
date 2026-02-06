package com.reflection;

import java.lang.Class;
import java.lang.reflect.*;

public class ReflectiononMethods {

	public static void main(String[] args) {
		
		try {
			Dog d1 = new Dog();
			
			Class obj = d1.getClass();
			
			Method[] methods = obj.getDeclaredMethods();
			
			for(Method m :methods) {
				
				System.out.println("Method Name : " + m.getName());
				
				int modifier = m.getModifiers();
				System.out.println("Modifier :" + Modifier.toString(modifier));
				
				System.out.println("Return Types : " + m.getReturnType());
				System.out.println(" ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
