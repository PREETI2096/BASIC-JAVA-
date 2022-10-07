package com.bridgelabz.basic1;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 55;
		boolean isPrime = true;
		for(int i = 2;i <= number/2; i++)
		{
			if (number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime )
			System.out.println(number+ " is Prime number");
		else
			System.out.println(number+ " is not prime number");
	
	
			}
		}
	     


