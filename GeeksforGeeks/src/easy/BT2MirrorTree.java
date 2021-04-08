package easy;



public class BT2MirrorTree {

	public static void main(String[] args) {
	
		
		Node1 tree = createNode(5);
	    tree.left = createNode(3);
	    tree.right = createNode(6);
	    tree.left.left = createNode(2);
	    tree.left.right = createNode(4);
	 
	    // Print inorder traversal of the input tree
	    System.out.print("Inorder of original tree: ");
	    inorder(tree);
	    Node1 mirror = null;
	    mirror = mirrorTree(tree);
	 
	    // Print inorder traversal of the mirror tree
	    System.out.print("\nInorder of mirror tree: ");
	    inorder(mirror);
		
		
		

	}
	
	static Node1 createNode(int val)
	{
	    Node1 newNode = new Node1(val);	
	    newNode.left = null;
	    newNode.right = null;
	    return newNode;
	}
	
	static void inorder(Node1 root)
	{
	    if (root == null)
	        return;
	    inorder(root.left);
	    System.out.print(root.data);
	    inorder(root.right);
	}
	
	
	public static Node1 mirrorTree(Node1 root){
		
		 if (root == null)
		    {
		        return null;
		         
		    }
		
		int val = root.data;
		Node1 mirror = new Node1(val);
		mirror.left = mirrorTree(root.right);
		mirror.right = mirrorTree(root.left);		
		
		return mirror;
	}

}


class Node1{
	
	int data;
	Node1 left;
	Node1 right;
	
	Node1(int data){
		this.data = data;
	}
}


