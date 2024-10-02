package com.Static;

/* 1. Write a class with 2 static variables, 2 Instance variables, 2 static
 methods, 2 instance methods and a main method. */
//2. Print instance variables in static methods 
//3. Print static variables in Instance methods 
//4. Call instance methods in static methods 
// 5. Call static methods in instance methods 
// 6. Print all the static, instance variables in main method 
// 7. Call static methods and instance methods in main method

public class Static {
	// 2 static variables
	static int stv1 = 10;
	static int stv2 = 15;

	// 2 instance variable
	int inv1 = 20;
	int inv2 = 25;

	// static method 1
	static void staticmethod1() {

		Static obj = new Static();// creating obj

		// 2. printing instance variable in static methods
		System.out.println("Instance variables are : " + obj.inv1 + " and " + obj.inv2);
	}

	// instance method 1
	void instancemethod1() {
		// 3. printing static variable in instance method
		System.out.println("Static variables are :" + stv1 + " and " + stv2);
	}

	// static method2
	static void staticmethod2() {
		// 4. Call instance methods in static methods
		Static obj = new Static();
		obj.instancemethod1();

	}

	// instance method 2
	void instancemethod2() {
		// 5. Call static methods in instance methods
		staticmethod1();
	}

	public static void main(String[] args) {
		Static obj2 = new Static();
		// 6. Print all the static, instance variables in main method
		System.out.println("Instance variable 1 : " + obj2.inv1);

		System.out.println("Instance variable 2 : " + obj2.inv2);

		System.out.println("Static variable 1 : " + stv1);

		System.out.println("Static variable 2 : " + stv2);

		// 7. Call static methods and instance methods in main method
		// calling static method
		staticmethod1();
		staticmethod2();
		// calling instance method
		obj2.instancemethod1();
		obj2.instancemethod2();

	}

}
