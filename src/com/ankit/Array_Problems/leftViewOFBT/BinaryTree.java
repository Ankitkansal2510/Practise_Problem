package com.ankit.Array_Problems.leftViewOFBT;

class Node
{
	int data;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}

public class BinaryTree {
Node root;
static int maxLevel=0;

public void leftView()
{
	leftViewUtil(root,1);
}
public void leftViewUtil(Node root,int level)
{
	if(root==null)
	{
		return ;
	}
	if(maxLevel<level)
	{
		System.out.print( root.data + " ");
		maxLevel=level;
	}
	leftViewUtil(root.left,level+1);
	leftViewUtil(root.right,level+1);
	
	
}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);

		tree.leftView();
	}

}
