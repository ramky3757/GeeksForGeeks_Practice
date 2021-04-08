package com.java.trees;


public class TreeNode {

	
	private int data;
	
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	
	TreeNode leftNode;
	TreeNode rightNode;
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	
	public static TreeNode findLCAOfBST(TreeNode root, int n1, int n2){
		
		
		if(root.data > n1 && root.data > n2) {
			 return findLCAOfBST(root.leftNode, n1, n2);
		} 
		
		if (root.data < n1 && root.data < n2){
			return findLCAOfBST(root.rightNode, n1, n2);
		}
		
		return root;
	}
	
	
	public TreeNode findLCAOfBT(TreeNode node, int n1, int n2) {
		
		TreeNode left = null;
		TreeNode right = null;
		
		if(node.data == n1||  node.data == n2) {
			return node;
		}
		
		if(leftNode!=null) {
			left = leftNode.findLCAOfBT(leftNode, n1, n2);
		}
		
		if(rightNode!=null) {		
			right = rightNode.findLCAOfBT(rightNode, n1, n2);
		}
		
		if(left!=null && right !=null) {
			return node;
		}
		
		return (left!=null)? left:right;
		
	}
	
	 public boolean findVal(TreeNode node, int key) {
		 
		 if(node.data == key) {
			 return true;
		 }
		 
		 if(leftNode!=null) {
			 findVal(leftNode, key);
		 }
		 
		 if(rightNode!=null) {
			 findVal(rightNode, key);
		 }
		 
		 return false;
	 }
	public void insertLevelOrder(int[] arr, int i) {
		// TODO Auto-generated method stub
		
		if(i<arr.length) {
			
			if(leftNode!=null) {
				insertLevelOrder(arr, 2*i+1);	
			} else {
				leftNode = new TreeNode(2*i+1);
			}
			
			if(rightNode!=null) {
				insertLevelOrder(arr, 2*i+2);
			} else {
				rightNode = new TreeNode(2*i+2);
			}
				
		}
	}
	
	public void traverseInorder() {
		
		if(leftNode!=null) {
			leftNode.traverseInorder();
		}
		
		System.out.println(data);
		
		if(rightNode!=null) {
			rightNode.traverseInorder();
		}
		
	}
	
	public void printLeftViewTree(TreeNode root, int level) {
		
		int max = 0;
		if(root == null) {
			return;
		}
		
		if(max<level) {
			System.out.print(data);
			max = level;
		}
		
		printLeftViewTree(root.leftNode, level+1);
		printLeftViewTree(root.rightNode, level+1);
		
	}
	
	
}
