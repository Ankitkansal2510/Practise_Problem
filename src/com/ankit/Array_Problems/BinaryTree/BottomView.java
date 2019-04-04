package com.ankit.Array_Problems.BinaryTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import javax.swing.RowFilter.Entry;

class Nodte {
	int data;
	Nodte left, right;

	public Nodte(int data) {
		this.data = data;
	}
}

public class BottomView {

	Nodte root;

	public BottomView() {
		root = null;
	}

	public void topView(Nodte node) {
		class QueueObj {
			Nodte node;
			int hd;

			public QueueObj(Nodte root, int hd) {
				this.node = root;
				this.hd = hd;
			}
		}

		Queue<QueueObj> q = new LinkedList<>();
		Map<Integer, Nodte> map = new TreeMap<>();

		if (root == null) {
			return;
		} else {
			q.add(new QueueObj(root, 0));
		}
		while (!q.isEmpty()) {
			QueueObj tempNode = q.poll();

			map.put(tempNode.hd, tempNode.node);

			if (tempNode.node.left != null) {
				q.add(new QueueObj(tempNode.node.left, tempNode.hd - 1));
			}

			if (tempNode.node.right != null) {
				q.add(new QueueObj(tempNode.node.right, tempNode.hd + 1));
			}
		}

		for (java.util.Map.Entry<Integer, Nodte> entry : map.entrySet()) {
			System.out.print(entry.getValue().data + " ");
		}
	}
	
	public static void main(String[] args) {
		BottomView tree = new BottomView();
		tree.root = new Nodte(20);
		tree.root.left = new Nodte(8);
		tree.root.right = new Nodte(22);
		tree.root.left.left = new Nodte(5);
		tree.root.left.right = new Nodte(3);
		tree.root.left.right.left = new Nodte(10);
		tree.root.left.right.right = new Nodte(14);
		tree.root.right.left = new Nodte(4);
		tree.root.right.right = new Nodte(25);
		
		System.out.println("Following are nodes in top view of Binary Tree");
		tree.topView(tree.root);

	}
}
