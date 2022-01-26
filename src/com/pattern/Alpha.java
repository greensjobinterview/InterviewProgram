package com.pattern;

public class Alpha {
	public static void main(String[] args) {
		String x ="abcd";
		//for (int i = 4; i >=1; i--) 
			for (int i = 0; i >=1; i--){
			for (int j = 0; j <i; j++) {
				System.out.print(x.charAt(j));
			}
			System.out.println();
		}
	}

}
