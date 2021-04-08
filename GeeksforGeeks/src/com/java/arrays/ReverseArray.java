package com.java.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void reverse(int[] arr){

		int start =0 ;
		int end = arr.length;

		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
