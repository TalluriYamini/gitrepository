package com.learn.collections;

import java.util.ArrayList;
import java.util.Collection;


class Lab782 {
	
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri"); col.add("Srininas");
		col.add("SD"); col.add("Dande");
		Object arr[]=col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i]="JLC";
		}
		System.out.println(col);
	}
}



//output

/*					

			Sri
			Srininas
			SD
			Dande
			[Sri, Srininas, SD, Dande]

		*/		

