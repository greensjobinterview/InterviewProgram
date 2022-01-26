package com.java;
import com.numbers.OddorEven;
public class StaticVsInstance {
	int a =10; //10 
	static int b = 100; //101
	
	public void increment() {
		System.out.println(a);
		System.out.println(b);
		a++;  
		b++; //101

	}
	public static void main(String[] args) {
		
		StaticVsInstance s = new StaticVsInstance();
		s.increment();
		
		StaticVsInstance s1 = new StaticVsInstance();
		s1.increment();
		
		StaticVsInstance s2 = new StaticVsInstance();
		s2.increment();
		
		/*@@@Ans:
		10
		100
		10
		101
		10
		102*/
}
}