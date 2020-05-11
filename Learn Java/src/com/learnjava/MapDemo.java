package com.learnjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();	//Can be implemented using class HashTable as well for thread safety
		map.put("Name", "Himanshu");
		map.put("Dept", "CSE");
		map.put("CEO", "Elon");
		map.put("Idol", "Elon");		//Repetition of values is allowed but we can't repeat keys
		map.put("Idol", "Steve");		//This replaces the former value and updates to Steve
		
		System.out.println(map);
		
		System.out.println("------------------------------------------");
		
		System.out.println(map.get("Name"));
		System.out.println(map.get("Dept"));
		System.out.println(map.get("CEO"));
		System.out.println(map.get("Idol"));
		
		System.out.println("------------------------------------------");
		
		Set<String> Keys = map.keySet();
		for(String key : Keys)
			System.out.println(key+"\t: "+map.get(key));
		

	}

}
