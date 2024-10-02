package com.Loops;

// 5. Write a program to print largest number among three numbers.
import java.util.Scanner;

public class LargestNumber {

	public void findingLargestnum() {
		int a;
		int b;
		int c;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		a = scan.nextInt();
		System.out.println("Enter the second Number : ");
		b = scan.nextInt();
		System.out.println("Enter the third Number : ");
		c = scan.nextInt();

		if ((a > b) && (a > c)) {
			System.out.println(a + " : a is largest number ");
		} else if ((b > a) && (b > c)) {
			System.out.println(b + " : b is largest number ");
		} else {
			System.out.println(c + " : c is largest number ");
		}

	}

	public static void main(String[] args) {
		LargestNumber obj = new LargestNumber();
		obj.findingLargestnum();

	}

}
