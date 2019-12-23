package com.learn.collections;

import java.util.LinkedHashMap;
import java.util.Map;

class Lab825 {
	public static void main(String[] args) {
	Map map=new LinkedHashMap();
	map.put("eid", new Integer(99));
	map.put("name", "Srinivas");
	map.put("phone", new Long(65799999L));
	System.out.println(map);
	System.out.println(" remove(eid): "+map.remove("eid"));
	System.out.println(map);
	System.out.println("put -phone(): "+map.put("phone", new Long(31903290L)));
	System.out.println(map);
	System.out.println(" get()");
	System.out.println(map.get("name"));
	System.out.println(map.get("email"));
	}
 }

/*

			{eid=99, name=Srinivas, phone=65799999}
			 remove(eid): 99
			{name=Srinivas, phone=65799999}
			put -phone(): 65799999
			{name=Srinivas, phone=31903290}
			 get()
			Srinivas
			null

 
*/ 
 