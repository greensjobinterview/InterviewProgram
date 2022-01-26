package com.java.interview;

public class Cat extends Animals{
	public static void method1() {
		System.out.println("Cat- method1");
	}
	public void method2() {
		System.out.println("cat- method2");
	}
	
	public static void main(String[] args) {
		Animals animal = new Cat();
		animal.method2();
		animal.method1();
	}
}
