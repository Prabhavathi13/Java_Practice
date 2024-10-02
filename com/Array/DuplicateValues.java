package com.Array;

import java.util.Arrays;

public class DuplicateValues {
	
	  static void duplicateValues(int[] arr) {
	        //outer loop
	        //System.out.println("Duplicate values : ");
	        for (int i = 0; i < arr.length - 1; i++) {
	            //inner loop
	            for (int j = i + 1; j < arr.length; j++) {
	                if ((arr[i] == arr[j] && (i != j))) {
	                    //prints the duplicate element
	                    System.out.println("Duplicate values : " + arr[j] );
	                }
	            }
	        }
	    }

	public static void main(String[] args) {
		
		
		  //declaring and initializing an array
        int[] my_arr = {1, 2, 4, 3, 2, 5, 9, 3, 4};
        //printing array as string
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));
        //passing array to method to get duplicate values
        duplicateValues(my_arr);

	}

}
