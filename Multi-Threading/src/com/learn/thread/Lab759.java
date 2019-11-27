package com.learn.thread;

public class Lab759 {

	public static void main(String[] args) throws Exception {
		ThreadGroup tg=new ThreadGroup("JLC");
		MyThread759 t1 = new MyThread759(tg);
		MyThread759 t2 = new MyThread759(tg);
	}
}

class MyThread759 implements Runnable {
	
	MyThread759( ThreadGroup tg){
		Thread t= new Thread(tg,this);
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
			
				Thread Name: Thread-0
				Thread Name: Thread-1
				Thread Group Name: JLC
				Thread Group Name: JLC

 */
