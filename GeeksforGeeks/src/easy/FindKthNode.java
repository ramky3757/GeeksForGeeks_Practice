package easy;

public class FindKthNode {

	public static void main(String[] args) {
		
		// input keys
        int[] keys = { 1, 2, 3, 4, 5 };
 
        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        int k = 3;
        Node node = findKthNode(head, k);
 
        if (node != null) {
            System.out.println("k'th node from the end is " + node.data);
        }

	}
	
	//two times loop will be traversed
	private static Node findKthNode(Node head, int k) {
		
		int n=0;
		Node curr = head;
		
		while(curr!=null) {			
			curr = curr.next;
			n++;			
		}
		
		System.out.println("size "+n);
		
		if(n>=k) {
			
			curr = head;
			
			for(int i=0; i<n-k;i++) {
				curr = curr.next;
			}
			
		}
		
		return curr;
	}
	
	//single time loop is traversed
	public static Node findKthNode1(Node head, int k)
    {
        Node curr = head;
 
        // move `k` nodes ahead in the linked list
        for (int i = 0; curr != null && i < k; i++) {
            curr = curr.next;
        }
 
        // return if `k` is more than the total number of nodes in the list
        if (curr == null) {
            return null;
        }
 
        // move the `head` and `curr` parallelly till `curr` reaches the list's end
        while (curr != null)
        {
            head = head.next;
            curr = curr.next;
        }
 
        // `head` will now contain the k'th node from the end
        return head;
    }

}





//A Linked List Node
class Node
{
 int data;
 Node next;

 Node(int data, Node next)
 {
     this.data = data;
     this.next = next;
 }
}
