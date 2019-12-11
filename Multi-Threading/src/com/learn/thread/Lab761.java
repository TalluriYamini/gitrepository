package com.learn.thread;

public class Lab761 {

	public static void main(String[] args) throws Exception {
		MyThread761 t1 = new MyThread761();
		//t1.setPriority(10);//Thread[Thread-0,10,main]
		t1.setPriority(0);// java.lang.IllegalArgumentException
		//t1.setPriority(11);// java.lang.IllegalArgumentException
		System.out.println(t1);
	}
}

class MyThread761 extends Thread {}

// run it 
/*
			
			

 */
