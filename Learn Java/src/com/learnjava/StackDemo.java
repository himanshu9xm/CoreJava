package com.learnjava;

class Stack{
	private static Object[] stack = new Object[10];
	private static int top=0;
	public static void push(Object data) {
		if(top==stack.length) {
			System.out.println("Stack is full");
		}
		else {
			stack[top] = data;
			top++;
		}
		
	}
	public static void pop() {
		if(top==0) {
			System.out.println("Stack is empty");
		}
		else {
			top--;
			System.out.println("Popped element is: "+stack[top]);
			stack[top]=0;
		}	
	}
	
	public static void peek() {
		System.out.println("Top is at: "+stack[top-1]);
	}
	public static void show() {
		for(int i=0;i<top;i++) {
			System.out.println("Element at index: "+i+" is: "+stack[i]);
		}
		//System.out.println(stack[top]);
	}
}
public class StackDemo {

	public static void main(String[] args) {
		Stack newStack = new Stack();
		newStack.push(0);
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push("Sam");
		newStack.push(0);
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push("Sam");
		
		newStack.show();
		
		newStack.pop();
		newStack.pop();
		
		newStack.show();
		
		newStack.peek();
		
		
		
		
		
		
		
		

	}

}
