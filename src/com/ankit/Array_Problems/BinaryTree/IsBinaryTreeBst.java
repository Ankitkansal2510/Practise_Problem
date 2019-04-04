package com.ankit.Array_Problems.BinaryTree;

class Nood {
	int data;
	Nood left, right;

	public Nood(int data) {
		this.data = data;
		left = right = null;
	}
}

public class IsBinaryTreeBst {

	Nood root;

	public IsBinaryTreeBst() {
		root = null;
	}

	boolean isBST() {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBSTUtil(Nood node, int min, int max) {
		if (node == null) {
			return true;
		}

		if (node.data < min || node.data > max)
			return false;

		/*
		 * otherwise check the subtrees recursively tightening the min/max
		 * constraints
		 */
		// Allow only distinct values
		return (isBSTUtil(node.left, min, node.data ) && isBSTUtil(node.right, node.data , max));

	}

	public static void main(String[] args) {
		
	
		IsBinaryTreeBst tree = new IsBinaryTreeBst(); 
     tree.root = new Nood(4); 
     tree.root.left = new Nood(2); 
     tree.root.right = new Nood(5); 
     tree.root.left.left = new Nood(1); 
     tree.root.left.right = new Nood(3); 

     if (tree.isBST()) 
         System.out.println("IS BST"); 
     else
         System.out.println("Not a BST");

}
}
