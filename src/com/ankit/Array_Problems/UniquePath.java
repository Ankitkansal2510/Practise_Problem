package com.ankit.Array_Problems;
/**number of unique path required to reach from top left corner of the matrix to bottom right corner of the matrix
 * 
 * you can move right or down
 * @author Ankit
 *
 */
public class UniquePath {
	 static int numberOfPaths(int m, int n) 
	    { 
	        // Create a 1D array to store results of subproblems 
	        int[] dp = new int[n]; 
	        dp[0] = 1; 
	  
	        for (int i = 0; i < m; i++) { 
	          for (int j = 1; j < n; j++) { 
	            dp[j] += dp[j - 1]; 
	          } 
	        } 
	  
	        return dp[n - 1]; 
	    } 
	   
	    // Driver program to test above function 
	    public static void main(String args[]) 
	    { 
	       // System.out.println(numberOfPaths(3, 2));  first approach
	        System.out.println(numberOfPAthsSecond(3,2)); //second approach https://www.youtube.com/watch?v=GO5QHC_BmvM
	    }

		private static int numberOfPAthsSecond(int m, int n) {

			int arr[][]=new int[m][n];	
			
			for(int i=0;i<m;i++)
			{
				arr[i][0]=1;
			}
			
			for(int j=0;j<n;j++)
			{
				arr[0][j]=1;
			}
			for(int i=1;i<m;i++)
			{
				for(int j=1;j<n;j++)
				{
					arr[i][j]=arr[i-1][j]+arr[i][j-1];
				}
			}
			return arr[m-1][n-1];
			
		} 
}
