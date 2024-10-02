package com.Array;
import java.util.Scanner ;
public class ToFindIndexOfArray {
	public void findtheindexofArray(int num, int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println(num + " is at index : " + i);
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 3, 5, 8, 30 };
		System.out.println("this is the array");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nselect the value to find out it's index : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ToFindIndexOfArray array = new ToFindIndexOfArray();
		array.findtheindexofArray(num, arr);

	}

}
