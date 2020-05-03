package com.learnjava;

import java.util.*;



public class Colletions1 {

	public static void main(String[] args) {
		List<Integer> Arr1 = new ArrayList<>();
		Arr1.add(10); Arr1.add(11); Arr1.add(10); Arr1.add(13); Arr1.add(14); Arr1.add(15);
//		List<Integer> Arr2 = new ArrayList<>();
//		Arr2[0].add(10); Arr2[1].add(11); Arr2[2].add(12); Arr2[2].add(13); Arr2[4].add(14); 
		System.out.println(Arr1);
		
		SortedSet<Integer> Arr2 = new TreeSet<Integer>();
		Arr2.add(100); Arr2.add(1); Arr2.add(510); Arr2.add(118); Arr2.add(118);
		System.out.println(Arr2);
		System.out.println();
		

	}

}
