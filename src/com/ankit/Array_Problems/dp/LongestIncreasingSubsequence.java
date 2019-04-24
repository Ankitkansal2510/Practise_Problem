package com.ankit.Array_Problems.dp;


/**
 * Find the longest increasing subsequence 
 * 
 * input arr[]={3,4,-1,0,6,2,3}
 * 
 * output=4
 * 
 * because here longest subsquence is : {-1,0,2,3} i.e length is 4 
 * 
 * **/

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void findLongesIncreasingSubsequence(int arr[]) {
		int LIS[] = new int[arr.length];

		Arrays.fill(LIS, 1);
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					LIS[i]=Math.max(LIS[i],LIS[j]+1);
				}
			}
		}
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(LIS[i]>max)
			{
				max=LIS[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6};

		findLongesIncreasingSubsequence(arr);

	}

}
