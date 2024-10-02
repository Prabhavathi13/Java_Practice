package com.Java_Practice;

public class LocalandGlobalVariables {
	int a = 10;

	public void localvariable() {
		int a = 20;
		System.out.println("This is a local varible : " + a);
	}

	public static void main(String[] args) {
		LocalandGlobalVariables s1  = new LocalandGlobalVariables();

		System.out.println("This is a Global Variable : " + s1.a);

		s1.localvariable();

	}

}
