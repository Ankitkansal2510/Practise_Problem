package com.ankit.Array_Problems.BinaryTree.sum;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Sum_Of_All_Leaves_InBT {
	Node root;
	static int sum=0;

	public Sum_Of_All_Leaves_InBT() {
		root = null;
	}
	
	public static void level(Node root)
	{
		int h=height(root);
		
		for(int i=1;i<=h;i++)
		{
			
			levelUtil(root,i);
			
		}
		System.out.println();
		System.out.println(sum);
	}

	private static void levelUtil(Node root, int level) {
		if(root ==null)
		{
			return;
		}
		
		if(level==1)
		{
			System.out.print(root.data + " ");
			sum=sum+root.data;
		}
		else if(level>1)
		{
			levelUtil(root.left,level-1);
			levelUtil(root.right,level-1);
		}
		
	}

	private static int height(Node root) {
		if(root==null)
		{
			return 0;
		}
		int lheight=height(root.left);
		int rheight=height(root.right);
		
		if(lheight>rheight)
		{
			return lheight+1;
		}
		else
		{
			return rheight+1;
		}
	}
	
	public static void main(String[] args) {
		Sum_Of_All_Leaves_InBT tree=new Sum_Of_All_Leaves_InBT();
		tree.root=new Node(10);
		tree.root.left=new Node(5);
		tree.root.right=new Node(20);
		tree.root.left.left=new Node(15);
		tree.root.left.right=new Node(30);
		tree.root.right.left=new Node(45);
		tree.root.right.right=new Node(60);
		level(tree.root);
	}
	
	
}
