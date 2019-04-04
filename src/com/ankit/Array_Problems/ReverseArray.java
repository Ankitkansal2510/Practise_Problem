package com.ankit.Array_Problems;

import java.util.Arrays;

public class ReverseArray {

	private static int[] Reverse(int arr[])
	{
		//int result[]=new int[arr.length];
		int temp=0;
		int j=0;
		for(int i=arr.length-1;i>=arr.length/2;i--)
		{
			/*result[j]=arr[i];
			j++;*/
			
			 temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]={1,4,3,2};
		int arr1[]=Reverse(arr);
		System.out.println(Arrays.toString(arr1));
	}
}
