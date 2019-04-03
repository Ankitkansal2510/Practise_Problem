package com.ankit.Array_Problems;

import java.util.Arrays;

/**
 * osition of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 * 
 * 
 * **/

public class Find_First_Last_Position {

	public static void main(String[] args) {
		int arr[] = {5,7,7,8,8,10 };
		int target = 5;
		int output[] = findPosition(arr, target);
		System.out.println(Arrays.toString(output));
	}

	private static int[] findPosition(int[] arr, int target) {
		
		int targetRange[]={-1,-1};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				targetRange[0]=i;
				break;
			}
		}
		
		if(targetRange[0]==-1)
		{
			return targetRange;
		}
		for(int j=arr.length-1;j>=0;j--)
		{
			if(arr[j]==target)
			{
				targetRange[1]=j;
				break;
			}
		}
		return targetRange;
}}
