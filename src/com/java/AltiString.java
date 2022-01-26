package com.java;

public class AltiString {
	public static void main(String[] args) {
		String value ="sgfgfsdgsgdghfsgdfdgsMuralidharanhghfgsdhgfhsdfhsddfsgfhsfghs";
		String name="Muralidharan";
		int i = value.indexOf(name);
		System.out.println(i);
		int length = name.length();
		System.out.println(length);
		System.out.println(value.substring(i,i+length));
		
		//String text =value.substring(value.indexOf('M'),value.indexOf('n'));
		//System.out.println(text);
		}
	}


