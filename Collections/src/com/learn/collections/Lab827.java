package com.learn.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Lab827 {
	public static void main(String[] args) {
	Map map=new LinkedHashMap();
	map.put("eid", new Integer(99));
	map.put("name", "Srinivas");
	map.put("phone", new Long(65799999L));
	System.out.println("\n**Keys and Values");
	Set data=map.entrySet();
	Iterator it= data.iterator();
	while (it.hasNext()) {
		Object obj =  it.next();
		Map.Entry entry=(Map.Entry) obj;
		Object key=entry.getKey();
		Object val=entry.getValue();
		System.out.println(key+"\t"+val);
	
	}
	}
 }

/*


					**Keys and Values
					eid	99
					name	Srinivas
					phone	65799999

 
*/ 
 