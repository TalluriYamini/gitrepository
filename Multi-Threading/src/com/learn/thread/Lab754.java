package com.learn.thread;

public class Lab754 {

	public static void main(String[] args) throws Exception {
		MyThread754 t1 = new MyThread754();
		MyThread754 t2 = new MyThread754();
	}
}

class MyThread754 extends Thread {
	
	MyThread754(){
		start();
		Thread t= new Thread(this);
		t.start();
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
			Thread Name: Thread-3
			Thread Group Name: main
			Thread Group Name: main

 */
