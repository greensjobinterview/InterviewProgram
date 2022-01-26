package com.prep;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AllChar {
	public static void main(String[] args) {
		String text = "Selenium";
		
		LinkedHashMap< Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			if(map.containsKey(c)) {
				Integer count = map.get(c);
				map.put(c, count+1);
			}
				
				else {
					
					map.put(c, 1);
				}
			}
		
		Set<Entry<Character, Integer>> s = map.entrySet();
		for (Entry<Character, Integer> entry : s) {
			
			
		}
		}
	}


