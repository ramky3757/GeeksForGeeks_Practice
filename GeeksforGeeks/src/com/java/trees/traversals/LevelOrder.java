package com.java.trees.traversals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LevelOrder {
	
	public static void main(String[] args) {
		
		BTTree tree = new BTTree();
		tree.root = new TrNode(1);
		tree.root.left = new TrNode(2);
        tree.root.right = new TrNode(3);
        tree.root.left.left = new TrNode(4);
        tree.root.left.right = new TrNode(5);
        tree.root.right.left = new TrNode(6);
        tree.root.right.right = new TrNode(7);
        
        tree.levelOder(tree.root);
		
	}
	
	

}


class TrNode{
	
	int data;
	TrNode left;
	TrNode right;
	
	TrNode(int data){
		this.data = data;
		left=right=null;
	}
}


class BTTree{
	
	TrNode root;
	
	public void levelOrderTraversal(Map<Integer, ArrayList<Integer>> levelMap, TrNode root, int level) {
		
		if(root == null) {
			return;
		}
		
		
		levelMap.putIfAbsent(level, new ArrayList<>());		
		levelMap.get(level).add(root.data);
		
		levelOrderTraversal(levelMap, root.left, level+1);
		levelOrderTraversal(levelMap, root.right, level+1);
				
	}
	
	public void levelOder(TrNode root) {
		
		
		int level =1;
		Map<Integer, ArrayList<Integer>> levelMap = new HashMap<Integer, ArrayList<Integer>>();
		
		levelOrderTraversal(levelMap, root, level);
		
		 for(int i=1; i<=levelMap.size(); i++) {
			 System.out.println("Level "+i+ " ==>"+levelMap.get(i));
		 }
		
	}
	
}

