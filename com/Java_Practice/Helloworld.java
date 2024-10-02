package com.Java_Practice;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in) ;
			
		System.out.println("Enter the First Number : " );	
		int num1 = scan.nextInt();
	
		System.out.println("Enter the Second Number : ");
			
			int num2 = scan.nextInt();
        			
			
			// Arithmetic Operators

			// Addition

			int Add = num1 + num2;

			System.out.println("Addition of num1 and num2 is : " + Add);

			// Subtraction

			int Sub = num1 - num2;

			System.out.println("Substraction of num1 and num2 is : " + Sub);

			// Multiplication

			int Mul = num1 * num2;

			System.out.println("Multiplication of num1 and num2 is : " + Mul);

			// Division

			int Div = num1 / num2;

			System.out.println("Division of num1 and num2 is : " + Div);

			// Modulus

			int Mod = num1 % num2;

			System.out.println("Modulus of num1 and num2 is : " + Mod);
		
	}

}

