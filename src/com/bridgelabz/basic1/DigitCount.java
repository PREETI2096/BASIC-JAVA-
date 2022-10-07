package com.bridgelabz.basic1;

public class DigitCount {

	public static void main(String[] args) {
		long num = 3452556778L;
		int count = 0;
				while((num!=0))
				{
				num= (num/10);
				count ++ ;
				}
				System.out.println("No of digits: " + count);
				}
	}

