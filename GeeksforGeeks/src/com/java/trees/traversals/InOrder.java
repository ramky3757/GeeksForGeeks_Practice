package com.java.trees.traversals;

import java.util.Stack;

public class InOrder {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.inOrder();
        System.out.println("With Recursion");
        tree.inOrderRecursion(tree.root);
	}
}

class Tree{	
	Node root;
	
	
	void inOrder() {
		
		Stack<Node> stack = new Stack<Node>();
		Node curr = root;
		
		while(curr!=null || stack.size()>0) {
			
			while(curr!=null) {
				stack.push(curr);
				curr = curr.left;
			}
			
			curr = stack.pop();
			System.out.println(curr.data);
			curr = curr.right;			
		}		
	}
	
	void inOrderRecursion(Node root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left!=null) {
			inOrderRecursion(root.left);
		}
		
		System.out.println(root.data);
		
		if(root.right!=null) {
			inOrderRecursion(root.right);
		}
		
	}
	
}


class Node{
	
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		left = right= null;
	}
}
