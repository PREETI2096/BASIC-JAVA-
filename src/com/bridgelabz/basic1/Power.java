package com.bridgelabz.basic1;

public class Power {
	public static void main(String args[]){
		int number = 7;
		int exponent = 3;
		long power =1;
		for(int i = 1; i <= exponent; i++)
			power = power*number ;
		System.out.println(power+ " is the power of number");
		
	}

}
