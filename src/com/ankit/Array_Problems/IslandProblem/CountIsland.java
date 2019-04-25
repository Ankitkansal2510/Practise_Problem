package com.ankit.Array_Problems.IslandProblem;


//Time complexity=O(ROW * COL)
public class CountIsland {
	static final int ROW = 5, COL = 5;

	public int countIslands(int M[][]) {
			
		boolean visited[][]=new boolean[ROW][COL];
		int count=0;
		
		for(int i=0;i<ROW;i++)
		{
			for(int j=0;j<COL;j++)
			{
				if(M[i][j]==1 && !visited[i][j])
				{
					DFS(M,i,j,visited);
					count++;
				}
			}
		}
		
		return count;
	}

	public void DFS(int M[][], int row, int col, boolean visited[][]) {
		int rowbr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colbr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
		
		visited[row][col]=true;
		
		for(int k=0;k<8;k++)
		{
			if(isSafe(M,row+rowbr[k],col+colbr[k],visited))
			{
				DFS(M,row+rowbr[k],col+colbr[k],visited);
			}
		}
		
	}

	public boolean isSafe(int M[][], int row, int col, boolean visited[][]) {
		
		return (row>=0) && (col>=0) &&
				(row<ROW) && (col<COL)&&
				(M[row][col]==1 && !visited[row][col]);
	}

	public static void main(String[] args) {
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };
		CountIsland I = new CountIsland();
		System.out.println("Number of islands is: " + I.countIslands(M));

	}

}
