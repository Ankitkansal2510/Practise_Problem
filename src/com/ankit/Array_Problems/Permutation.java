package com.ankit.Array_Problems;

/**
 * Java Program to print all permutations of a given string A permutation, also
 * called an “arrangement number” or “order, ” is a rearrangement of the
 * elements of an ordered list S into a one-to-one correspondence with S itself.
 * A string of length n has n! permutation. Source:
 * Mathword(http://mathworld.wolfram.com/Permutation.html)
 * 
 * Below are the permutations of string ABC. ABC ACB BAC BCA CBA CAB
 **/
public class Permutation {

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		Permute(str, 0, n - 1);

	}

	private static void Permute(String str, int i, int j) {
		if (i == j) {
			System.out.println(str);
		} else {
			for (int k = i; k <= j; k++) {
				
				str = swap(str, i, k);
				Permute(str,i+1,j);
				str = swap(str, i, k);
			}
		}

	}

	private static String swap(String str, int i, int k) {

		char temp;
		char[] charArray = str.toCharArray();

		temp = charArray[i];
		charArray[i] = charArray[k];
		charArray[k] = temp;
		return String.valueOf(charArray);

	}

}
