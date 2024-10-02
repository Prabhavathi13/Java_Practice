package com.Loops;

// 10. Write a program to palindrome or not.
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scan.nextLine();

		boolean result = false ;

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) == str.charAt(j)) {
				result = true;
			}
		}
		if (result == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
     scan.close();
	}

}
