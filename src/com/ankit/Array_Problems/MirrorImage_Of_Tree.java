package com.ankit.Array_Problems;

class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}


public class MirrorImage_Of_Tree {

	Node root;
	void mirror()
	{
		root=mirror(root);
	}
	
	Node mirror(Node node)
	{
		if(node==null)
		{
			return node;
		}
		mirror(node.left);
		mirror(node.right);
		Node temp=node.left;
		node.left=node.right;
		node.right=temp;
		
		
		return node;
	}
	
	void inOrder()
	{
		InorderRec(root);
	}
	
	void InorderRec(Node node)
	{
		if(node==null)
		{
			return;
		}
		
		InorderRec(node.left);
		System.out.println(node.data);
		InorderRec(node.right);
		
		
	}
	
	public static void main(String[] args) {
		MirrorImage_Of_Tree tree = new MirrorImage_Of_Tree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :"); 
        tree.inOrder(); 
        System.out.println(""); 
  
        /* convert tree to its mirror */
        tree.mirror(); 
  
        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : "); 
        tree.inOrder(); 
  

	}

}
