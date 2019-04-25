package com.ankit.Array_Problems.BinaryTree.rootToPathLeafSum;

import java.util.ArrayList;
import java.util.List;

//time complexity O(n)

//source :https://www.youtube.com/watch?v=Jg4E4KZstFE
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
public class RootToLeafPathSum {
	
	Node root;
	
	boolean haspathSum(Node root,int sum,List<Integer> result)
	{
		if(root==null)
		{
			return false;
		}
		
		if(root.left==null && root.right==null)
		{
			if(root.data==sum)
			{
				result.add(root.data);
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		if(haspathSum(root.left, sum-root.data, result))
		{
			result.add(root.data);
			return true;
		}
		
		if(haspathSum(root.right, sum-root.data, result))
		{
			result.add(root.data);
			return true;
		}
		return false;
		
		
		
	}

	public static void main(String[] args) {
		int sum = 14; 
        
        /* Constructed binary tree is 
              10 
             /  \ 
           8     2 
          / \   / 
         3   5 2 
        */
		RootToLeafPathSum tree = new RootToLeafPathSum(); 
        tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(2); 
        List<Integer> result=new ArrayList<>();
        
        if (tree.haspathSum(tree.root, sum,result)) 
        {
            System.out.println("There is a root to leaf path with sum " + sum); 
        System.out.println(result);}
        
        else
        {
            System.out.println("There is no root to leaf path with sum " + sum); }
    } 

}
