package com.numbers;

public class fibonacci {
	
	public static void main(String[] args) {
		
	int num1 = 0,num2=1,num;
	System.out.print(num1+" ");
	System.out.print(num2);
	for (int i = 1; i <=10; i++) {
		num=num1+num2;
		System.out.print(" " +num);
		num1=num2;
		num2=num;
		
	}
	
	}

}
