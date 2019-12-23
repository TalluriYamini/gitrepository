package com.learn.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


class Lab789 {
	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri"); list.add("Nivas"); list.add("Dande");
		System.out.println(list);
		list.add(1, "Java");//shift to right
		System.out.println(list);
		list.remove(2);//shift to left
		System.out.println(list);
	
	}
}



//output

/*			
				 
				[Sri, Nivas, Dande]
				[Sri, Java, Nivas, Dande]
				[Sri, Java, Dande]
 


		*/		

