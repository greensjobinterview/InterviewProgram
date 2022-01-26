package com.java;

import java.util.Arrays;

public class C extends B {

	public void m1() {
		System.out.println("hi C");
	}

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "cabd";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		/*Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("String is an anagram");
		} else {
			System.out.println("String is not an anagram");
		}*/

		// A a = new C();
		// a.m1();
		// System.out.println(1 + 1 + "hello" + 1 + 1);
		// System.out.println(1 + "hello" + 2 * 6);
		//
		
		/*@@@ : To find middle character*/
		String s = "java sky";
		
		 String[] sp = s.split(" ");
		 for (String st : sp) {
		
		 char[] c = st.toCharArray();
		
		 System.out.println("Word: " + st);
		
		 if (st.length() % 2 == 0) {
		 System.out.println("middle char: " + c[(st.length() / 2) - 1]);
		 } else {
		 System.out.println("middle char: " + c[(st.length() / 2)]);
		 }
		 }

	}
}
