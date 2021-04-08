package com.java.trees;

public class LevelOrderInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree t2 = new Tree(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 }; 
        t2.insertLevelOrder(arr, 0); 
        t2.traverseInorder(t2.root);
        

	}

}
