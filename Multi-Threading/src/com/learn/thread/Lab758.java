package com.learn.thread;

public class Lab758 {

	public static void main(String[] args) throws Exception {
		ThreadGroup tg=new ThreadGroup("JLC");
		MyThread758 t1 = new MyThread758(tg,"Hello");
		MyThread758 t2 = new MyThread758(tg,"Hai");
	}
}

class MyThread758 implements Runnable {
	
	MyThread758( ThreadGroup tg,String tname){
		Thread t= new Thread(tg,this,tname);
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
			Thread Group Name: JLC
			Thread Name: Hai
			Thread Group Name: JLC

 */
