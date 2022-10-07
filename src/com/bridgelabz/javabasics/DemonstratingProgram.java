package com.bridgelabz.javabasics;

public class DemonstratingProgram {

		static byte b = 4;
		static short s = 8;
		static int i = 20;
		static long l = 100L;
		static float f = 10.87f;
		static double d = 76.95;
		static char ch = 'A';
		static boolean bu = false;

		static void demo() // static method
		{
		System.out.println("Static method");
		} 

		static //static block
		{
		System.out.println("static block"); 
		}


		public static void main(String[] args) 
		{
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bu);

		demo();
		
	}
}
