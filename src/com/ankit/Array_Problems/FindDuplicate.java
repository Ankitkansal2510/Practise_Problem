package com.ankit.Array_Problems;

public class FindDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1,3,4,2,2};

		int result = DuplicateUtil(arr);
		System.out.println(result);
	}

	private static int DuplicateUtil(int arr[]) {
		int nextPosition = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < 0) {
				nextPosition = -arr[i];
			} else {
				nextPosition = arr[i];
			}
			if (arr[nextPosition] < 0) {
				
				return (arr[i]<0? -arr[i]:arr[i]);
			} else {
				// int j=arr[nextPosition];
				arr[nextPosition] = -arr[nextPosition];
			}
		}

		return -1;
	}

}
