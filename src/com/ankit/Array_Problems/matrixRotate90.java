package com.ankit.Array_Problems;

/**rotate matrix by 90 degree
 * 
 *  You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
 *  
 *  
 *  **/

public class matrixRotate90 {

	
	public static void main(String[] args) {
		
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		rotateby90(arr);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotateby90(int[][] matrix) {
		 int N = matrix.length;
		    int n = matrix.length - 1;

		    for (int i = 0; i < N / 2; i ++) {
		        for (int j = i; j < N - i - 1; j ++) {
				    /** rotate from the outer ring to the inner one **/
		            /** A[i][j] -> A[j][n - i] -> A[n - i][n - j] -> A[n - j][i] -> A[i][j] **/
		            int t = matrix[i][j];
		            matrix[i][j] = matrix[n - j][i];
		            matrix[n - j][i] = matrix[n - i][n - j];
		            matrix[n - i][n - j] = matrix[j][n - i];
		            matrix[j][n - i] = t;
		        }
		    }
		
	}

}
