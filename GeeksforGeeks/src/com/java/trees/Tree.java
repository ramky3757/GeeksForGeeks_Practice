package com.java.trees;

public class Tree {

	TreeNode root;
	
	public int findLCAOfBST(int n1, int n2){
		
		if(root == null) {
			return -1;
		} else 
			return root.findLCAOfBST(root, n1, n2).getData();
		
	}
	
	
public int findLCAOfBT(int n1, int n2){
		
		if(root == null) {
			return -1;
		} else 
			return root.findLCAOfBT(root, n1, n2).getData();
		
}

public  boolean findVal(int val) {
	
	if(root == null) {
		return false;
	} else 
		return root.findVal(root, val);
}


public void insertLevelOrder(int[] arr, int i) {
	// TODO Auto-generated method stub	
	
	if(root == null) {
		root = new TreeNode(arr[i]);
	} else {
		root.insertLevelOrder(arr, i);
	}
}


public void traverseInorder(TreeNode root) {
	// TODO Auto-generated method stub
	
	root.traverseInorder();
	
}
	
	
}
