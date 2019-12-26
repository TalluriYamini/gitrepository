package com.learn.collections;

import java.util.Enumeration;
import java.util.Properties;

class Lab779 {
	
	public static void main(String[] args) {
		Properties p= new Properties();
		p.put("JLC-99","Sri");
		p.put("JLC-88", "VAs");
		p.put("JLC-77", "Dande");
		System.out.println(p);
		Enumeration en=p.propertyNames();
		while (en.hasMoreElements()) {
			String pnm= (String) en.nextElement();
			String val=p.getProperty(pnm);
			System.out.println(pnm+"\t\t"+val);
		}
	}
}



//output

/*
				{JLC-77=Dande, JLC-88=VAs, JLC-99=Sri}
				JLC-77		Dande
				JLC-88		VAs
				JLC-99		Sri
				
		*/		

