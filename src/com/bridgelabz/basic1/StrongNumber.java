package com.bridgelabz.basic1;
import java.util.Scanner;
public class StrongNumber {
	static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
		}
	static boolean detectStrong(int num) {
		int digit , sum = 0;
		int temp = num;
		while (temp != 0) {
			digit = temp % 10;
			sum = sum + factorial(digit);
			temp /= 10;
		}
		return sum == num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check:");
		int num = sc.nextInt();
		if (detectStrong(num))
			System.out.println(num + " is Strong number");
		else
			System.out.println(num + " is not a Strong number");


	}

}
