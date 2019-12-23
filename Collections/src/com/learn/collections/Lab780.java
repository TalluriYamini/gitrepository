package com.learn.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;

class Lab780 {
	
	public static void main(String[] args) {
		Collection col=new ArrayList();
		System.out.println(col);
		System.out.println("Size: "+col.size());
		System.out.println("Empty: "+col.isEmpty());
		System.out.println();
		col.add("Sri"); col.add("Nivas");col.add("Srini");
		col.add("SD"); col.add("Dande");
		System.out.println(col);
		System.out.println("Size: "+col.size());
		System.out.println("Empty: "+col.isEmpty());
		
	}
}



//output

/*					[]
					Size: 0
					Empty: true
					
					[Sri, Nivas, Srini, SD, Dande]
					Size: 5
					Empty: false
				
		*/		

