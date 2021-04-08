package com.java.trees;

import java.util.Stack;

public class SpiralOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		tree.root = new TreeNode(1);
        tree.root.leftNode = new TreeNode(2);
        tree.root.rightNode = new TreeNode(3);
        tree.root.leftNode.leftNode = new TreeNode(4);
        tree.root.leftNode.rightNode = new TreeNode(5);
        tree.root.rightNode.leftNode = new TreeNode(6);
        tree.root.rightNode.rightNode = new TreeNode(7);
        
        //spiralOrderTraversal(tree.root);
        zigzagTraversal(tree.root);
		
	}
	
	public static void spiralOrderTraversal(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		int level = 1;
		
		 while (printLevelLeftToRight(root, level++) &&
                 printLevelRightToLeft(root, level++));
		
	}

	private static boolean printLevelRightToLeft(TreeNode root, int level) {
		// TODO Auto-generated method stub
		
		if(root == null) {
			return false;
		}
		
		if(level == 1) {
			System.out.println(root.getData());
			return true;
		}
		
		boolean right = printLevelRightToLeft(root.rightNode, level-1);
		boolean left = printLevelRightToLeft(root.leftNode, level-1);
		
		return left || right;
	}

	private static boolean printLevelLeftToRight(TreeNode root, int level) {
		// TODO Auto-generated method stub
		
		if(root == null) {
			return false;
		}
		
		if(level ==1) {
			System.out.println(root.getData());
			return true;
		}
		
		boolean left = printLevelLeftToRight(root.leftNode, level-1);
		boolean right = printLevelLeftToRight(root.rightNode, level-1);
		
		return left || right;
	}
	
	
	private static void zigzagTraversal(TreeNode head) {
		
		Stack<TreeNode> currentLevel = new Stack<TreeNode>();
		Stack<TreeNode> nextLevel = new Stack<TreeNode>();
		
		boolean isLeftToRight = true;
		currentLevel.push(head);
		
		while(!currentLevel.isEmpty()) {
			
			TreeNode temp = currentLevel.pop();
			System.out.println(temp.getData());
			
			if(isLeftToRight) {
				
				if(temp.leftNode!=null) {
					nextLevel.push(temp.leftNode);					
				}
				
				if(temp.rightNode!=null) {
					nextLevel.push(temp.rightNode);
				}
				
			} else {
				if(temp.rightNode!=null) {
					nextLevel.push(temp.rightNode);
				}
				
				if(temp.leftNode!=null) {
					nextLevel.push(temp.leftNode);					
				}
				
			}
			
			if(currentLevel.isEmpty()) {			
				isLeftToRight=!isLeftToRight;
				Stack<TreeNode> temp1 = currentLevel;
				currentLevel= nextLevel;
				nextLevel = temp1;
			}
		}
	}

}
