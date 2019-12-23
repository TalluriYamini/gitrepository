package com.learn.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Lab830 {
	public static void main(String[] args) {
		System.out.println("\n**TreeMap");

		TreeMap map = new TreeMap();
		map.put("sid", "JLC-099");
		map.put("name", "Sri");
		map.put("email", "sri@jlc.com");
		map.put("phone", "65799999");
		map.put("add", "Mathikare");
		Set set = map.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}

/*
 

				**TreeMap
				add=Mathikare
				email=sri@jlc.com
				name=Sri
				phone=65799999
				sid=JLC-099
				
 */
