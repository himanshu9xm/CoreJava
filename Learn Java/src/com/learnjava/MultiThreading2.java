//Using multi-Threading using Interfaces
package com.learnjava;

class A implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 1");
			try {Thread.sleep(500); } catch(Exception e) { System.err.println("Error in thread 1");}
		}
	}
}

class B implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 2");
			try {Thread.sleep(500); } catch(Exception e) { System.err.println("Error in thread 2");}
		}
	}
}
public class MultiThreading2 {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
	}

}