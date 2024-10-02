package com.Operators;

// 2. Write a method for increment and decrement operators(++, --)
public class IncrementandDecrement {

	public void preincrement() {
		int a = 24;
		++a;
		System.out.println("This is a pre-increment : " + a);
	}

	public void postincrement() {
		int b = 11;
		b++;
		System.out.println("This is a post-increment : " + b);
	}

	public void predecrement() {
		int c = 5;
		--c;
		System.out.println("This is a pre-decrement : " + c);

	}

	public void postdecrement() {
		int d = 4;
		d--;
		System.out.println("This is a post-decrement : " + d);
	}

	public static void main(String[] args) {

		IncrementandDecrement obj = new IncrementandDecrement();

		obj.preincrement();
		obj.postincrement();
		obj.predecrement();
		obj.postdecrement();

	}

}
