package com.Operators;

// 6. Program for relational operators (<,<==, >, >==)
import java.util.Scanner;

public class RelationalOperators {

	public static void relational() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number : ");

		int a = scan.nextInt();

		System.out.println("Enter the second number : ");

		int b = scan.nextInt();

		if (a > b) {
			System.out.println(a +" is greaterthan " + b);
		} else if (a < b) {
			System.out.println(a + " is lessthan " + b);
		} else if (a >= b) {
			System.out.println(a + " is greaterthan or equal to " + b);
		} else if (a <= b) {
			System.out.println(a + " is lessthan or equal to " + b);
		} else {
			System.out.println(a + " is equal to "  + b);
		}

	}

	public static void main(String[] args) {
		
		relational();

	}

}