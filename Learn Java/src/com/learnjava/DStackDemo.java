package com.learnjava;

class DStack{
	private static int capacity = 2;
	private static Object[] stack = new Object[capacity];
	private static int top=0;
	
	public static void expand() {
		int size = size();
		Object[] newStack = new Object[capacity*2];
		for(int i = 0;i<size;i++)			//can also use an inbuilt method i.e System.arraycopy(stack, 0, newStack, 0, size);
			newStack[i] = stack[i];
		stack = newStack;
		capacity *=2;
		
		
	}
	
	public static void shrink() {
		if(top==capacity/2) {
			Object[] newStack = new Object[capacity/2];
			for(int i = 0;i<top;i++)		//can also use an inbuilt method i.e System.arraycopy(stack, 0, newStack, 0, top);
				newStack[i] = stack[i];
			stack = newStack;
			capacity /= 2;
		}
	}
	public static void push(Object data) {
		if(top == size()) {
			expand();
		}
		
		stack[top] = data;
		top++;
		
	}
	public static void pop() {
		if(top==0) {
			System.out.println("Stack is empty");
		}
		else {
			top--;
			System.out.println("Popped element is: "+stack[top]);
			stack[top]=0;
			shrink();
		}	
	}
	
	public static void peek() {
		System.out.println("Top is at: "+stack[top-1]);
	}
	public static void show() {
		for(int i=0;i<top;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	public static int size() {
		return stack.length;
	}
}
public class DStackDemo {

	public static void main(String[] args) {
		DStack newStack = new DStack();
		newStack.push(0);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(1);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(2);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(3);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(4);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(5);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(6);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(7);
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.push(8);
		newStack.show();
		System.out.println("size: "+newStack.size());
		
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		newStack.pop();
		newStack.show();
		System.out.println("size: "+newStack.size());
		
		
		
		
		
		
		
		

	}

}
