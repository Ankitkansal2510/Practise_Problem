package com.ankit.Array_Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[]={2,7,11,15};
		int target=18;
		int output[]=findTwoSum(arr,target);
		System.out.println("[" + output[0] + "," + output[1] + "]");

	}

	private static int[] findTwoSum(int[] arr, int target) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int number =target-arr[i];
			if(map.containsKey(number))
			{
				return new int[]{map.get(number),i};
				
			}
			else
			{
				map.put(arr[i],i);
			}
		}
		
		throw new IllegalArgumentException("Number not found");
	}

}
