package com.numbers;

public class OddorEven {
	
		public static void main(String[] args) {
		
		int oddCount=0;
		int evenCount=0;
		
		int oddToal=0;
		int evenTotal=0;
		
		//count of odd or even
		for (int i = 1; i <=15; i++) {
			
			if (i%2==1) {
				oddCount++; // to find count occurance
				oddToal=oddToal+i;   // to find total value
				System.out.println("odd :" +i);
			}else {
				evenCount++;
				evenTotal=evenTotal+i;
				System.out.println("even : " +i);
			}
		}
		
		System.out.println("total odd : "+ oddCount);
		System.out.println("total odd value : "+ oddToal);
		
		System.out.println("total even : " + evenCount);
		System.out.println("total even value : " + evenTotal);
		
			
	/*	//odd or even
		
		int num = 125;
		if (num%2==0) {
			System.out.println(num + " is EVEN"); 
		}else {
			System.out.println(num + " is ODD");
		}
		*/
		
	}

}
