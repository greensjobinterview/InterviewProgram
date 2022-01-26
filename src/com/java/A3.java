package com.java;

public class A3 {

	public static void main(String[] args) {

	    int[] ar= new int[5]; 
		
		ar[0]=10;
		ar[1]=20;
		ar[2]=20;
		ar[3]=10;
		ar[4]=50;
		
		System.out.println("Normal for loop...");
	   for (int i = 0; i <ar.length; i++) {
		System.out.println(ar[i]);
	}
	   
	   System.out.println("enhanced for loop...");
	   for(int  x : ar ) {
		   System.out.println(x);
	   }
	   
	   String s ="grittier";
	   // normal for
	   // string method 
	   
	}

}
