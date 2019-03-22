package com.ankit.Array_Problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,1};
		//boolean result=findDuplicate(arr);
		boolean output=findDuplicateSecondApproach(arr);
		if(output)
		{
			System.out.println(true);
			
		}
		else
		{
			System.out.println(false);
		}
	}

	private static boolean findDuplicateSecondApproach(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[Math.abs(arr[i])]>=0)
			{
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}
			else
			{
				return true;
			}
		}
		return false;
	}

	private static boolean findDuplicate(int[] arr) {
			Set<Integer> set=new HashSet<>();
			for(int i=0;i<arr.length;i++)
			{
				if(set.contains(arr[i]))
				{
					return true;
				}
				else
				{
					set.add(arr[i]);
				}
				
			}
		return false;
	}

}
