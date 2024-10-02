package com.Java_Practice;

// 1. How to create a class, object, method and its signature

// class creation
public class ClassObjectsMethods {
	// creation of method
	public void methodOfClass() {
		System.out.println("This is method created in class");
	}
	
	
	public void method2 (String name) {
		System.out.println("My Name is " + name) ;
	}

	public static void main(String[] args) {
		// object creation
		ClassObjectsMethods obj = new ClassObjectsMethods();
		// calling the object we created
		obj.methodOfClass();
		obj.method2(" Prabhavathi ");
	}

	
	
}
