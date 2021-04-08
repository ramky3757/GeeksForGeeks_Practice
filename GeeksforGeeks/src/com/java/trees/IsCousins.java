package com.java.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IsCousins {
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
        tree.root.leftNode = new TreeNode(2);
        tree.root.rightNode = new TreeNode(3);        
        tree.root.leftNode.rightNode = new TreeNode(4);
        //tree.root.rightNode.leftNode = new TreeNode(6);
        tree.root.rightNode.rightNode = new TreeNode(5);
        
        System.out.println(isCousins(tree.root, 4, 5));
		
	}
	
public static boolean isCousins(TreeNode root, int x, int y) {
        
        int level = 1;
        HashMap<Integer, ArrayList<Integer>> levelMap = new HashMap<Integer, ArrayList<Integer>>();
        levelOrder(root, level, levelMap);
        
        System.out.println(levelMap.toString());
        
        int size = levelMap.size();
        
        ArrayList<Integer> list = levelMap.get(size);
        
       if(list.contains(x) && list.contains(y)) return true;
        
        return false;
    }

public static void levelOrder(TreeNode root, int level, Map<Integer, ArrayList<Integer>> map){
    
    if(root == null){
        return;
    }
    
    map.putIfAbsent(level, new ArrayList<Integer>());
    map.get(level).add(root.getData());
    
    levelOrder(root.leftNode, level+1, map);
    levelOrder(root.rightNode, level+1, map);
    
}

}
