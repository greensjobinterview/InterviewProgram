package com.prep;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InterviewPractice {

	public static void main(String[] args) {
		
		String n=null;
		String[] a = {"java" , "selenium"};
		for (String n1 : a) {
					n=n1;
		}

		
		Set<String> s = new HashSet<String>();
		for (String x : s) {
			s.add(n);
		}
		
		
System.out.println(s);
	}
}
