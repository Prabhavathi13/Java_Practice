package com.Java_Practice;

import java.util.Scanner;

public class Odd_and_Even {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number to find : ");

		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println(" Given number is : " + num + " and it is even number");
		} else {
			System.out.println(" Given number is : " + num + " and it is odd number");
		}

	}

}
