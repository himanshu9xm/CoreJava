// This program implements a linear queue. However it's not practical as it wastes the memory.
// A more practical approach will be Queue using Circular queue or using Dynamic circular queue
package com.learnjava;

class Queue{
	private int front = 0;
	private int rear = 0;
	private int size = 0;
	private Object[] queue = new Object[5];
	
	public void enQueue(Object data) {
		if(rear == queue.length) {
			System.out.println("Queue is full");
		}
		else {
			queue[rear] = data;
			rear = rear+1;
			size++;
		}
			
	}
	
	public void deQueue() {
		if(rear == front ) {
			System.out.println("Queue is already empty");
		}
		else {
			front = front+1;
			size--;
		}
	}
	
	public int size() {
		return size;
	}
	
	public void show() {
		System.out.print("Elements: ");
		for(int i=front;i<rear;i++)
			System.out.print(queue[i]+" ");
		System.out.println();
	} 
}

public class QueueArray {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(0);
		queue.show();
		queue.enQueue(1);
		queue.show();
		queue.enQueue(2);
		queue.show();
		queue.enQueue(3);
		queue.show();
		queue.enQueue(4);
		queue.show();
		queue.enQueue(5);
		queue.show();
		queue.enQueue(6);
		queue.show();
	
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		
		
		
		
	
		
		
		
	}

}
