package com.learn.thread;

public class Lab757 {

	public static void main(String[] args) throws Exception {
		ThreadGroup tg=new ThreadGroup("JLC");
		MyThread757 t1 = new MyThread757(tg,"Hello");
		MyThread757 t2 = new MyThread757(tg,"Hai");
	}
}

class MyThread757 extends Thread {
	
	MyThread757( ThreadGroup tg,String tname){
		super(tg,tname);
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
			
				Thread Name: Hai
				Thread Name: Hello
				Thread Group Name: JLC
				Thread Group Name: JLC
 */
