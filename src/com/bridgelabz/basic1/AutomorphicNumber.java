package com.bridgelabz.basic1;
import java.util.Scanner;

public class AutomorphicNumber {
	 
	public static int isAutomorphic(int n)
	{
		int square = n * n;
		while(n != 0)
		{
			if (n % 10 != square % 10) {
				return 0;
			}
			n /= 10;
			square /= 0;
			
		}
		return 1;
		
		}
   public static void main(String[] args) {
	   
       int n =376, square = n*n; 
		
		if( isAutomorphic(n) == 1) 
			System.out.println(" Number is Automorphic");
		else
			System.out.println("Number is not Automorphic");

	}
}