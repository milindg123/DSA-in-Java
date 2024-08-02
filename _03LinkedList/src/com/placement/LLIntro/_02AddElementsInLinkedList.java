/*
 
 
 	Step 1 : create new Node
 	Step 2 : new Node.next = head
 	Step 3 : head = newNode
 
 */


package com.placement.LLIntro;

public class _02AddElementsInLinkedList {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) {
		//step 1 : create new Node
		Node newNode = new Node(data);
		
		// If linkedlist is empty
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		//step 2 : newNode.next = head;
		newNode.next = head; //link
		
		//step 3 : newNode = head
		head = newNode;
	}

	
	public void print() {
		
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.addFirst(1);
		ll.addFirst(2);
		
		ll.print();

	}

}
