package com.ankit.Array_Problems.BinaryTreeDistancebetweenTwoNode;

class Node
{
	Node left,right;
	int data;
	
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	public BinaryTree()
	{
		root=null;
	}
	
	public static Node LCA(Node root,int n1,int n2)
	{
		if(root==null)
		{
			return root;
		}
		if(root.data==n1 || root.data==n2)
		{
			return root;
		}
		Node left=LCA(root.left,n1,n2);
		Node right=LCA(root.right,n1,n2);
		
		if(left!=null && right!=null)
		{
			return root;
		}
		
		
		return left==null?right:left;
		
	}
	
	public static int findheight(Node root,int n1,int height)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.data==n1)
		{
			return height;
		}
		
		int left=findheight(root.left,n1,height+1);
		int right=findheight(root.right,n1,height+1);
		
		
		return Math.max(left, right);
	}
	public static int findDistance(Node root,int n1,int n2)
	{
		Node lca=LCA(root,n1,n2);
		
		int d1=findheight(lca,n1,0);
		int d2=findheight(lca,n2,0);
				return d1+d2;
	}
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 
		tree.root.right.left.right = new Node(8); 
        System.out.println("Dist(4, 5) = " 
                             + findDistance(tree.root, 4, 5)); 
                               
        System.out.println("Dist(4, 6) = " 
                             + findDistance(tree.root, 4, 6)); 
                               
        System.out.println("Dist(3, 4) = " 
                             + findDistance(tree.root, 3, 4)); 
                               
        System.out.println("Dist(2, 4) = " 
                             + findDistance(tree.root, 2, 4)); 
                               
        System.out.println("Dist(8, 5) = "
                             + findDistance(tree.root, 8, 5)); 
     

	}

}
