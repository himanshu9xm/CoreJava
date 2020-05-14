//Implementing concept of Anonymous class in java
package com.learnjava;
@FunctionalInterface
interface Write{
	public void Print();
	default void Show() {
		System.out.println("Default is a kind of method");
	}
}

class Implementor implements Write{
	public void Print() {
		System.out.println("Hey there");
		
	}
}

public class Anony{
	public static void main(String[] args) {
			
		
		Write obj = new Implementor();
		obj.Show();
		obj.Print();
		
		
		

	}

}
