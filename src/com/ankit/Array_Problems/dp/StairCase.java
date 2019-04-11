package com.ankit.Array_Problems.dp;

import java.util.Timer;

public class StairCase {

	public  static int find(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		/*if(n==2)
		{
			return 2;
		}*/
		
		return find(n-1)+find(n-2);
	}

	public static int findDp(int n)
	{
		int arr[]=new int[n+1];
		arr[0]=1;
		arr[1]=1;
		//arr[2]=2;
		
		
		for(int i=2;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr[n];
	}
	
	public static void main(String[] args) {
		
		int n=4;
		//System.out.println(System.c);
		//System.out.println(find(5));
	System.out.println(findDp(5));
		//System.out.println(System.currentTimeMillis());
	}

}
