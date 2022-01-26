package com.java;

public class StringMain {
	
	String text ="java";
	
	String txt = new String("java");
	boolean b;
	
public void bool() {
	
	if (text == txt) {
		 b = true;
	}else {
		 b = false;
	}
	
	System.out.println(b);
	
}

public void bool1() {
	if (text.equals(txt)) {
		b = true;
	}
	
	else {
		 b = false;
	}
	
	System.out.println(b);
	
}

public static void main(String[] args) {
	StringMain m = new StringMain();
	m.bool();
	m.bool1();
}
}
