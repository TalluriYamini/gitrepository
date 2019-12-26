package com.learn.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


class Lab783 {
	
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri"); col.add("Srininas");
		col.add("SD"); col.add("Dande");
		Iterator it=col.iterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);
			if(obj.equals("Sri")){
				it.remove();
			}
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
					[Srininas, SD, Dande]

		*/		

