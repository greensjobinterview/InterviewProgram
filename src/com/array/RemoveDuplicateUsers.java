package com.array;
 	
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDuplicateUsers {
	public static void main(String[] args) {
		String []F1 = new String[5];
		F1[0]="U1,U2";
		F1[1]="U3,U4";
		F1[2]="U1,U5";
		F1[3]="U2,U1";
		F1[4]="U3,U4";
		
		Set<String> set = new HashSet<>();
		
		for(int i=0;i<F1.length;i++){
			String strArray[] = F1[i].split(",");
			String temp = strArray[1]+","+strArray[0];
			if(set.contains(F1[i]) || set.contains(temp)){
				continue;
			}
			set.add(F1[i]);
		}
		
		String F2[] = new String[set.size()]; 
		int index =0;
		 java.util.Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			F2[index++] = iterator.next();
		}

		for(int i=0; i<F2.length; i++){
			System.out.println(F2[i]);
		}
	}

}
