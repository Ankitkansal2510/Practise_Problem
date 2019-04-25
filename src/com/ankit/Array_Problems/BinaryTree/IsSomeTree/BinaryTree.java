package com.ankit.Array_Problems.BinaryTree.IsSomeTree;

//Time complexited O(n2) for worst case .Worst case occured for skewed tree

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
   
public class BinaryTree {
	Node root;
	public BinaryTree()
	{
		root=null;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(26); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(6); 
        tree.root.right.right = new Node(3); 
   
        if (tree.isSumTree(tree.root) != 0) 
            System.out.println("The given tree is a sum tree"); 
        else
            System.out.println("The given tree is not a sum tree"); 
    }

	private int isSumTree(Node root) {
		int leftSum,rightSum;
		
		if(root==null || (root.left==null && root.right==null))
				{
			return 1;
				}
		leftSum=sum(root.left);
		rightSum=sum(root.right);
		int total=leftSum+rightSum;
		if((root.data==total) && (isSumTree(root.left)!=0) && (isSumTree(root.right)!=0))
			return 1;
		
		return 0;
	}

	private int sum(Node root) {
		if(root==null)
		return 0;
		
		return  sum(root.left) +root.data + sum(root.right);
	} 

}
