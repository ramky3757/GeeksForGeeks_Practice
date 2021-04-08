package com.java.trees;

public class BalancedBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		tree.root = new TreeNode(20); 
        tree.root.leftNode = new TreeNode(8); 
        tree.root.rightNode = new TreeNode(22); 
        tree.root.leftNode.leftNode = new TreeNode(4); 
        tree.root.leftNode.rightNode = new TreeNode(12); 
        tree.root.leftNode.rightNode.leftNode = new TreeNode(10); 
        tree.root.leftNode.rightNode.rightNode = new TreeNode(14);
        
        BalancedBT bt = new BalancedBT();
        System.out.println(bt.isBalanced(tree.root));
        
		
	}

	/*
	 * Balanced Tree is whose leftTree height & rightTree height, should not be greater than 1. 
	 */
	public boolean isBalanced(TreeNode root) {
		
		int lh;
		int rh;
		
		if(root == null) {
			return true;
		}
		
		lh = height(root.leftNode);
		rh = height(root.rightNode);
		
		if(Math.abs(lh-rh)<=1 && isBalanced(root.leftNode) && isBalanced(root.rightNode)) {
			return true;
		}
		
		return false;
	}
	
	public int height(TreeNode node) {
		
		if(node==null) {
			return 0;
		}
		
		//incrementing count if the node is not null
		return 1+ Math.max(height(node.leftNode), height(node.rightNode)); 
	}
	
}
