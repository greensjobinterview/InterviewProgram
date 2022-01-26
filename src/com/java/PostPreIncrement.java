package com.java;

public class PostPreIncrement {
	public static void main(String[] args) {
		/*
		 * a++= post inc ============ first value will get value from memory
		 * then increment occurs
		 * 
		 * ++a= pre inc ========== first increment will occur then value
		 * assigned
		 */
		int a = 10, b = 20;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		/*
		 * @@@Ans:10 11 12
		 */

		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);
		/*
		 * @@@ Ans: 19 19 18
		 */
	}
}
