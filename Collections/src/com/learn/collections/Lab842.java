package com.learn.collections;

import java.util.PriorityQueue;

class Lab842 {
	public static void main(String[] args) {
	 
	  PriorityQueue<String> que=new PriorityQueue<String>();
	  que.add("Srinivas");
	  que.add("Manish");
	  que.offer("Kumar");
	  que.offer("Dande");
	  que.offer("Srinivas");
	  que.add("Ranjan");
	  System.out.println(que);//[Dande, Kumar, Manish, Srinivas, Srinivas, Ranjan]
	  System.out.println("Size: "+que.size());//Size: 6
	  System.out.println("Peek: "+que.peek());//Peek: Dande
	  System.out.println("Size: "+que.size());//Size: 6
	  System.out.println("Element: "+que.element());//Element: Dande
	  System.out.println("Size: "+que.size());//Size: 6
	  System.out.println("Poll: "+que.poll());//Poll: Dande
	  System.out.println("Size: "+que.size());//Size: 5
	}
}


/*
 
			 [Dande, Kumar, Manish, Srinivas, Srinivas, Ranjan]
			Size: 6
			Peek: Dande
			Size: 6
			Element: Dande
			Size: 6
			Poll: Dande
			Size: 5

 
 
				
				
				
			[1, 5, 3, 7, 6, 9, 8]
			1 
			3 
			5 
			6 
			7 
			8 
			9 
			STRINGS
			[Dande, Nivas, kumar, Sri, Rahul]
			Dande 
			Nivas 
			Rahul 
			Sri 
			kumar 



 */
