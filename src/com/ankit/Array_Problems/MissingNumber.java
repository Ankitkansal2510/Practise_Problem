package com.ankit.Array_Problems;
/*
 * Find missing number from an given array
 * example 
 * input:[9,6,4,2,3,5,7,0,1]
 * output:8
 * 
 * */
public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1};
		int output = findMissingNumber(arr);
		System.out.println(output);
	}

	private static int findMissingNumber(int[] arr) {

		int n = arr.length;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum =  sum-arr[i];
		}
		return sum;
	}

}
