package com.learnjava;

import java.util.Scanner;

interface Writer{
	void write();
}

class Pen implements Writer{
	public void write() {
		System.out.println("It's a Pen");
	}
}

class Pencil implements Writer{
	public void write() {
		System.out.println("It's a pencil");
	}
}

class Kit{
	public void doSomething(Writer W) {
		W.write();
	}
}

public class HelloWorld{
	public static void main(String[] args) {
		Writer obj1 = new Pen();
		Writer obj2 = new Pencil();
		Kit obj = new Kit();
		Writer arr[] = {obj1, obj2};
		for(int i = 0;i<2;i++) {
			obj.doSomething(arr[i]);
		}
		
		Kit objNew = new Kit() {
			public void doSomething() {
				System.out.println("It's an anonymous class");
			}
		};
		objNew.doSomething(null);
		
		
	}
}