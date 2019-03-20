package com.ankit.Array_Problems;

public class RemoveDuplicates_From_SortedArray {
	
	public static void main(String[] args) {
		int arr[]={0,0,1,1,1,2,2,3,3,4};
		int length=RemoveDuplicate(arr);
		System.out.println("The length of the new array is : " + length);
		
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	private static int RemoveDuplicate(int[] arr) {
		
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]!=arr[i])
			{
				i++;
				arr[i]=arr[j];
			}
		}
		
		return i+1;
	}

}
