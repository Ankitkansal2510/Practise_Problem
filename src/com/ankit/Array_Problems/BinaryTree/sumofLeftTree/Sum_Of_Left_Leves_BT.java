package com.ankit.Array_Problems.BinaryTree.sumofLeftTree;

class node
{
	int data;
	node left,right;
	public node(int data)
	{
		this.data=data;
		left=right=null;
	}
}

public class Sum_Of_Left_Leves_BT {
	node root;
	static int sum;
	
	public Sum_Of_Left_Leves_BT() {
		root=null;
	}

	public static void sumOfLeft(node root)
	{
		if(root == null)  
	        return;  
	  
	    // check if the right child 
	    // of root is leaf node  
	    if(root.left != null)  
	        if(root.left.left == null &&  
	           root.left.right == null)  
	            sum += root.left.data;  
	  
	    sumOfLeft(root.left);  
	    sumOfLeft(root.right);  
   
	}
	
	private static boolean isLeaf(node root) {
		if(root==null)
		{
			return false;
		}
			if(root.left==null && root.right==null)
				return true;
		return false;
	}

	public static void main(String[] args) {
		Sum_Of_Left_Leves_BT tree = new Sum_Of_Left_Leves_BT(); 
	        tree.root = new node(20); 
	        tree.root.left = new node(9); 
	        tree.root.right = new node(49); 
	        tree.root.left.right = new node(12); 
	        tree.root.left.left = new node(5); 
	        tree.root.right.left = new node(23); 
	        tree.root.right.right = new node(52); 
	        tree.root.left.right.right = new node(12); 
	        tree.root.right.right.left = new node(50); 
	        
	         sum=0;
	        sumOfLeft(tree.root);
	        System.out.println(sum);

	}

}
