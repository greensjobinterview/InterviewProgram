package com.prep;

public class NumberPrint {
	
	
	public static void main(String[] args) {

		int rows = 5;

		for (int x = 1; x <= rows; x++) {

			for (int i = 1; i <= 5; i++) {

				for (int j = x; j <= i; j++) {

					System.out.print(j);

				}
				System.out.println();

			}

		}

	}

}
