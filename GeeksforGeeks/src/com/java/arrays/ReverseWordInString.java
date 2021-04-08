package com.java.arrays;

import java.util.Arrays;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "geeks quiz practice code";
		
		reverseWord(s);
		reverseWord(s, "");
	}

	private static void reverseWord(String s, String string) {
		// TODO Auto-generated method stub
		
		char[] chrArray = s.toCharArray();
		int start =0;
		
		for(int i=0; i<chrArray.length; i++) {
			if(chrArray[i]==' ') {				
				reverse(chrArray, start, i);
				start = i+1;
			}
		}
		
		System.out.println(Arrays.toString(chrArray));
	}

	private static void reverse(char[] s, int start, int i) {
		// TODO Auto-generated method stub
		
		while(start<=i) {			
			char temp = s[start];
			s[start] = s[i];
			s[i] = temp;
			start++;
			i--;
		}
		
	}

	private static void reverseWord(String s) {
		// TODO Auto-generated method stub
		
			String[] strArray = s.split(" ");
			String reverse = "";
			for(int j=strArray.length-1; j>-1; j--) {
				
				for(int i=0; i<strArray[j].length(); i++) {
					reverse+=strArray[j].charAt(i);				
				}
				reverse+=" ";
			}		
		System.out.println(reverse);
		
	}
}
