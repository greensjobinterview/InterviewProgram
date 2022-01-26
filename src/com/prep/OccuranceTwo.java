package com.prep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class OccuranceTwo {
	
	
	public static void main(String[] args) {
		//const int a =10;
		/*int $_=10;
		Integer num1 =500;
		Integer num2 =500;
		
		if (num1 == num2) {
			System.out.println("t");
		} else {
			System.out.println("ft");
		}*/
		
		//@ single word
		String input = "grittier";
		Map<Character , Integer> map = new HashMap<>();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(map.containsKey(c)) { //t
				Integer count = map.get(c);
				map.put(c, count+1);
				
			}else {
				
				map.put(c, 1);
			}
			
		}
		
		System.out.println(map);
		
		/*
		
		//@ group of words
		String in = "grittier prakash grittier kuttyma kuttyma";
		String[] split = in.split(" ");
		Map<String , Integer> map1 = new HashMap<>();
		
		for (String string : split) {
					
			if(map1.containsKey(string)) {
				Integer count = map1.get(string);
				map1.put(string, count+1);
			}else {
				
				map1.put(string, 1);
			}
			
		}
		
		
		System.out.println(map1);
		
		
		
		try {
			String input = "grittier";
			char[] inChar = input.toCharArray();
			List<Character> chSet = new LinkedList<>();
			Map<Character, Integer> occMap = new HashMap<>();
			for (int i = 0; i < inChar.length; i++) {
				char c = inChar[i];
				chSet.add(c);
				if (occMap.get(c) == null) {
					occMap.put(c, 1);
				} else {
					occMap.put(c, occMap.get(c) + 1);
				}
			}
			Iterator<Character> chIterator = chSet.iterator();
			System.out.println("Character and its Occurrences");
			while (chIterator.hasNext()) {
				char c = chIterator.next();
				System.out.println(c + "->" + occMap.get(c));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
	}

}
