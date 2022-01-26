package com.java;

public class Sap {

	public static void main(String[] args) {

		/*
		 * @@@ Ans : Welcome NOTE : used break keyword so once welcome will get
		 * print
		 */

		for (int i = 0; true; i++) {
			System.out.println("Welcome");
			break;
		}
		//-----------------------------------------------------------------------//
		String s = "Sachin";
		String concat = s.concat(" Tendulkar");
		System.out.println(s); // @@@Ans : sachin
		System.out.println(concat);

		//-----------------------------------------------------------------------//
		
		/* @@@Ans : t$m$$rr$$$w */
		String input = "tomorrow";
		String rev = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == 'o') {
				count++;
				for (int j = 0; j < count; j++) {
					rev = rev + '$';
				}
			} else {

				rev = rev + c;

			}
		}
		System.out.println(rev);
	}
}
