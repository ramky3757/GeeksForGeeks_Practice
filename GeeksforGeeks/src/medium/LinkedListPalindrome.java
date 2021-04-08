package medium;

import java.util.Stack;

public class LinkedListPalindrome {

	public static void main(String[] args) {
			
		Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        
        boolean condition = isPalindrome(one);
        System.out.println("isPalidrome :" + condition);

	}
	
	
	public static boolean isPalindrome(Node head) {
		boolean isPalin = true;
		
		Node sl_ptr = head;
		Node curr = head;
		
		Stack<Node> stack = new Stack<Node>();
		
		while(sl_ptr!=null) {
			
			stack.push(sl_ptr);
			sl_ptr = sl_ptr.next;			
		}
		
		while(curr!=null) {
			Node temp = stack.pop();
			if(curr.data == temp.data) {
				isPalin = true;
			} else {
				isPalin = false;
				break;
			}			
			curr = curr.next;			
		}
		
		
		
		return isPalin;
	}
	
	

}


class Node{
	
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
	
}
