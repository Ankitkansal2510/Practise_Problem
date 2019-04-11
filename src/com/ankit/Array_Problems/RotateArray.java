package com.ankit.Array_Problems;
/*Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Example 1:
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int k=3;
		//rotate(arr,k);
		k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));

	}
	 public static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;   
	            start++;
	            end--;
	        }
	    }
	 
	 
//Below method will take o(n) time complexity and o(n) space complexity
	private static void rotate(int[] arr, int k) {
		int [] array=new int[arr.length];
		int length=arr.length;
		int n=length-k;
		int start=0;
		for(int i=n;i<length;i++)
		{
			array[start]=arr[i];
			start++;
		}
		for(int i=0;i<n;i++)
		{
			array[start]=arr[i];
			start++;
		}
		
	}

	

}
