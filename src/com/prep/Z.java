package com.prep;

public class Z {
	/*
	 * final static String str ="USD 50,000.00";
	 * 
	 * 
	 * 
	 * private void abc(int a) { // TODO Auto-generated method stub
	 * 
	 * } String s1="Hello"; static String s2= new String ("Hello"); StringBuffer
	 * b1= new StringBuffer("Hello");
	 */
	public static void main(String[] args) {
		/*new Z().abc(10);
		
		System.out.println(s2.toString());
		
		System.identityHashCode(s2);
		StringBuffer b1= new StringBuffer("Hello");
		String s1="Hello";
		System.out.println();*/
		 String st ="USD 50,000.00";
		String[] string = st.split(" ");
		System.out.println(string[1]);
		String replaceAll = string[1].replaceAll("[^0-9.]", "");
		System.out.println(replaceAll);
	}

}
