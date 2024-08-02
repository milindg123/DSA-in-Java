package com.placement.LLIntro;

public class LinkedList {
	public static class Node{
		int data;
		Node next;
		
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addFirst(int data) {
		// step 1 = create new node
		
		Node newNode = new Node(data);
		size++;
		// if the LL is empty
		if(head == null) {
			head = tail = newNode;
			return;
		}

		//step2 = newNode = head
		newNode.next = head; //link creation
		
		//step3 = head = newNode
		head = newNode;
	} 
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	public void print() {
//		if(head == null) {
//			System.out.println("LL is empty");
//			return;
//		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void addInTheMiddle(int idx, int data) {
		
		// Special case : 
		
		if(idx == 0) {
			addFirst(data);
			return;
		}
		
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i = 0;
		
		while(i< idx-1) {
			temp = temp.next;
			i++;
		}
		
		//i = idx-1 ; temp->prev
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	
	public int removeFirst(){
		//case 1:
		if(size == 0) {
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}
		
		else if(size == 1) {
			int val = head.data;
			head = tail = null; 
		}
		int val = head.data;
		head = head.next;
		return val;
	}
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
	
		ll.addFirst(2);
		ll.addFirst(1);
		
		
		ll.addLast(3);
		ll.addLast(4);
		
		
		ll.addInTheMiddle(2, 9);
		
		ll.print();
		System.out.println("Size of linkedList is : " + ll.size);
		
		ll.print();
		ll.removeFirst();
		ll.print();
	}

}
