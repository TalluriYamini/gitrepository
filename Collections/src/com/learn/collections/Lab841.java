package com.learn.collections;

import java.util.PriorityQueue;

class Lab841 {
	public static void main(String[] args) {
	  int[] values={1,5,3,7,6,9,8};
	  int len=values.length;
	  PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
	  for (int  x : values) {
		pq1.offer(x);
	}
	  
	  System.out.println(pq1);
	  for (int i = 0; i < len; i++) 
		System.out.print(pq1.poll()+" ");
	  
	  System.out.println("\nSTRINGS");
	  String nms[]={"Sri","Nivas","kumar","Dande","Rahul"};
	  int len2=nms.length;
	  PriorityQueue<String> pq2=new PriorityQueue<String>();
	  for (String str : nms) 
		pq2.offer(str);
	  System.out.println(pq2);
	  for (int i = 0; i < len2; i++) {
		System.out.print(pq2.poll()+" ");
	}
	}
}


/*
				
				
				[]
				null 
				null 
				null 
				null 
				null 
				null 
				null 
				STRINGS
				[]
				null 
				null 
				null 
				null 
				null 


 */
