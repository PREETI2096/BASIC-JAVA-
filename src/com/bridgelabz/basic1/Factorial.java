package com.bridgelabz.basic1;

public class Factorial {

	public static void main(String[] args) {
		int number = 9;
		int fact = 0;
		for(int i = number;i >= 1; i -- ) 
			 fact += number * i;
		System.out.println("factorial of number is " + fact);
			
		

	}

}
