package com.java.interview;

public class LandT {
	

	public int calculate(int a, int b)
      {
          try{
              return a-b;
          }catch(Exception e){
              return a+b;
          }finally{
              return a*b;
          }
      }   
	
	public static void main(String[] args) {
		LandT l = new LandT();
		  int result =l.calculate(2, 3);
		  System.out.println("Result: " + result);   
		  System.out.println(l.calculate(2, 3));
	}
}  
