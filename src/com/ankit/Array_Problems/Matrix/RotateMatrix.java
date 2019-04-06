package com.ankit.Array_Problems.Matrix;

public class RotateMatrix {
	public static void MatrixRotate(int m, int n, int a[][]) {
		int k = 0;
		int l = 0;
		int i;
		int previous;
		int current;

		while (k < m && k < n) {
			if (k + 1 == m || l + 1 == n) {
				break;
			}
			previous = a[k + 1][l];

			for (i = l; i < n; i++) {
				current = a[k][i];
				a[k][i] = previous;
				previous = current;
			}
			k++;
			for (i = k; i < m; i++) {
				current = a[i][n - 1];
				a[i][n - 1] = previous;
				previous = current;
			}
			n--;

			if (k < m) {
				for (i = n - 1; i >= l; i--) {
					current = a[m - 1][i];
					a[m - 1][i] = previous;
					previous = current;
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; i--) {
					current = a[i][l];
					a[i][l] = previous;
					previous = current;
				}
				n++;
			}
		}

		for (i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println("\n ");
		}

	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int row = a.length;
		int column = a[0].length;
		MatrixRotate(row, column, a);
	}

}
