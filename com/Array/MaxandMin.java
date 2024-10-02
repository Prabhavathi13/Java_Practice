package com.Array;

import java.util.Arrays;

// 8. Write a function to find the minimum and maximum value of an array
public class MaxandMin {
      // method for finding max value
	static int maxValue(int[] arr) {
		// int result = arr[0];
		int max = arr[0];
		// for each loop
		for (int j : arr)
			if (j > max)
				max = j;
		return max;
	}
    
	// method for finding min value 
	static int minValue(int[] arr) {
		// int result = arr[0]
		int min = arr[0];
		// for each loop
		for (int j : arr)
			if (j < min)
				min = j;
		return min;
	}

	public static void main(String[] args) {

		int arr[] = { 12, 11, 4, 6, 8, 1 };
		// Printing my array
		System.out.println("my array is : " + Arrays.toString(arr));
		// Printing max value
		System.out.println("Maximum value in array is : " + maxValue(arr));
		// Printing min value
		System.out.println("Minimun value in array is : " + minValue(arr));

	}

}
