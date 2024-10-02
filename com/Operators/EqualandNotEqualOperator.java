package com.Operators;

// 3. Program to equal operator and not equal operators

// 4. Write a program to find the two numbers equal or not
import java.util.Scanner;

public class EqualandNotEqualOperator {

	public void method() {
		int a = 4, b = 8;
		if (a == b) {
			System.out.println(a + " is equal to " + b);
		} else {
			System.out.println(a + " is not equal to " + b);
		}
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First number : ");

		int num1 = sc.nextInt();

		System.out.println("Enter the Second number : ");

		int num2 = sc.nextInt();

		if (num1 != num2) {
			System.out.println("num1 is not Equal to num2");
		} else {
			System.out.println("num1 is Equal to num2");
		}
	}

	public static void main(String[] args) {

		EqualandNotEqualOperator obj1 = new EqualandNotEqualOperator();

		obj1.method();

		obj1.method2();
	}

}
