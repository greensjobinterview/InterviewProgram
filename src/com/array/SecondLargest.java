package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
public static void main(String[] args) {
	int a[]={1,2,5,6,3,2};
	
	int total= a.length;
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       System.out.println( a[total-2]);  
	       
	       //@ using collection
	       /*Integer[] aa = a;
	       List<Integer> list=Arrays.asList(a);  
	       Collections.sort(list);  
	       int element=list.get(total-2);  
	*/
}
}
