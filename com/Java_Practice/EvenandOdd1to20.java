package com.Java_Practice;
// 3)Write a program to print the odd and even numbers from 1 to 20

public class EvenandOdd1to20 {

	public static void main(String[] args) {
		System.out.println("Even nubers from 1 to 20 : ");

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("odd nubers from 1 to 20 : ");

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
  