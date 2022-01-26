package com.java.interview;

class Perficient {
	
	static int mycode(int n)
	{
	if (n <= 1)
	return n;
	return mycode(n-  1) + mycode(n-2);


	}
	public static void main (String args[])
	{
	int n = 9;
	System.out.println(mycode(n));
	}

}
