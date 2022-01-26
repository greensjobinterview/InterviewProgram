package org.string;

public class StringReverseIgnore {
public static void main(String[] args) {
	String s1 = "sasikumar";
	String rev = "";
	for (int i = s1.length()-1; i >= 0; i--) {

		char c = s1.charAt(i);

		if (c == 'k') {
			continue;
		} else {
			rev = rev + c;
		}

	}
	
	System.out.println(rev);
	
}
}
