package com.ankit.Array_Problems;

public class Testsd {

	
	public  static void fun(int x)
	{
		if(x>=0){
		fun(--x);
		System.out.println(x);
		fun(--x);
	}}
	public static void main(String[] args) {
		
		fun(3);

	}

}
