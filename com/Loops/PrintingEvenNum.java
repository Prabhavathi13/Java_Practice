package com.Loops;

// 6. Write a program to print even number between 10 and 100 using while
public class PrintingEvenNum {

	public static void evenNum10_100() {
		int i = 10;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		evenNum10_100();

	}

}
