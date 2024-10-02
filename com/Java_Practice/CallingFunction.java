package com.Java_Practice;
// 6. Write a function to print your name and call the function from main method
public class CallingFunction {
	public void function() {
		String name = "Prabhavathi";
		System.out.println(name);
	}

	public static void main(String[] args) {
		CallingFunction obj = new CallingFunction();
		obj.function();
	}

}
