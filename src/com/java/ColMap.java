package com.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ColMap {

	public static void main(String[] args) {
		Map<String, List<String>> mp = new HashMap<String, List<String>>();
		
		List<String> li = new LinkedList<String>();
		li.add("Chennai");
		li.add("Trichy");
		
		//System.out.println(li);
		
		List<String> l1 = new LinkedList<String>();
		l1.add("trichur");
		l1.add("cochin");
		
		//System.out.println(l1);
		
		mp.put("tn", li);
		mp.put("KL", l1);
		
		//System.out.println(mp);
		
		List<String> list = mp.get("KL");
		System.out.println(list);

		

	}

}
