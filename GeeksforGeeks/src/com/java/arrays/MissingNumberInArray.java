package com.java.arrays;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,5};
		int n=5;
		
		missingNumber(array, n);
	}

	private static void missingNumber(int[] array, int n) {
		// TODO Auto-generated method stub
		
		int n_sum = n * (n+1)/2;
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {			
			sum+=array[i];
		}		
		System.out.println(n_sum-sum);
		
	
	}

}
