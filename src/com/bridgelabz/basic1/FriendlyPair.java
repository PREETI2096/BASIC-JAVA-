package com.bridgelabz.basic1;

import java.util.Scanner;

public class FriendlyPair {

	static int getDivisorSum(int num)
	{
		int sum = 0;
		for(int i = 1; i <= num;i++)
		{
			if(num % i == 0)
				sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1:");
		int num1 = sc.nextInt();
		System.out.println("enter the num2:");
		int num2 = sc.nextInt();
		
		int sum1 = getDivisorSum(num1);
		int sum2 = getDivisorSum(num2);
		if (sum1 / num1 == sum2 / num2)
			System.out.println(num1 + " & "+ num2+ " are friendly pair");
		else
			System.out.println(num1 + " & "+ num2+ " are not friendly pair");
	}

}
