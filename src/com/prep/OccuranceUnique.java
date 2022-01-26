package com.prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceUnique {
	public static void main(String[] args) {
		String s ="aaabccddee";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		char[] ch = s.toCharArray();
		
		for (char c : ch) {
			
			if (map.containsKey(c)) {
				
				Integer count = map.get(c);
				map.put(c, count+1);
				
				
			} else {

				map.put(c, 1);
			}
			
		}
		
		
		Set<Entry<Character, Integer>> entries = map.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			
			if (entry.getValue()==1) {
				
				System.out.println(entry.getKey()+" occured only once");
				
			}
			
		}
		
	}

}
