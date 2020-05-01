package com.learnjava;

class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 1");
			try {Thread.sleep(500); } catch(Exception e) { System.err.println("Error");}
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 2");
			try {Thread.sleep(500); } catch(Exception e) { System.err.println("Error");}
		}
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();
		
	}

}
