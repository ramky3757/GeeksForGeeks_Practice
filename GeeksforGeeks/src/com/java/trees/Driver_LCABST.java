package com.java.trees;

public class Driver_LCABST {

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
		
		System.out.println(Driver_LCABST.findLCAOfBST(tree.root, 10,14));

		//System.out.println(Tree.findVal(22));
			
	}
	
public static int findLCAOfBST(TreeNode root, int n1, int n2){
		
		if(root.getData() > n1 && root.getData() > n2) {
			 return findLCAOfBST(root.leftNode, n1, n2);
		} 
		
		if (root.getData() < n1 && root.getData() < n2){
			 return findLCAOfBST(root.rightNode, n1, n2);
		}
		
		return root.getData();
	}

}
