package com.Operators;

public class LogicalAndOrNot {

	public static void logical() {
		int a = 10;
		int b = 15;
		int c = 20;

		// logical AND &&
		System.out.println(a > b && a > c); // true && true = true
		System.out.println(a < b && a < c); // false && false = false
		System.out.println(a > b && a < c); // true && false = false

		// logical OR ||
		System.out.println(a > b || a > c); // true || true = true
		System.out.println(a < b || a < c); // false || false = false
		System.out.println(a < b || a > c); // false || true = true

		// Logical NOT !
		System.out.println(!(a > b)); // NOT true = false
		System.out.println(!(a < b)); // NOT false = true
		System.out.println(!(a < c)); // NOT false = true
		System.out.println(!(a > c)); // NOT true = false

	}

	public static void main(String[] args) {

		logical();

	}

}
