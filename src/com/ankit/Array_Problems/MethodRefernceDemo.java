package com.ankit.Array_Problems;

interface Interf
{
	public void m1();
	
}
public class MethodRefernceDemo {
	
	public static void m2()
	{
		System.out.println("Method refernce");
	}
	public static void main(String[] args) {
		
		Interf i=MethodRefernceDemo::m2;
		i.m1();
	}

}
