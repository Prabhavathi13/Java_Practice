package com.Operators;

// 1. Write a function for arithmetic operators(+,-,*,/)
public class ArithmeticOperators {

	public void arithmeticOperators() {
		int a = 20;
		int b = 12;

		// Addition operator
		int c = a + b;
		// Substraction operator
		int d = a - b;
		// Multiplication operator
		int e = a * b;
		// Division operator
		int f = a / b;

		System.out.println("Addition of a and b is : " + c);
		System.out.println("Substarction of a and b is : " + d);
		System.out.println("Multipilcation of a and b is : " + e);
		System.out.println("Division  of a and b is : " + f);
	}

	public static void main(String[] args) {

		ArithmeticOperators obj = new ArithmeticOperators();
		obj.arithmeticOperators();
	}

}
