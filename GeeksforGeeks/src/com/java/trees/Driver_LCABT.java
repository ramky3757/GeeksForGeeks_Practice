package com.java.trees;

public class Driver_LCABT {

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
        
        System.out.println(tree.findLCAOfBT(4, 5));
       
       
        
       // System.out.println("is palin  "+isPalindrome(s));
        
        
	}
	
public TreeNode findLCAOfBT(TreeNode node, int n1, int n2) {
		
		TreeNode left = null;
		TreeNode right = null;
		
		if(node.getData() == n1||  node.getData() == n2) {
			return node;
		}
		
		if(node.leftNode!=null) {
			left = node.leftNode.findLCAOfBT(node.leftNode, n1, n2);
		}
		
		if(node.rightNode!=null) {		
			right = node.rightNode.findLCAOfBT(node.rightNode, n1, n2);
		}
		
		if(left!=null && right !=null) {
			return node;
		}
		
		return (left!=null)? left:right;
		
	}
	
	
	 public static boolean isPalindrome(String s) {
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i=0; i<s.length(); i++){
	           
	            if(Character.isLetter(s.charAt(i))){            
	               sb.append(s.charAt(i));
	            }
	        }
	        
	        s = sb.toString();
	        
	        if(s.equalsIgnoreCase(sb.reverse().toString())){
	            return true;
	        }
	        
	        return false;
	    }

}
