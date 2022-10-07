package com.bridgelabz.basic1;

public class AbundantNumber {

	public static void main(String[] args) {
		int n = 15;
		int sum = 0;
		for (int i = 1; i < n; i++)
		{
			if (n % i == 0)
				sum = sum + i;
		}
		if (sum > n)
		{
			System.out.println(n + " is an abundant number");
		    System.out.println("The Abundance is : " + (sum - n));
		}
		else
		System.out.println(n + " is not an Abundant number");
	}
}
