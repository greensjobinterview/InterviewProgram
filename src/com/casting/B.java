package com.casting;

public class B extends A {
	
 public void sample() {
System.out.println("sample of B...");
	
}
 public static void main(String[] args) {
	A b = new B();
	b.sample();
	b.sample1();
	
	//error will get 
	/*B a = new A();
	a.sample();*/
	
}
}
