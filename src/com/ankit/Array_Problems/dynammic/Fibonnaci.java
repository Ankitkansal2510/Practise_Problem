package com.ankit.Array_Problems.dynammic;

//program to find the nth fibonnaci number using recursion and dp
public class Fibonnaci {

	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}
	
	public static void main(String[] args) {
	
		System.out.println(fib(7));

	}

}
