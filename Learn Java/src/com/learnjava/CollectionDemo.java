// A program to over-ride the sort method and arrant the numbers on the basic of the last digit i.e one's place

package com.learnjava;

import java.util.*;


public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(200);
		values.add(303);
		values.add(409);
		values.add(502);
		
		Comparator<Integer> c = new Comparator<>() {
			public int compare(Integer i, Integer j) {
				if(i%10>j%10)
					return 1;
				else 
					return -1;
			}
		};
		
		//Comparator<Integer> c = (i, j) -> i%10>j%10?1:-1;     Above lo9gic using the lambda expressions
		
		Collections.sort(values, c);
	
		System.out.println(values);
		
		

	}

}
