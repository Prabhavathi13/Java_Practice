package com.Operators;

// 7. Print the smaller and larger number
import java.util.Scanner;

public class SmallerandLarger {

	public static void largerAndSmaller() {

		int a = 53;
		int b = 65;

		if (a > b) {
			System.out.println("a is largerthen b, a and b is : " + a + " and " + b);
		} else {
			System.out.println("a is smallerthan b, a and b is : " + a + " and " + b);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();

		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println("num1 is smallerthan num2, num1 and num2 is : " + num1 + " and " + num2);
		} else {
			System.out.println("num1 is largerthen num2, num1 and num2 is : " + num1 + " and " + num2);
		}
	}

	public static void main(String[] args) {
		largerAndSmaller();

	}

}
