package com.java.interview;

//public class Human extends Animal implements Mammal
//public class Human implements Animal(I) extends Mammal(c)





public class Human  extends Mammal{
	
	public void human() {
		System.out.println("human");

	}
	
public static void main(String[] args) {
	Mammal h = new Human();
	
}	
}