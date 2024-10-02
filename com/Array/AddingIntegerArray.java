package com.Array;
// 1. Write a function to add integer values of an array
public class AddingIntegerArray {

	public static void functiontoAddIntegers() {
		int[] arr = { 10, 12, 32, 20, 40, 30, 8, 15 };
		int add = 0;

		for (int i = 0; i < arr.length; i++) {
			add += arr[i];// add = add + arr[i] ;
		}

		System.out.println(" addition of given array elements is : " + add);
	}

	public static void main(String[] args) {
		functiontoAddIntegers();

	}

}
