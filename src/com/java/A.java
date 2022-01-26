package com.java;

public class A  {
	
	public static int function(int y) {
		int x =1;
		if(y>=5)
			return y;
		y=y+x;
		x++;		
		return function(y);
		

	}

	public static void main(String[] args) {
		/*String s = "pyhton";
		System.out.println(s.substring(3, 2));*/
		
		/*int a=121,b=2,c,d;
		c=a/10;
		d=a%10;
		a=d*b*c;
		c=a+b+13;
		System.out.println(a+" "+c);
		*/
		
		function(1);
		
		
}
}