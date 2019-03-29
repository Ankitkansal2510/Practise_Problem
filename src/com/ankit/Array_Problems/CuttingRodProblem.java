package com.ankit.Array_Problems;

public class CuttingRodProblem {
	static int cutRod(int price[],int n) 
	{
		int val[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			int maxValue=-1;
			for(int j=0;j<i;j++)
			{
				int temp=price[j]+val[i-j-1];
				if(temp>maxValue)
				{
					maxValue=temp;
				}
				
				val[i]=maxValue;
			}
		}
		return val[n];
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        System.out.println("Maximum Obtainable Value is " + 
                            cutRod(arr, size)); 

	}

}
