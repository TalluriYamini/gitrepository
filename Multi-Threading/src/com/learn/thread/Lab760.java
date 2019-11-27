package com.learn.thread;

public class Lab760 {

	public static void main(String[] args) throws Exception {
		MyThread760 t1 = new MyThread760();
		MyThread760 t2 = new MyThread760();
		t1.setName("Hello");
		t2.setName("Hai");
		t1.start();t2.start();
	}
}

class MyThread760 extends Thread {
	 public void run(){
		 Thread th=Thread.currentThread();
		 ThreadGroup tg=th.getThreadGroup();
		 System.out.println("Thread Name: "+th.getName());
		 System.out.println("Thread Group Name: "+tg.getName());
	 }
}

// run it 
/*
			
			Thread Name: Hello
			Thread Name: Hai
			Thread Group Name: main
			Thread Group Name: main

 */
