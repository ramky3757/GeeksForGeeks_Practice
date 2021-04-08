package com.java.trees.traversals;

import java.util.Stack;

public class PostOrder {

	public static void main(String[] args) {
	
		
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        
        tree.postOrder();
        System.out.println("Post Order - Recursion");
        tree.postOrderRecursion(tree.root);

	}

}


class BinaryTree{
	TreeNode root;
	
	void postOrder() {
		
		Stack<TreeNode>  s1 = new Stack<TreeNode> ();
		Stack<TreeNode> s2 = new Stack<TreeNode> ();
		
		s1.push(root);
		
		while(!s1.isEmpty()) {
			
			TreeNode temp = s1.pop();
			s2.push(temp);
			
			if(temp.left!=null)
				s1.push(temp.left);
			if(temp.right!=null)
				s1.push(temp.right);			
		}
		
		while(!s2.isEmpty()) {
			TreeNode temp = s2.pop();
			System.out.println(temp.data);
		}
		
	}
	
	void postOrderRecursion(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left!=null) {
			postOrderRecursion(root.left);
		}
		
		if(root.right!=null) {
			postOrderRecursion(root.right);
		}
		
		System.out.println(root.data);
		
		
	}
	
}


class TreeNode{
	
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
	}
}
