package com.Array;

abstract class Animal {
	public abstract void animalsound();

	public void sleep() {
		System.out.println("zzz");
	}
}

class Dog extends Animal {
	public void animalsound() {
		System.out.println("bow bow");
	}
}

public class Extract {

	public static void main(String[] args) {
		Dog mydog = new Dog(); // Create a Pig object
		mydog.animalsound();
		mydog.sleep();

	}
}
