package org.string;

public class ChangleOnlyThird {
	public static void main(String[] args) {
		
		String s ="my name is prakash";
		String[] split = s.split(" ");
		
		for(int i=split[3].length()-1;i>=0;i-- ) {
			
			System.out.print(split[3].charAt(i));
		}
	}

}
