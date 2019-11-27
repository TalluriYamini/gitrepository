package com.learn.thread;

public class Lab756 {

	public static void main(String[] args) throws Exception {
		MyThread756 t1 = new MyThread756("Hello");
		MyThread756 t2 = new MyThread756("Hai");
	}
}

class MyThread756 implements Runnable {
	
	MyThread756( String tname){
		Thread t= new Thread(this,tname);
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
			
					Thread Name: Hello
					Thread Group Name: main
					Thread Name: Hai
					Thread Group Name: main

 */
