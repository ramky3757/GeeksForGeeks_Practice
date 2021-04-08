package com.java.arrays;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		findSubArray(arr, 15);
		

	}

	private static void findSubArray(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		int cur_sum = arr[0];
		int start = 0;
		boolean found = false;
		for(int i=1; i<arr.length; i++) {
			
			while(cur_sum>sum && start<i-1) {				
				cur_sum = cur_sum - arr[start];
				start++;
			}
			
			if(cur_sum == sum) {	
				found = true;
				int k = i-1;				
				System.out.println("Sum of given number can be found from "+start+ " "+k);
				break;
			}
			
			if(cur_sum<sum) {
				cur_sum += arr[i];
			}
			
		}
		if(!found) {
			System.out.println("No sub array found");
		}
		
	}

}
