package com.array;


import java.util.Arrays;
import java.util.List;

public class ArrayToList {
public static void main(String[] args) {
	/*String s[]= {"abn","rs","srn","kum","srn","abn"};

	List<String> l = Arrays.asList(s);
	System.out.println(l);*/
	for (int i = 0; i <=5; i++) {
	
		System.out.println(++i);
		
	}
	String s1 ="abc";
	String s2 ="Abc";
	System.out.println(s1==s2);
	
	String c = s1.concat(s2);
	System.out.println(s1 + ":"+ c);
	
}
}
