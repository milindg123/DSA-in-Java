/*
  	LinkedList : It is linear data structure
  	
  	LinkedList contains data and the next variable address
 
 
 */


package com.placement.LLIntro;

public class _01NodeCreationInLinkedList {
	
	//Node creation
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = null;
		
		
		System.out.println(head);

	}

}
