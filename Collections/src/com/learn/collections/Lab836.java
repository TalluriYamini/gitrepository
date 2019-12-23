package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

class Lab836 {
	public static void main(String[] args) {
		ArrayList<Integer> inList=new ArrayList<Integer>();
		inList.add(1234);
		inList.add(4567);
		inList.add(8910);
		showElement(inList);
		ArrayList<Float> FlList=new ArrayList<Float>();
		FlList.add(123.456f); 		FlList.add(456.34f);
		FlList.add(789.456f);		FlList.add(123.456f);
		showElement(FlList);
		ArrayList<String> stList=new ArrayList<String>();
		//showElement(stList);
		}	
	
	static void showElement(List<? extends Number> list){
		for (Number num : list) {
			System.out.println(num+",");
		}
		System.out.println("\n");
	}
}


/*
				 
					1234,
					4567,
					8910,
					
					
					123.456,
					456.34,
					789.456,
					123.456,




 */
