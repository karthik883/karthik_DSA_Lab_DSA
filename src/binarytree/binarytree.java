package binarytree;

public class binarytree {
	public static void main(String[] args) {
		Node root = null;
	     root = new Node(10);
	     root.left = new Node(20);
	     root.right = new Node(30);
	     root.left.left = new Node(40);
	     root.left.right = new Node(50);
	     root.right.left = new Node(60);
	     root.right.right = new Node(70);
	     
	     TreeTraversal traverse = new TreeTraversal();
	     System.out.println("THe inorder will be:");
	     traverse.inorder(root);
	     System.out.println("The postorder will be:");
	     traverse.postorder(root);
	     System.out.println("THe preorder will be:");
	     traverse.preorder(root);
	     
		
	}

}
