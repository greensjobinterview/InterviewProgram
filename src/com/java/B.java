package com.java;

public class B {
	
	int a=10;
	static int z=20; 


private void sample1() {
	System.out.println(++a); //11 11
	System.out.println(++z); //21 22

}


public static void main(String[] args){
	B b = new B();
	b.sample1();
	
	B b1 = new B();
	b1.sample1();
	
}
}
