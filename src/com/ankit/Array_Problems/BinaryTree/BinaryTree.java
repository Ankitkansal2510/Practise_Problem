package com.ankit.Array_Problems.BinaryTree;


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

	
	public void inOrder()
	{
		InOrderutil(root);
	}
	public void InOrderutil(Node root)
	{
		if(root ==null)
		{
			return;
		}
		InOrderutil(root.left);
		System.out.print(root.data + " ");
		InOrderutil(root.right);
	}
	public void PreOrder()
	{
		PreOrderUtil(root);
	}
	
	
	public void PreOrderUtil(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data + " ");
		PreOrderUtil(root.left);
		PreOrderUtil(root.right);
	
	}
	
	public void PostOrder()
	{
		PostOrderUtil(root);
	}
	public void PostOrderUtil(Node root)
	{
		if(root==null)
		{
			return;
		}
		PostOrderUtil(root.left);
		PostOrderUtil(root.right);
		System.out.print(root.data + " ");
	}
	
	
	void MorrisTraversal(Node root) 
    { 
        Node current, pre; 
  
        if (root == null) 
            return; 
  
        current = root; 
        while (current != null) { 
            if (current.left == null) { 
                System.out.print(current.data + " "); 
                current = current.right; 
            } 
            else { 
                /* Find the inorder predecessor of current */
                pre = current.left; 
                while (pre.right != null && pre.right != current) 
                    pre = pre.right; 
  
                /* Make current as right child of its inorder predecessor */
                if (pre.right == null) { 
                    pre.right = current; 
                    current = current.left; 
                } 
  
                /* Revert the changes made in if part to restore the  
                    original tree i.e., fix the right child of predecssor*/
                else { 
                    pre.right = null; 
                    System.out.print(current.data + " "); 
                    current = current.right; 
                } /* End of if condition pre->right == NULL */
  
            } /* End of if condition current->left == NULL*/
  
        } /* End of while */
    } 
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        System.out.print("Printing In order : ");
        tree.inOrder();
        System.out.println();
        System.out.print("Printing Pre order : ");
        tree.PreOrder();
        System.out.println();
        System.out.print("Printing Post order : ");
        tree.PostOrder();
        System.out.println();
        
        tree.MorrisTraversal(tree.root);
      

	}

}
