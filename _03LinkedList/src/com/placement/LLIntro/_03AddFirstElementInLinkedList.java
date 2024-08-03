// Program to demonstrate to add the first elements in the linked list


package com.placement.LLIntro;

public class _03AddFirstElementInLinkedList {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data= data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public void addFirst(int data) {
		
		// Step 1: Create new node
		Node newNode = new Node(data);
		
		//If LinkedList is empty
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		
		
		//Step 2 : newNode.next = head
		newNode.next = head;
		
		//step3 : head = newNode
		head = newNode;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		
		Node temp = head;
		
		while(head != null) {
			System.out.println(temp.data + "->");
			
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(3);
		ll.addFirst(4);
		
		ll.print();
	}

}
