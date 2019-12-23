package com.learn.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Lab834 {
	public static void main(String[] args) {
		Map< Integer, String>map=new LinkedHashMap<Integer,String>();
		map.put(1234, "Sri");
		map.put(8767, "Nivas");
		map.put(5677, "Manish");
		map.put(2343, "Dande");
		map.put(9898, "Dharmendra");
		Set<Map.Entry<Integer, String>> set= map.entrySet();
		Iterator<Map.Entry<Integer, String>> it=set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry =it.next();
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"\t"+value);
		}
	}
}

/*
				 
				1234	Sri
				8767	Nivas
				5677	Manish
				2343	Dande
				9898	Dharmendra


 */
