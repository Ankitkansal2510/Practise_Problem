package com.ankit.Array_Problems;

import java.util.Arrays;

/**
 * 
 * Write a function to ratate an arrray of size n by k elements example
 * 
 * arr={1,2,3,4,5,6,7}
 * 
 * output
 * 
 * {3,4,5,6,7,1,2}
 * 
 * 
 * 
 **/
public class ArrayRotation {
	public static void rotate(int arr[], int k) {

		int n = arr.length;
		for (int i = 0; i < k; i++) {

			reverseArray(arr, n);
		}

	}

	public static void reverseArray(int arr[], int n) {

		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;

	}

	/** Below method is to cyclic rotate array by one **/

	public static void cyclicRotate(int arr[], int n) {
		int i;
		int size = arr.length;
		int temp = arr[size - 1];
		for (i = size - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[i] = temp;
	}

	public static void moveAllZeroToEnd(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		
		
		for(int i=count;i<arr.length;i++)
		{
			arr[i]=0;
		}
	}
	
	
	public static void moveAllZeroToEndSingleTraversal(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		
	}
	
	
	public static void minimumSwapRequired(int arr[],int k)
	{
		int count=0;
		int result=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=k && count==i){
				count++;
			}
			if(arr[i]<=k && count <i)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				result++;
			}
		}
		System.out.println("Minimum swap required is : " + result);
	}
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int arr2[] = { 1, 2, 3, 4, 5 };
		
		int arr3[] = {1, 2, 0, 4, 3, 0, 5, 0};
		
		int arr4[] = {10, 20, 0 ,0 ,30, 0, 50, 0};
		
		int arr5[] = {2, 7, 9, 5, 8, 7, 4};
		
		int m = 1;
		int k = 4;
		
		int element=5;

		rotate(arr, k);
		System.out.println(Arrays.toString(arr));

		cyclicRotate(arr2, m);
		System.out.println(Arrays.toString(arr2));
		
		moveAllZeroToEnd(arr3);
		System.out.println(Arrays.toString(arr3));
		
		moveAllZeroToEndSingleTraversal(arr4);
		System.out.println(Arrays.toString(arr4));
		
		minimumSwapRequired(arr5,element);
		System.out.println(Arrays.toString(arr5	));

	}

}
