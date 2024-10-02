package com.Java_Practice;

// 1)Program for multiple if else statement(Largest number in 10,20 and 30)

public class Largest_Number {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b && a > c) {
			System.out.println(" a is largest then b and c ");
		
		} else if (b > a && b > c) {
			System.out.println(" b is largest then b and c ");

		} else {
			System.out.println(" c is largest then a and b ");
		}

	}

}
