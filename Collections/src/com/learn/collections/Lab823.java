package com.learn.collections;

import java.util.LinkedHashMap;
import java.util.Map;

class Lab823 {
	public static void main(String[] args) {
	Map map=new LinkedHashMap();
	System.out.println(map);
	System.out.println("Size: "+map.size());
	System.out.println("Is Empty: "+map.isEmpty());
	map.put("eid", new Integer(99));
	map.put("name", "Srinivas");
	map.put("phone", new Long(65799999L));
	map.put("valid", new Boolean(true));
	System.out.println(map);
	System.out.println("Size: "+map.size());
	System.out.println("Is empty: "+map.isEmpty());
	}
 }

/*

 
				 {}
				Size: 0
				Is Empty: true
				{eid=99, name=Srinivas, phone=65799999, valid=true}
				Size: 4
				Is empty: false
				


 
 

 
*/ 
 