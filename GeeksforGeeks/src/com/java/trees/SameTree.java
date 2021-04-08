package com.java.trees;

import java.util.Arrays;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1 = null ;
		String[] s2 = null ;
		
		Arrays.equals(s1, s2);

	}
	
	public boolean sameTree(TreeNode p, TreeNode q) {
		
		if(p==null && q == null) {
			return true;
		}
		
		if(p == null || q == null) {
			return false;			
		}
		
		if(p.getData() != q.getData()) {
			return false;
		}		
	
		return sameTree(p.leftNode, q.leftNode) && sameTree(p.rightNode, q.rightNode);
		
		
	}

}
