//Implementing Multi-Threading using Interfaces, Anonymous Class and Lambda Expressions
package com.learnjava;

public class MultiThreading3 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() ->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Thread 1");
				try {Thread.sleep(500); } catch(Exception e) { System.err.println("Error in thread 1");}
			}
		});		
		Thread t2 = new Thread(() ->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Thread 2");
				try {Thread.sleep(500); } catch(Exception e) { System.err.println("Error in thread 2");}
			}
		});	
		t1.start();
		t2.start();
	}
}