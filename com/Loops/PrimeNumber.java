package com.Loops;

// 9. Write a program to find the prime or not.
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean isPrime = true;

		if (num < 2) {
			isPrime = false;
		} else {
			// Check divisibility from 2 up to the square root of the number
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break; // Exit the loop if a divisor is found
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

	}

}
