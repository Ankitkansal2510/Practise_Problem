package com.ankit.Array_Problems;

class Nodee
{
	int data;
	Nodee left;
	Nodee right;
	Nodee(int data)
	{
		this.data=data;
		left=right=null;
	}
}

public class Left_View_of_Tree {
Nodee root;

static int max_Level=0;
void leftViewUtil(Nodee node,int level)
{
	if(node==null)
	{
		return;
	}
	
	if(max_Level<level)
	{
		System.out.println(node.data + " ");
		max_Level=level;
	}
	
	
	//In left view we start from left subtree
	leftViewUtil(node.left, level+1);
	leftViewUtil(node.right, level+1);
	
	
	/*//To print right view we first start from right subtree i.e
	leftViewUtil(node.right, level+1);
	leftViewUtil(node.left, level+1);*/
	
}

void leftView()
{
	leftViewUtil(root, 1);
}

	public static void main(String[] args) {
		Left_View_of_Tree tree = new Left_View_of_Tree(); 
		tree.root = new Nodee(1); 
        tree.root.left = new Nodee(2); 
        tree.root.right = new Nodee(3); 
        tree.root.left.left = new Nodee(4); 
        tree.root.left.right = new Nodee(5); 
        tree.root.right.left = new Nodee(6); 
        tree.root.right.right = new Nodee(7); 
        tree.root.right.left.right = new Nodee(8); 
  
        tree.leftView(); 

	}

}
