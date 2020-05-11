package com.learnjava;

class Node{
	int data;
	Node next;
}

class LinkedList{
	static Node head;
	
	public static void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
			
		}
		
	}
	
	public static void show() {
		Node current = head;
		while(current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}



	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(12);
		list.insert(10);
		list.insert(19);
		
		list.show();
		
	}
}