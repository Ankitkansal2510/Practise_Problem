package com.ankit.Array_Problems.BinaryTree.LowestCommonAncestor;

class Node {

	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LCSOF_BT {

	
	Node root;
	
	public LCSOF_BT()
	{
		root=null;
	}
	
	public Node findLCA(int n1,int n2)
	{
		return findLCA(root,n1,n2);
	}
	
	public Node findLCA(Node node,int n1,int n2)
	{
		if(node == null)
		{
		return null;
		}
		
		if(node.data==n1  || node.data==n2)
		{
			return node;
		}
		
		Node left_LCA=findLCA(node.left,n1,n2);
		Node right_LCA=findLCA(node.right,n1,n2);
		
		if(left_LCA!=null && right_LCA!=null)
		{
			return node;
		}
		
		return (left_LCA!=null)?left_LCA:right_LCA;
		
	}
	public static void main(String[] args) {
		
	
	LCSOF_BT tree= new LCSOF_BT();
     tree.root = new Node(1); 
     tree.root.left = new Node(2); 
     tree.root.right = new Node(3); 
     tree.root.left.left = new Node(4); 
     tree.root.left.right = new Node(5); 
     tree.root.right.left = new Node(6); 
     tree.root.right.right = new Node(7); 
     System.out.println("LCA(4, 5) = " + 
                         tree.findLCA(4, 5).data); 
     System.out.println("LCA(4, 6) = " + 
                         tree.findLCA(4, 6).data); 
     System.out.println("LCA(3, 4) = " + 
                         tree.findLCA(3, 4).data); 
     System.out.println("LCA(2, 4) = " + 
                         tree.findLCA(2, 4).data); 
	}
	
}
