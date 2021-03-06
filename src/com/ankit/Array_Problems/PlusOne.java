package com.ankit.Array_Problems;

import java.util.Arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer. The digits are stored such that the most significant
 * digit is at the head of the list, and each element in the array contain a
 * single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * Input: [1,2,3] Output: [1,2,4] Explanation: The array represents the integer
 * 123. Example 2:
 * 
 * Input: [4,3,2,1] Output: [4,3,2,2] Explanation: The array represents the
 * integer 4321.
 * 
 **/
public class PlusOne {
	public static final int[] addOne(int[] digits) {
	    int carry = 1;
	    int[] result = new int[digits.length];
	    for (int i = digits.length-1 ; i >=0; i--) {
	        int val = digits[i] + carry;
	        result[i] = val % 10;
	        carry = val / 10;
	    }
	    if (carry == 1) {
	        result = new int[digits.length + 1];
	        result[0] = 1;
	    }
	    return result;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3};
		int result[]=addOne(arr);
		System.out.println(Arrays.toString(result));
		
	}

}
