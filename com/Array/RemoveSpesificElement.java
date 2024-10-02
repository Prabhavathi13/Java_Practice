package com.Array;

// 5. Write a function to remove a specific element from an array
import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpesificElement {

	public static int[] removeElement(int[] arr, int valueToRemove) {
		// Count the occurrences of the element to remove
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToRemove) {
				count++;
			}
		}

		// If the element to remove is not found, return the original array
		if (count == 0) {
			return arr;
		}

		// Create a new array with a reduced size
		int[] newArray = new int[arr.length - count];
		int index = 0;

		// Copy elements to the new array, excluding the element to remove
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != valueToRemove) {
				newArray[index++] = arr[i];
			}
		}

		return newArray;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("This is my Array : " + Arrays.toString(arr));

		System.out.println("Enter a number to remove from array : ");

		int valueToRemove = sc.nextInt();

		int[] newArray = removeElement(arr, valueToRemove);

		System.out.println("Array after removing " + valueToRemove + " My array is : " + Arrays.toString(newArray));

	}

}
