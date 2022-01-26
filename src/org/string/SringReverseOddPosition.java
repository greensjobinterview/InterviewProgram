package org.string;

public class SringReverseOddPosition {

	static String output = "";
	static String result = "";

	public static void main(String[] args) {

		
		/*
		 * @reverse only odd position String alone
		 * Ans:  india si one fo the tsom superb yrtnuoc
		 */
		String value = "india is one of the most superb country";
		System.out.println(value);

		String[] words = value.split(" ");

		for (int i = 0; i < words.length; i++) {
			if ((i + 1) % 2 == 0) {
				result = result +" "+ specificReverse(words[i]);
			}else {
				result=result+" "+words[i];
			}
		}

		System.out.println(result);

	}
	


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

}
