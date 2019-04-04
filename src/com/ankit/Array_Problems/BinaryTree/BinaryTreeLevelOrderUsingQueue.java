package com.ankit.Array_Problems.BinaryTree;

//Time complexity is O(n) and space complexity is o(n)


import java.util.LinkedList;
import java.util.Queue;

class Nodeee {
	int data;
	Nodeee left;
	Nodeee right;

	public Nodeee(int item) 
	    { 
	        data = item; 
	        left = right = null; 
	    }
}


public class BinaryTreeLevelOrderUsingQueue {
	Nodeee root; 
	  
    public BinaryTreeLevelOrderUsingQueue() 
    { 
        root = null; 
    } 
	public static void main(String[] args) {
		BinaryTreeLevelOrderUsingQueue tree = new BinaryTreeLevelOrderUsingQueue();
		tree.root = new Nodeee(1);
		tree.root.left = new Nodeee(2);
		tree.root.right = new Nodeee(3);
		tree.root.left.left = new Nodeee(4);
		tree.root.left.right = new Nodeee(5);
		tree.printLevelOrder();

	}
	private void printLevelOrder() {
		
		Queue<Nodeee> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Nodeee tempNode=queue.poll();
			System.out.print(tempNode.data + " ");
			
			if(tempNode.left!=null)
			{
				queue.add(tempNode.left);
			}
			
			if(tempNode.right!=null)
			{
				queue.add(tempNode.right);
			}
		}
		
	}

}
