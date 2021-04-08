package com.java.linkedlist;

import java.util.HashSet;

public class Node {
	
	int val;
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


	Node next;
	
	public Node(int val) {
		this.val = val;
		next = null;
	}
	
	public static void main(String[] args) {
		//converttoInt();
		//numToString();
	}

	private static void converttoInt() {
		// TODO Auto-generated method stub		
		
	}
	

class TreeNode{
	
	Node head;
	
	public void insertFirst(int val) {
		Node new_Node = new Node(val);
		new_Node.next = head;
		head = new_Node;
	}
	
	public Node findMiddle(Node head) {
		
		Node fst_ptr = head;
		Node slw_ptr = head;
		
		while(fst_ptr!=null) {
			fst_ptr = fst_ptr.next.next;
			slw_ptr = slw_ptr.next;
		}
		
		return slw_ptr;		
	}
	
	public void detectLoop(Node head) {
		
		Node fst_ptr = head;
		Node slw_ptr = head;
		
		while(fst_ptr!=null && slw_ptr!=null && fst_ptr.next!=null) {
			fst_ptr = fst_ptr.next.next;
			slw_ptr = slw_ptr.next;
			
			if(slw_ptr == fst_ptr) {
				System.out.println("Loop found ");
				break;
			}
			
		}
		
	}
	
	public void detectLoopv2(Node head) {		
		HashSet<Node> nodeSet = new HashSet<Node>();
		Node temp = head;
		nodeSet.add(temp);
		
		while(temp!=null && temp.next!=null){
			temp = temp.next;
			
			if(nodeSet.contains(temp)) {
				System.out.println("loop detected");
				break;
			} else {
				nodeSet.add(temp);
			}
		}
	}
	
	public Node reverseLinkedList(Node head) {
		
		Node prev= null;
		Node curr = head;
		Node next = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			curr = next;
			prev = curr;
		}		
		return prev;
	}
	
	public Node findJoinInListv2(Node head1, Node head2) {
		
		HashSet<Node> nodeSet = new HashSet<Node>();
		while(head1.next!=null) {
			nodeSet.add(head.next);
		}
		
		while(head2.next!=null) {
			
			if(nodeSet.contains(head2.next)) {
				return head2.next;
			} else {
				nodeSet.add(head2.next);
			}
		}
		
		return null;
	}
	
	public Node findJoinInList(Node head1, Node head2) {
		
		int head1_length = findLength(head1);
		int head2_length = findLength(head2);
		int counter = 1;
		if(head1_length > head2_length) {
			
			int diff = head1_length - head2_length;
			 while(counter<=diff) {				 
				 head1 = head1.next;
			 }
		}
		
		// same code if second Node length is greater than Head1
		
		while(head1!=null && head1.next !=null && head2!=null & head2.next!=null) {
			 if(head1.val == head2.val) {
				 return head1;
			 }
			
			head1 =head1.next;
			head2 = head2.next;
		}
		
		return head1;
		
	}

	private int findLength(Node head1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
	
}