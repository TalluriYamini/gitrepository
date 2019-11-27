package com.learn.thread;

public class Lab753 {

	public static void main(String[] args) throws Exception {
		MyThread753 t1 = new MyThread753();
		MyThread753 t2 = new MyThread753();
	}
}

class MyThread753 extends Thread {
	
	MyThread753(){
		start();
	}
	 public void run(){
		 Thread th=Thread.currentThread();
		 ThreadGroup tg=th.getThreadGroup();
		 System.out.println("Thread Name: "+th.getName());
		 System.out.println("Thread Group Name: "+tg.getName());
	 }
}

// run it 
/*
			
			Thread Name: Thread-1
			Thread Group Name: main
			Thread Name: Thread-0
			Thread Group Name: main


 */
