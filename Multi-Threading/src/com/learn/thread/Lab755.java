package com.learn.thread;

public class Lab755 {

	public static void main(String[] args) throws Exception {
		MyThread755 t1 = new MyThread755("Hello");
		MyThread755 t2 = new MyThread755("Hai");
	}
}

class MyThread755 extends Thread {
	
	MyThread755( String tname){
		super(tname);
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
			
				Thread Name: Hello
				Thread Name: Hai
				Thread Group Name: main
				Thread Group Name: main

 */
