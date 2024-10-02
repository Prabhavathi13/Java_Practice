package com.Array;

// 4. Write a function to test if array contains a specific value.
import java.util.Scanner;
import java.util.Arrays;

public class FindSpecificValue {
	public static boolean contains(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to verify : ");
		int valueToFind = sc.nextInt();

		System.out.println("My array is : " + Arrays.toString(numbers));

		if (contains(numbers, valueToFind)) {
			System.out.println("The array contains the value " + valueToFind);
		} else {
			System.out.println("The array does not contain the value " + valueToFind);
		}

	}

}
