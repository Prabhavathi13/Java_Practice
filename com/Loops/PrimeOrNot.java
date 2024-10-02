package com.Loops;

// 9. Write a program to find the prime or not.
import java.util.Scanner;

public class PrimeOrNot {

	// Method to check if a number is prime
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}

		// Check for factors up to the square root of the number
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // If divisible by any number other than 1 and itself, it's not prime
			}
		}
		return true; // If no factors found, it's prime
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input the number to be checked
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Check if the number is prime
		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

		sc.close();

	}

}
