package com.ankit.Array_Problems.dp;


/**Program to find the length of the longest common subsequence 
 * 
 * example 
 * String s1="abcdaf"
 * String s2="acbcf"
 * 
 *  output=4
 *  
 *  longest common subsequence is abcf
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * **/ 
public class LongestCommonSubsequence {

	public int lcs(char[] str1, char[] str2) {

		int temp[][] = new int[str1.length + 1][str2.length + 1];
		int max = 0;
		for (int i = 1; i < temp.length; i++) {
			for (int j = 1; j < temp[i].length; j++) {
				if (str1[i - 1] == str2[j - 1]) {
					temp[i][j] = temp[i - 1][j - 1] + 1;
				} else {
					temp[i][j] = Math.max(temp[i - 1][j], temp[i][j - 1]);
				}

				if (temp[i][j] > max) {
					max = temp[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		String str1 = "ABCDGHLQR";
		String str2 = "AEDPHR";

		int result = l.lcs(str1.toCharArray(), str2.toCharArray());
		System.out.println(result);

	}

}
