package com.Array;

// 2. Write a function to calculate the average value of an array of integers
public class AverageofArray {

	public static void avgofarray() {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int add = 0;
		double avg;

		for (int i = 0; i < arr.length; i++) {
			add += arr[i];
		}
		System.out.println("Addition of given array elements is : " + add);
		avg = add / arr.length;
		System.out.println("Average of array is : " + avg);
	}

	public static void main(String[] args) {
		avgofarray();

	}

}
