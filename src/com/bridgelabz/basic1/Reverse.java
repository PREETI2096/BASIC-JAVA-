package com.bridgelabz.basic1;

public class Reverse {

	public static void main(String[] args) {
		int num = 4689;
		int reverse = 0;
		int rem;
		while(num != 0)
		{
			rem = num%10;
			reverse = reverse * 10 + rem;
			num /= 10;
		};
		System.out.println("Reversed number : " + reverse);

	}

}
