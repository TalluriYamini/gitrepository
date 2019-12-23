package com.learn.collections;

import java.util.LinkedHashMap;
import java.util.Map;

class Lab839 {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(1234, "Sri");
		map.put(8767, "Nivas");
		map.put(5677, "Manish");
		map.put(2343, "Dande");
		map.put(9898, "Dharmendra");
		System.out.println(map);
		
	}
}


/*


		{1234=Sri, 8767=Nivas, 5677=Manish, 2343=Dande, 9898=Dharmendra}


 */
