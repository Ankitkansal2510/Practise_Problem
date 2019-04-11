package com.ankit.Array_Problems.dp;

/**
 * 
 *
 * Given a total and coins of certain denomination with infinite supply, what is
 * the minimum number of coins it takes to form this total.
 *
 * Time complexity - O(coins.size * total) Space complexity - O(coins.size *
 * total)
 **/

public class MinimumCoinChange {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 6, 8 };
		int n = 9;

		System.out.println("Total number of coins required to forma a total of : " + n + " is "+ findMinimu(arr, n));
	}

	private static int findMinimu(int[] arr, int n) {

		int temp[][] = new int[arr.length + 1][n + 1];

		
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= n; j++) {

				if (i == 1) {
					temp[i][j] = temp[i][j - 1] + 1;
				} else if (j >= arr[i - 1]) {

					temp[i][j] = Math.min(temp[i][j - arr[i - 1]] + 1, temp[i - 1][j]);

				} else {
					temp[i][j] = temp[i - 1][j];
				}
				
			
			}
		}
		return temp[arr.length][n];
	}

}
