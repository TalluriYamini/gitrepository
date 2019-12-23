package com.learn.collections;

import java.util.HashMap;
import java.util.Map;

class Lab831 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("sid", "JLC-099");
		map.put("name", "Sri");
		
		Map map2=new HashMap();
		map2.put("MKR", "Mathikere");
		map2.put("BTM", "BTM Layout");
		System.out.println(map);//{name=Sri, sid=JLC-099}
		System.out.println(map2);//{MKR=Mathikere, BTM=BTM Layout}
		map.putAll(map2);
		System.out.println(map);//{MKR=Mathikere, name=Sri, BTM=BTM Layout, sid=JLC-099}
		System.out.println(map2);//{MKR=Mathikere, BTM=BTM Layout}
	}
}

/*
 
{name=Sri, sid=JLC-099}
{MKR=Mathikere, BTM=BTM Layout}
{MKR=Mathikere, name=Sri, BTM=BTM Layout, sid=JLC-099}
{MKR=Mathikere, BTM=BTM Layout}

 */
