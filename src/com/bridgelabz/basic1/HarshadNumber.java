package com.bridgelabz.basic1;

import java.util.Scanner;

public class HarshadNumber {

	static boolean isHarshad(int n)
	{
		int result = 0;
		while(n != 0)
		{
			int pick_last = n % 10;
			result = result + pick_last;
			n /= 10;
			return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		if (isHarshad(n))
			System.out.println(n + " is a Harshad number.");
		else
			System.out.println(n + " is not a Harshad number.");
			
	}

}
