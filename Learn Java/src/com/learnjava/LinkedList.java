//Implementing single linked list in java to store elements 
package com.learnjava;



class Node{										//A Node having data i.e value and address of the next node
	Object data;
	Node next;
}

class LinkedList{								//Class to implement linked list and provide various functionalities
	static Node head=null;
	
	public static void insert(Object data) {	//To insert the element at the end of the List
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
	
	
	
	public static void insert(int index, Object data) {    //Method overloading to insert the elements at the specified index
		int size = checkSize();
		if(index==0) {									   //Logic to insert element in case the List is already empty
			Node node = new Node();
			node.data = data;
			if(head == null) {
				head = node;
			}
			else {
				node.next = head;
				head = node;
			}
		}
		else if(index>=size) {							   //In case index is greater than the size of list, element will be added at the end of the list
			insert(data);
		}
		else {
			Node newNode = new Node();
			newNode.data = data;
			Node current = head;
			while(index !=1) {
				current = current.next;
				index--;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		
	}
	
	public static void Delete(int index) {					//Method to delete the element at the specified index
		int size = checkSize();
		if(index>=size) {
			System.out.println("Index doesn't exist");
		}
		else {
			Node current = head;
			Node delNode = null;
			while(index != 0) {
				current = current.next;
				index--;
			}
			delNode = current.next;
			current.next = delNode.next;
			System.out.println("Deleted element: "+delNode.data);
			
			delNode = null;									//assigning null to the deleted node to make it eligible for the garbage collector to remove it
			
		}
	}
	
	public static int checkSize() {							//Method to check the size of the List i.e no of elements in the List
	
		
		Node current = head;
		int size = 0;
		try {												//to catch a pointer pointing to null exception in case List is empty
			while(current.next != null) {
					current = current.next;
					size++;
				}
			size=size+1;
				
		}
		catch(Exception e) {
			System.out.println("The Array is empty");
			return 0;
		}
		return size;
		
		
	}
	
	
	
	public static void show() {									//Method to display all the elements present in the List
		Node current = head;									//Try overloading show() and creating show(int index) to display elements at specified index
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
		list.insert("Jam");
		list.insert(19);
		list.insert(0,"First");
		list.insert(4, "Two");
		list.insert(14, "Last");
		list.show();
		int size = checkSize();
		System.out.println("Size of Linked List is: "+size);
		
		list.Delete(3);
		list.show();
		size = checkSize();
		System.out.println("Size of Linked List is: "+size);
		
	}
}