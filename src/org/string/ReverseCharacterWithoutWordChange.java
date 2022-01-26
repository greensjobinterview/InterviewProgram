package org.string;

import java.util.Iterator;

public class ReverseCharacterWithoutWordChange {

	//Ans: yM eman si hsakarP  
	
	public static void main(String[] args) {
	String str="My name is Prakash";
	
	String[] split = str.split(" ");
	
	for(int i =0;i<split.length;i++) {
		
		for (int j = split[i].length()-1; j>=0; j--) {
			System.out.print(split[i].charAt(j));
		}
		System.out.print(" ");
	}
}
}
