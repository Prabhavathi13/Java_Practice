package com.Loops;

// 4. Write a program to print the odd and even numbers
import java.util.Scanner;

public class EvenandOddNumber {

	public static void oddAndEven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Even Or Odd : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Given num is : " + num + "  and it is Even ");
		} else {
			System.out.println("Given num is : " + num + " and it is odd ");
		}

	}

	public static void main(String[] args) {

		oddAndEven();

	}

}
