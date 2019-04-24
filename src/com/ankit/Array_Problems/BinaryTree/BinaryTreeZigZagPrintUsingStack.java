package com.ankit.Array_Problems.BinaryTree;

import java.util.Stack;

//Time complexity o(n2)

class Nodt {
	int data;
	Nodt left;
	Nodt right;

	public Nodt(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTreeZigZagPrintUsingStack {

	Nodt root;

	public BinaryTreeZigZagPrintUsingStack() {
		root = null;
	}

	public void printZigZag(Nodt node) {

		if (node == null)
			return; // NULL check

		// Create two stacks to store alternate levels
		// For levels to be printed from right to left
		Stack<Nodt> s1 = new Stack<Nodt>();
		// For levels to be printed from left to right
		Stack<Nodt> s2 = new Stack<Nodt>();

		// Push first level to first stack 's1'
		s1.push(node);

		// Keep printing while any of the stacks has some nodes
		while (!s1.empty() || !s2.empty()) {
			// Print nodes of current level from s1 and push nodes of
			// next level to s2
			while (!s1.empty()) {
				Nodt temp = s1.peek();
				s1.pop();
				System.out.print(temp.data + " ");

				if (temp.right != null)
					s2.push(temp.right);

				if (temp.left != null)
					s2.push(temp.left);

			}

			while (!s2.empty()) {
				Nodt temp = s2.peek();
				s2.pop();
				System.out.print(temp.data + " ");

				if (temp.left != null)
					s1.push(temp.left);
				if (temp.right != null)
					s1.push(temp.right);

			}
		}

	}

	public static void main(String[] args) {
		BinaryTreeZigZagPrintUsingStack tree = new BinaryTreeZigZagPrintUsingStack();
		tree.root = new Nodt(7);
		tree.root.left = new Nodt(4);
		tree.root.right = new Nodt(5);
		tree.root.left.left = new Nodt(9);
		tree.root.left.left.left = new Nodt(6);
		tree.root.left.left.right = new Nodt(11);
		tree.root.right.right = new Nodt(10);
		tree.printZigZag(tree.root);

	}

}
