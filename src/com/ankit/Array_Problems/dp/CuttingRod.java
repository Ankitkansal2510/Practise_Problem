package com.ankit.Array_Problems.dp;

public class CuttingRod {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
		int size = arr.length;
		System.out.println("Maximum Obtainable Value is " + cutRodDp2(arr, 4));

	}

	private static int cutRodRecusrive(int[] arr, int n) {
		if (n == 0)
			return 0;

		int max = -1;

		for (int i = 0; i < n; i++) {
			max = Math.max(max, arr[i] + cutRodRecusrive(arr, n - i - 1));
		}

		return max;
	}

	public static int cutRodDp2(int arr[], int n) {
		int t[][] = new int[n + 1][n + 1];

		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					t[i][j] = Math.max(t[i][j - i] + arr[i-1], t[i - 1][j]);
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}

		return t[n][n];
	}

}
