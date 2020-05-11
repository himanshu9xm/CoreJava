// In this program we'll be implementing a basic example of set
// Set doen't allow duplicate value
package com.learnjava;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();    			// We can use generics as well    i.e  Set<Integer> values = new HashSet<>(); 
		System.out.println(values.add(0));
		System.out.println(values.add(1));
		System.out.println(values.add(2));
		System.out.println(values.add(3));
		System.out.println(values.add(4));
		System.out.println(values.add(5));
		
		//values.add("Hey");						// This will throw error in case we use generics and specify type as Integer
		//values.add("Hey");                      // This value will won't be added as set doesn't allow duplicate entries
		System.out.println(values.add(3));		// This value will won't be added as set doesn't allow duplicate entries and will  print false
		int len = values.size();
		for(Integer ele : values)				// In case we use generics this statement will be   for(int ele : values)  OR  for(Integer ele : values)
			System.out.println(ele);
		
	}

}
