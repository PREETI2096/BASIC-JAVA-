package com.bridgelabz.basic1;

public class GreatestofThreeNumbers {

	public static void main(String[] args)
	{
	int n1 = 10;
	int n2 = 80;
	int n3 = 30;
	if (n1 >= n2 && n1 >= n3)
		
		System.out.println(n1 + " is the greatest number among three.");
	
	else if(n2 >= n1 && n2 >= n3)
		
		System.out.println(n2 + " is the greatest number among three");
	
	else if (n3 >= n1 && n3 >= n2)
		
		System.out.println(n3 + " is the greatest number among three");
	
}

}
