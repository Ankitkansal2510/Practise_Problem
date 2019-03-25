package com.ankit.Array_Problems;
/**
 * 
 * Search in rotated sorted array
 * 
 * **/
public class Search_In_Rotated_Sorted_Array {

	public static int Search(int arr[], int key) {
		int n = arr.length ;
		int pivot = findPivot(arr, 0, n-1);
		// If we didn't find a pivot, then
		// array is not rotated at all
		if (pivot == -1)
			return binarySearch(arr, 0, n - 1, key);

		// If we found a pivot, then first
		// compare with pivot and then
		// search in two subarrays around pivot
		if (arr[pivot] == key)
			return pivot;
		if (arr[0] <= key)
			return binarySearch(arr, 0, pivot - 1, key);
		return binarySearch(arr, pivot + 1, n - 1, key);
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {

		if (high < low)
			return -1;

		/* low + (high - low)/2; */
		int mid = (low + high) / 2;
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return binarySearch(arr, (mid + 1), high, key);
		return binarySearch(arr, low, (mid - 1), key);
	}

	public static int findPivot(int arr[], int low, int high) {
		if (high < low)
			return -1;
		if (high == low)
			return low;

		/* low + (high - low)/2; */
		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > low && arr[mid] < arr[mid - 1])
			return (mid - 1);
		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3 };
		int output = Search(arr, 3);
		System.out.println(output);

	}

}
