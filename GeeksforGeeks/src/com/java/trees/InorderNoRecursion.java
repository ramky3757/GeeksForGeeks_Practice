package com.java.trees;

import java.util.Stack;

public class InorderNoRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inOrder();
	}

}


class BinaryTree{
	
	Node root;
	
	void inOrder() {
		
			if(root == null) {
				return;
			}
			
			Stack<Node> s = new Stack<Node>();
			Node curr = root;
			
			while(curr!=null || s.size() >0) {
				
				while(curr!=null) {
					
					s.push(curr);				
					curr = curr.left;
				
				}
				
				curr = s.pop();
				System.out.println(curr.data);
				
				curr = curr.right;
				
			}
	}
	

	
	
	
}

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
