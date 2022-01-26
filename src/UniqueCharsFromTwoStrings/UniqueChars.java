package UniqueCharsFromTwoStrings;

import java.util.Scanner;

public class UniqueChars {
	
			public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter String 1:");
			String str1 = scan.nextLine();
			System.out.println("Enter String 2:");
			String str2 = scan.nextLine();
			
			String out1="", out2 ="";
			for(int i=0; i<str1.length();i++){
				if(!str2.contains(str1.charAt(i)+"")){
					out1+=str1.charAt(i);
				}
			}
			for(int i=0; i<str2.length();i++){
				if(!str1.contains(str2.charAt(i)+"")){
					out2+=str2.charAt(i);
				}
			}
			
			System.out.println(out1.isEmpty()?null: out1);
			System.out.println(out2.isEmpty()?null: out2);
			
			scan.close();
		}

	}


