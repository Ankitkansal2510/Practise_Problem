/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

package com.ankit.Array_Problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
		findMajority(arr);
		findMajoritySecondApproach(arr);

	}
	//below second approach will take o(n) time complexity and o(1) space complexity
private static void findMajoritySecondApproach(int[] arr) {
		int count=0;
		Integer candidiate=null;
		for(int num:arr)
		{
			if(count==0)
			{
				candidiate=num;
			}
			count+=(candidiate==num)?1:-1;
		}
		System.out.println(candidiate);
	}
	//below findMajority takes o(n) time complexity and o(n) space complexity,we can further improve the space complexity
	private static void findMajority(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}
		Map.Entry<Integer, Integer> majorityElement = null;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (majorityElement == null || entry.getValue() > majorityElement.getValue()) {
				majorityElement = entry;
			}
		}
		System.out.println(majorityElement.getKey());
	}
}
