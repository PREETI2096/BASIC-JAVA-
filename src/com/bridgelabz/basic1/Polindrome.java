package com.bridgelabz.basic1;

public class Polindrome {
public static void main(String[] args) {
		int n = 31366313;
		int temp = n;
	    int rev = 0, rem;
		while(n != 0) 
		{
		rem = n%10;
		rev = (rev * 10 + rem);
		n /= 10;
		}
		System.out.println(rev);
		if(temp == rev)
		System.out.println("Polindrome");
		else
		System.out.println( "Not a Polindrome");
		}
	}
