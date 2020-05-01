package com.learnjava;


import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[6]);
			int num = 9/0;
			
		}
		catch(ArithmeticException e){
			//System.err.println("Error occured");
		}
		catch(IndexOutOfBoundsException e) {
			//System.out.println("Index out of bouds");
		}
		System.out.println("K bye");
		
		Scanner sc = new Scanner(System.in);
	}

}
