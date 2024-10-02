package com.Java_Practice;

/* 4. Define variables for different Data Types int, Boolean, char, float, double and print on the 
Console*/
public class DataTypes {
	public void datatypes() {
		String str = "Prabha";
		int num = 8;
		boolean bol = true;
		char ch = 'A';
		float flt = 4.5f;
		double doub = 3.45;

		System.out.println("This is a string : " + str);
		System.out.println("This is a number : " + num);
		System.out.println("This is a boolean : " + bol);
		System.out.println("This is a float : " + flt);
		System.out.println("This is a char : " + ch);
		System.out.println("This is a double : " + doub);
	}

	public static void main(String[] args) {
		DataTypes obj = new DataTypes();

		obj.datatypes();

	}

}
