package com.ankit.Array_Problems.dp;

public class LongestCommonSubstring {

	public static void findLongestCommonSubstring(String s1,String s2)
	{
		int temp[][]=new int[s2.length()+1][s1.length()+1];
		
		for(int i=1;i<s2.length();i++)
		{
			for(int j=1;j<=s1.length();j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					temp[i][j]=temp[i-1][j-1]+1;
				}
				else
				{
					temp[i][j]=0;
				}
			}
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		String s1="abcdaf";
		String s2="zbcdf";
		
		findLongestCommonSubstring(s1,s2);
				

	}

}
