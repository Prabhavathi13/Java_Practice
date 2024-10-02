package com.Array;

import java.util.Arrays;

public class CommanValues {

	static void commanValues(int my_arr1[], int my_arr2[]) {
		for (int i : my_arr1) {
			for (int j : my_arr2) {
				if (i == j) {
					System.out.println("Common values are : " + i);
				}
			}

		}

	}

	public static void main(String[] args) {
		int my_arr1[] = { 1, 2, 3, 4, 5};
		int my_arr2[] = { 4, 5, 6, 7, 8,};
		System.out.println("my_arr1 [] is : " + Arrays.toString(my_arr1));
		System.out.println("my_arr2 [] is : " + Arrays.toString(my_arr2));
		commanValues(my_arr1, my_arr2);

	}

}
