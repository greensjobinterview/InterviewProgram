package com.prep;

public class Occurance {

	
	
	//using charAt
	private static void getCharCount(String str, char val) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==val) {
				count++;
			}}		
		System.out.println(val +":" +count);
	}
	//using toCharArray
	private static  void getCharOccurence(String str, char val) {
		int count=0;
		for (char c : str.toCharArray()) {
			if (c==val) {
				count++;
			}}
		System.out.println(count);}

	public static void main(String[] args) {
		
		getCharOccurence("Selenium", 'e');
		getCharCount("Selenium", 'i');
		}}
