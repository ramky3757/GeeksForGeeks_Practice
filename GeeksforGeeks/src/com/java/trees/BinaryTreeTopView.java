package com.java.trees;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeTopView {
	
	// Initialising node
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }
	
 // Node structure
    static class Node {
        // Data of the node
        int data;
 
        // Reference to left node
        Node left;
 
        // Reference to right node
        Node right;
    };
    static class pair {
        int data, height;
        public pair(int data, int height)
        {
            this.data = data;
            this.height = height;
        }
    }
    
	public static void main(String[] args)
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.right = newNode(4);
        root.left.right.right = newNode(5);
        root.left.right.right.right = newNode(6);
 
        System.out.print("Top View : ");
        printTopView(root);
    }

	private static void printTopView(Node root) {
		
		Map<Integer, pair> map = new HashMap<Integer, pair> ();
		topViewUtil(map, 0, 0, root);
		
		for (Map.Entry<Integer, pair> it : map.entrySet()) {
            pair p = it.getValue();
            System.out.print(p.data + " ");
        }
		
		
	}

	private static void topViewUtil(Map<Integer, pair> map, int hd, int height, Node root) {
		
		if(root == null) return;
		
		if(!map.containsKey(hd)) {
			map.put(hd, new pair(root.data, height));
		} else {
			pair p = map.get(hd);
			if(p.height >=height) {
				map.put(hd, new pair(root.data, height));
			}
		}
		
		topViewUtil(map, hd-1, height+1, root.left);
		topViewUtil(map, hd+1, height+1, root.right);
		
	}
	
	// Driver code
    public static void main1(String[] args)
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.right = newNode(4);
        root.left.right.right = newNode(5);
        root.left.right.right.right = newNode(6);
 
        System.out.print("Top View : ");
        printTopView(root);
    }

}
