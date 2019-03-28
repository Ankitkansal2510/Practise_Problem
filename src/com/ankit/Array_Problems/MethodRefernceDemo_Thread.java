package com.ankit.Array_Problems;

//Creating Thread using Method Refrence


public class MethodRefernceDemo_Thread {

	public void m1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child method");
		}
	}
	
	public static void main(String[] args) {
		MethodRefernceDemo_Thread m=new MethodRefernceDemo_Thread();
		Runnable r=m::m1;
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main method");
		}
	}

}
