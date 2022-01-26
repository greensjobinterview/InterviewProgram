package com.prep;

public class Mphasis {
public static void main(String[] args) {
	String s ="hello";
	String ss="hello";
	
	String s1 = new String("post build");
	String s2 = new String("post build");
	
	System.out.println(s1==s2); 
	
	String s3 = "post build";
	System.out.println(s1==s3); 
	
	String s4= "post build";
	System.out.println(s3==s4);
	
	String s5 = "post"+"build"; 
	System.out.println(s4==s5); 
	
	System.out.println(s3.equals(s1)); 
}
}
