package com.java.arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		
		anagram(a,b);

	}

	private static void anagram(String a, String b) {
		// TODO Auto-generated method stub
		
		char[] a_charArray = a.toCharArray();
		char[] b_charArray = b.toCharArray();
		
		Arrays.sort(a_charArray);
		Arrays.sort(b_charArray);
		
		System.out.println(Arrays.equals(a_charArray, b_charArray));		
	}

}
