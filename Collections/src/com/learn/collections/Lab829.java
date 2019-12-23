package com.learn.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Lab829 {
	public static void main(String[] args) {
		System.out.println("\n**LinkedHasMap");

		Map map = new LinkedHashMap();
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
 
			
			**LinkedHasMap
			sid=JLC-099
			name=Sri
			email=sri@jlc.com
			phone=65799999
			add=Mathikare


 */
