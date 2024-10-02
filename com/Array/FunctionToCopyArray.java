package com.Array;

// 6. Write a function to copy an array to another array
import java.util.Arrays;

public class FunctionToCopyArray {

	public static void main(String[] args) {
		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] destinationArray = new int[sourceArray.length];

		copyArray(sourceArray, destinationArray);

		// Printing the copied array

		System.out.println("Source Array is : " + Arrays.toString(sourceArray));

		System.out.println("Destination Array is :");
		for (int i : destinationArray) {
			System.out.print(i + " ");
		}
	}

	public static void copyArray(int[] source, int[] destination) {
		// Ensure destination array has enough space
		if (destination.length >= source.length) {
			for (int i = 0; i < source.length; i++) {
				destination[i] = source[i];
			}
		} else {
			System.out.println("Destination array is too small to hold the data.");
		}
	}

}
