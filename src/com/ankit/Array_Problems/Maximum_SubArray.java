package com.ankit.Array_Problems;


public class Maximum_SubArray {

	public static void main(String[] args) {

		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int output = findMaxSubArraysum(arr);
		System.out.println(output);

	}

	private static int findMaxSubArraysum(int[] arr) {

		int max_so_far = arr[0];
		int curr_max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			curr_max = Math.max(arr[i], curr_max + arr[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;

	}

}
