package com.java.trees;


public class SortedArray2BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int [] {-10,-3,0,5,9};
	}
	
	
	public TreeNode array2BST(int[] nums, int start, int end) {
		
		int mid = start+(end-start)/2;
		
		TreeNode node = new TreeNode(nums[mid]);
		node.leftNode = array2BST(nums, start, mid-1);
		node.rightNode = array2BST(nums, mid+1, end);
		
		return node;
		
	}
	
	

}
