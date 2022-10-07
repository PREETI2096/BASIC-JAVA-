package com.bridgelabz.basic1;
import java.util.Scanner;

public class ArmstrongInRange {
	public static void checkArmstrongGivenRange(int initialLimit, int finalLimit) {
		for( int i = initialLimit; i <= finalLimit;i++) {
			boolean arm = ArmstrongNumber.checkArmstrongNumber(i);
			if(arm) {
				System.out.print(i + " ");
			}
					}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial number:");
		int initialNumber = sc.nextInt();
		System.out.println("Enter last number:");
		int lastNumber = sc.nextInt();
		checkArmstrongGivenRange(initialNumber, lastNumber);
		}

}
