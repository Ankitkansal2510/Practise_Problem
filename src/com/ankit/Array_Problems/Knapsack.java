package com.ankit.Array_Problems;

public class Knapsack {

	public static void main(String[] args) {
		
		
		int weight[]={1,3,4,5};
		int value[]={1,4,5,7};
		
		/*int weight[]={10, 20, 30};
		int value[]={60, 100, 120};*/
		
		int totalWeight=7;
		
		System.out.println("Maximum value whose weight is not more than total weight is : " + find(weight,value,totalWeight));

	}

	private static int find(int[] weight, int[] value, int totalWeight) {
		
		
		int temp[][]=new int[weight.length+1][totalWeight+1];
		
		for(int i=1;i<=weight.length;i++)
		{
			for(int j=1;j<=totalWeight;j++)
			{
				if(j>=weight[i-1])
				{
					temp[i][j]=Math.max(temp[i-1][j-weight[i-1]]+value[i-1],temp[i-1][j]);
				}
				else
				{
					temp[i][j]=temp[i-1][j];
				}
			}
		}
		
		return temp[weight.length][totalWeight];
	}

}
