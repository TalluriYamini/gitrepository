package com.learn.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Lab828 {
	public static void main(String[] args) {
		System.out.println("\n** HashMap");

		Map map = new HashMap();
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
 

				** HashMap
				add=Mathikare
				phone=65799999
				name=Sri
				email=sri@jlc.com
				sid=JLC-099



 */
