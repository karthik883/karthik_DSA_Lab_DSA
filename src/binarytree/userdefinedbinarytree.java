package binarytree;

import java.util.Scanner;

public class userdefinedbinarytree {
	public static void main(String[] args) {
		Node root = null;
		root = createuserdefinedbinarytree();
		
		TreeTraversal traverse = new TreeTraversal();
	     System.out.print("THe inorder will be:");
	     traverse.inorder(root);
	     System.out.print("The postorder will be:");
	     traverse.postorder(root);
	     System.out.print("THe preorder will be:");
	     traverse.preorder(root);
	}

	private static Node createuserdefinedbinarytree() {
		Node root = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data:");
		int data = sc.nextInt();
		if(data == -1) {
			return null;
		}
			root = new Node(data);
			System.out.println("Enter data for left of "+data);
			root.left = createuserdefinedbinarytree();
			System.out.println("Enter data for the right of"+data);
			 root.right = createuserdefinedbinarytree();
			 return root;
		
	}
}

