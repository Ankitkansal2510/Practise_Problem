package com.ankit.Array_Problems.dp;

import java.util.Arrays;

/**
 * 
 *
 * Given a total and coins of certain denomination with infinite supply, what is
 * the minimum number of coins it takes to form this total.
 * 
 * if ww can find the minimum coin to form the total return -1
 *
 * Time complexity - O(coins.size * total) Space complexity - O(coins.size *
 * total)
 **/

public class MinimumCoinChange {

	public static void main(String[] args) {

		int arr[] = { 2 };
		int n = 3;

		System.out.println("Total number of coins required to forma a total of : " + n + " is " + findMinimu(arr, n));
	}

	private static int findMinimu(int[] arr, int n) {

		int temp[][] = new int[arr.length + 1][n + 1];

		for (int j = 0; j <= n; j++) {
			temp[0][j] = n + 1;
		}

		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= arr[i - 1]) {

					temp[i][j] = Math.min(temp[i][j - arr[i - 1]] + 1, temp[i - 1][j]);

				} else {
					temp[i][j] = temp[i - 1][j];
				}

			}
		}
		return temp[arr.length][n] > n ? -1 : temp[arr.length][n];
	}

}
