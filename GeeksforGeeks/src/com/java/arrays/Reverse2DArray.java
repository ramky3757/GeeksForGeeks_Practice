package com.java.arrays;

import java.util.Arrays;

public class Reverse2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

			//Function call
			reverseArray(arr);	
	}

	private static void reverseArray(int[][] arr) {
		// TODO Auto-generated method stub
		
		int[][] new_arr = new int[3][3];
		
		int start =0;
		
		for(int i=0; i<arr.length; i++) {
			start = 0;
			
			for(int j=arr.length-1; j>=0; j--) {				
				new_arr[start][i] = arr[j][i];
				start++;
			}
		}
		
		for (int i = 0; i <new_arr.length; i++) {
	        for (int j = 0; j < new_arr.length; j++) {
	            System.out.print(new_arr[i][j] + " ");
	        }
		
	}
	}

}
