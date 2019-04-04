package com.ankit.Array_Problems.BinaryTree;

//Time complexity o(n2)


class Nodeeee {
	int data;
	Nodeeee left;
	Nodeeee right;

	public Nodeeee(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTreeZigZagPrint {

	Nodeeee root;

	public BinaryTreeZigZagPrint() {
		root = null;
	}

	public void printZigZag(Nodeeee root) {

		int flag = 0;

		int h = height(root);

		for (int i = 1; i <= h; i++) {
			if (flag == 1) {
				printrighttoleft(root, i);
				flag = 0;
			} else if (flag == 0) {
				printleftToRight(root, i);
				flag = 1;
				
			}

		}
	}

	private void printleftToRight(Nodeeee root2, int level) {
		if (root2 == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root2.data + " ");
		} else if (level > 1) {
			printrighttoleft(root2.left, level - 1);
			printrighttoleft(root2.right, level - 1);

		}

	}

	private void printrighttoleft(Nodeeee root2, int level) {

		if (root2 == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root2.data + " ");
		} else if (level > 1) {
			printrighttoleft(root2.right, level - 1);
			printrighttoleft(root2.left, level - 1);
		}

	}

	public int height(Nodeeee root) {
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
		BinaryTreeZigZagPrint tree = new BinaryTreeZigZagPrint();
		tree.root = new Nodeeee(7);
		tree.root.left = new Nodeeee(4);
		tree.root.right = new Nodeeee(5);
		tree.root.left.left = new Nodeeee(9);
		tree.root.left.left.left = new Nodeeee(6);
		tree.root.left.left.right = new Nodeeee(11);
		tree.root.right.right = new Nodeeee(10);
		tree.printZigZag(tree.root);

	}

}
