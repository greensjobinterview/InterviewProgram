package org.string;

public class SringReverseSingleWord {

	static String output = "";
	static String result = "";
	/*
	 * @string reverse
	 * 
	 * @Ans:selenium- muineles
	 */
	public static String specificReverse(String text) {
		char[] cs = text.toCharArray();
		output="";
		for (int i = cs.length - 1; i >= 0; i--) {
			// System.out.print(cs[i]);
			output += cs[i];
		}
		return output;
	}


	public static void main(String[] args) {

		specificReverse("my name is selenium");
		System.out.println(output);
	}
		
}
