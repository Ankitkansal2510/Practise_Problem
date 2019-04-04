package com.ankit.Array_Problems.BinaryTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

class Nodtt {
	int data;
	Nodtt left, right;

	public Nodtt(int data) {
		this.data = data;
	}
}

public class TopviewofBinaryTree {

	Nodtt root;

	public TopviewofBinaryTree() {
		root = null;
	}

	public void topView(Nodtt root) {
		class QueueObj {
			Nodtt node;
			int hd;

			public QueueObj(Nodtt node, int hd) {
				this.node = node;
				this.hd = hd;
			}
		}

		Queue<QueueObj> q = new LinkedList<>();
		Map<Integer, Nodtt> map = new TreeMap<>();

		if (root == null) {
			return;
		} else {
			q.add(new QueueObj(root, 0));
		}

		while (!q.isEmpty()) {
			QueueObj tempNode = q.poll();

			if (!map.containsKey(tempNode.hd)) {
				map.put(tempNode.hd, tempNode.node);
			}

			if (tempNode.node.left != null) {
				q.add(new QueueObj(tempNode.node.left, tempNode.hd - 1));
			}

			if (tempNode.node.right != null) {
				q.add(new QueueObj(tempNode.node.right, tempNode.hd + 1));
			}
		}

		for (Entry<Integer, Nodtt> entry : map.entrySet()) {
			System.out.print(entry.getValue().data);
		}

	}

	public static void main(String[] args) {
		TopviewofBinaryTree tree = new TopviewofBinaryTree();
		tree.root = new Nodtt(1);
		tree.root.left = new Nodtt(2);
		tree.root.right = new Nodtt(3);
		tree.root.left.right = new Nodtt(4);
		tree.root.left.right.right = new Nodtt(5);
		tree.root.left.right.right.right = new Nodtt(6);
		System.out.println("Following are nodes in top view of Binary Tree");
		tree.topView(tree.root);

	}

}
