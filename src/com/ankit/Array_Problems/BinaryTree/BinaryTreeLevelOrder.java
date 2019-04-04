package com.ankit.Array_Problems.BinaryTree;

//Time complexity is o(n2)

class Nodee {
	int data;
	Nodee left;
	Nodee right;

	public Nodee(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTreeLevelOrder {
	Nodee root;
	
	public BinaryTreeLevelOrder() {
		root = null;
	}

	public void printLevelOrder() {
		int h = height(root);
		
		System.out.println("Height of a given tree is : " + h);
		for (int i = 1; i <= h; i++) {
			printGivenLevelOrder(root, i);
			System.out.println( " ");
		}
	}

	public void printGivenLevelOrder(Nodee root, int level) {
		
		if (root == null) {
			return;
		}

		if (level == 1) {
			
			System.out.print(root.data + " ");
		} else if (level > 1) {
			printGivenLevelOrder(root.left, level - 1);
			printGivenLevelOrder(root.right, level - 1);

		}
	}

	public int height(Nodee root) {
		if (root == null) {
			return 0;
		}

		int lheight = height(root.left);
		int rheight = height(root.right);

		if (lheight > rheight) {
			return lheight + 1;
		} else {
			return rheight + 1;
		}
	}

	public static void main(String[] args) {
		BinaryTreeLevelOrder tree = new BinaryTreeLevelOrder();
		tree.root = new Nodee(1);
		tree.root.left = new Nodee(2);
		tree.root.right = new Nodee(3);
		tree.root.left.left = new Nodee(4);
		tree.root.left.right = new Nodee(5);
		tree.printLevelOrder();

	}

}
