package com.Loops;

// 12. Print gender (Male/Female) program according to given M/F using switch
import java.util.Scanner;

public class MaleFemaleUsingSwitch {

	public static void femaleMaleSwitch() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a character [M/F] : ");
		char Gender = scan.next().charAt(0);

		switch (Gender) {
		case 'M':
			System.out.println("Gender : Male");
			break;
		case 'F':
			System.out.println("Gender : Female");
			break;
		default:
			System.out.println("Invalid input. Please enter 'M' or 'F'.");

		}
	}

	public static void main(String[] args) {
		femaleMaleSwitch();

	}

}
