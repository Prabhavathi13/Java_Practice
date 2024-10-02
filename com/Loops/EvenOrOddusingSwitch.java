package com.Loops;

// 11. Program to check whether a number is EVEN or ODD using switch
import java.util.Scanner;

public class EvenOrOddusingSwitch {

	public static void evenORoddusingSwitch() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int num = sc.nextInt();

		switch (num % 2) {
		
		case 0:
			System.out.println(num + " is an Even Number");
			break;
		
		case 1:
			System.out.println(num + " is an Odd Number");
			break;
		}

	}

	public static void main(String[] args) {
		evenORoddusingSwitch();

	}

}
