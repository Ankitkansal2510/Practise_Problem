package com.ankit.Array_Problems.linkedList;

import javax.xml.ws.Dispatch;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class MergeTwoList {

	Node head;

	public void insert(int data) {
		if (head == null) {
			head = new Node(data);

		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);

		}
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " " + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void insertAtFirstPosition(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
	}

	public void insertAtlastPostition(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
	}

	public void insertAtMiddle(int data) {
		if (head == null) {
			head = new Node(data);
		} else {

			Node current = head.next;
			Node temp = head;
			while (current != null && current.next != null) {
				current = current.next.next;
				temp = temp.next;

			}
			Node node = new Node(data);
			node.next = temp.next;
			temp.next = node;

		}
	}

	public void insertNodeAfterNthNodefromEnd(int data, int position) {
		Node current = head;
		Node temp = head;
		int count = 0;
		while (current != null) {
			current = current.next;
			count++;
		}

		Node new_Node = new Node(data);
		current = head;

		for (int i = 0; i < position; i++) {
			current = current.next;
		}
		while (current != null) {
			current = current.next;
			temp = temp.next;
		}

		new_Node.next = temp.next;
		temp.next = new_Node;
	}

	public void deleteNode(int key) {

		Node current = head;
		Node free = null;
		if (current != null && current.data == key) {
			head = current.next;
			return;
		}
		while (current != null && current.data != key) {
			free = current;
			current = current.next;

		}
		free.next = current.next;
	}

	public void deleteGivenNode(Node n) {
		if (n == null) {
			return;
		}
		Node current = head;
		// Node temp=n;
		if (current.next == null && current.data == n.data) {
			System.out.println("Cannot delete the head node from the linked list");
		}
		if (current.next != null && current.data == n.data) {
			head = current.next;
		} else {
			while (current.next != null && current.next.data != n.data) {
				current = current.next;
			}
			current.next = current.next.next;
		}
	}

	public static Node mergeTwoSortedList(Node l1, Node l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1 == null && l2 == null)
			return l1;
		Node head, cur;
		if (l1.data <= l2.data) {
			cur = l1;
			l1 = l1.next;
		} else {
			cur = l2;
			l2 = l2.next;
		}
		head = cur;

		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		if (l1 != null) {
			cur.next = l1;
		}
		if (l2 != null) {
			cur.next = l2;
		}
		return head;

	}

	public void deleteNthFromEnd(int position) {
		Node current = head;
		Node temp = head;
		for (int i = 0; i < position; i++) {

			current = current.next;
		}
		if (current == null) {
			head = temp.next;
		} else {
			while (current.next != null) {
				temp = temp.next;
				current = current.next;
			}
			temp.next = temp.next.next;
		}
	}

	public void RemoveDuplicateFromSortedList() {
		Node current = head;

		if (current == null) {
			return;
		}

		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
				//current = current.next;
			} else {
				current = current.next;
			}
		}
	}
	
	public Node reverseLinkedList(Node node)
	{
		
		
		if(head ==null){
			return head;
		}
		
		
		Node current=head;
		Node previous=null;
		while(current!=null)
		{
			Node temp=current.next;
			current.next=previous;
			previous=current;
			current=temp;
		}
		 head= previous;
		 return head;
	}
	
	public void RemoveElement(int key)
	{
        if(head ==null)
        {
            return;
        }
        while(head!=null && head.data == key){
            head = head.next;
          }
        Node current=head;
      
        
        while(current!=null)
        {
        	  Node temp=current.next;
        	  if(temp!=null && temp.data==key)
        	  {
        		  current.next=temp.next;
        	  }
        	  else
        	  {
        		  current=current.next;
        	  }
        }
    //    return head;
     
	}
	
	public boolean palindrom()
	{
		if(head == null || head.next == null) {
            return true;
        }
       
		Node slow=head;
		Node fast=head;
		boolean even=false;
		while(fast.next!=null)
		{
			if(fast.next.next==null)
			{
				even=true;
				break;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		Node mid=slow.next;
		Node current=head;
		Node previous=null;
		Node temp=null;
		while(current!=mid)
		{
			temp=current.next;
			current.next=previous;
			previous=current;
			current=temp;
		}
		
		if(even==false)
		{
			previous=previous.next;
		}
		
		while(current!=null)
		{
			if(current.data==previous.data)
			{
				current=current.next;
				previous=previous.next;
			}
			else
			{
				return false;
			}
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		MergeTwoList list = new MergeTwoList();
		MergeTwoList list1 = new MergeTwoList();
		list.insert(1);
		list.insert(2);
		list.insert(4);
		// list.display();
		/*
		 * list.insertAtFirstPosition(0); //list.display();
		 * list.insertAtlastPostition(5); //list.display();
		 * list.insertAtMiddle(3); //list.display(); list.insertAtMiddle(7);
		 */
		list.display();
		/*
		 * list.deleteNode(2);; list.display();
		 */
		System.out.println();

		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(2);
		list1.insert(1);
		/*list1.insert(3);
		list1.insert(4);*/
		/**list1.insert(4);*/
		// list1.insert(5);
		list1.display();
		
		/*list1.reverseLinkedList(list1.head);
		list1.display();*/
		boolean result=list1.palindrom();
		if(result==true)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		
		list1.RemoveElement(1);
		list1.display();
		
		// list1.deleteNthFromEnd(1);
		// list1.display();
		// Node node= mergeTwoSortedList(list.head,list1.head);

		/*list1.RemoveDuplicateFromSortedList();
		list1.display();*/
		/**
		 * list1.insertAtFirstPosition(5); //list1.display();
		 * list1.insertAtlastPostition(50); //list1.display();
		 * list1.insertNodeAfterNthNodefromEnd(45, 4);
		 */

		// list1.display();
		/*
		 * list1.insertAtMiddle(2); list1.display();
		 */
		/*
		 * list1.deleteGivenNode(list1.head.next.next.next); list1.display();
		 */
		/*
		 * list1.insertNodeAfterNthNodefromEnd(2, 3); list1.display();
		 */

		// list1.deleteNode(4); list1.display();

		// list1.deleteNode(1); list1.display();

		/*
		 * list1.deleteGivenNode(list1.head.next); list1.display();
		 */

		/*
		 * list1.deleteNode(list1.head.next); list1.display();
		 */

		// list1.deletatAGivenNode(head, head.next);
		/*
		 * list1.head=list1.mergeTwoSortedList(list.head, list1.head);
		 * list1.display();
		 */
	}
}
