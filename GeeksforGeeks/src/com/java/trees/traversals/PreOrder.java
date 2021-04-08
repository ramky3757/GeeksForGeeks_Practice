package com.java.trees.traversals;

import java.util.Stack;

public class PreOrder {

	public static void main(String[] args) {
		
		BTree tree = new BTree();
		tree.root = new TNode(1);
		tree.root.left = new TNode(2);
        tree.root.right = new TNode(3);
        tree.root.left.left = new TNode(4);
        tree.root.left.right = new TNode(5);
        
        tree.postOrder();
        System.out.println("With Recursion");
        tree.preOrderRecursion(tree.root);
	}

}


class BTree{
	
	TNode root;
	
	void postOrder() {
		
		Stack<TNode> stack = new Stack<TNode>();
		TNode curr = root;
		
		
		while(curr!=null || stack.size()>0) {
			
			while(curr!=null) {
			System.out.println(curr.data);
			
			if(curr.right!=null) {
				stack.push(curr.right);
			}
			curr = curr.left;
		}
			if(!stack.isEmpty())
				curr = stack.pop();
			
		}
	}
	
	void preOrderRecursion(TNode root) {
		
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		
		if(root.left!=null) {
			preOrderRecursion(root.left);
		}
		
		if(root.right!=null) {
			preOrderRecursion(root.right);
		}
		
	}
}

class TNode{
	int data;
	TNode left;
	TNode right;
	
	TNode(int data){
		this.data = data;
		left = right= null;
	}
}
