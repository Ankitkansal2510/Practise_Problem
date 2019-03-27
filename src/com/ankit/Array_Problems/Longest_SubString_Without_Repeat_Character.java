package com.ankit.Array_Problems;
/*iven a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.*/
import java.util.HashSet;
import java.util.Set;

public class Longest_SubString_Without_Repeat_Character {
	
	public static int findlon(String str)
	{
	
		int startIndex=0 , endIndex=0;
		int n =str.length();
		int result=0;
		Set<Character> set=new HashSet<>();
		while(startIndex < n && endIndex <n)
		{
			if(set.contains(str.charAt(startIndex)))
			{
				set.remove(endIndex++);
			}
			else
			{
				set.add(str.charAt(startIndex++));
				result=Math.max(result, startIndex-endIndex);
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String check="abcabcbb";
		int result=findlon(check);
		System.out.println(result);
	}

}
