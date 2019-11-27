package com.learn.thread;

import java.util.ArrayList;

public class Lab770 {

	public static void main(String[] args) throws Exception {
		Hello770 h1 = new Hello770();
		Mythread770 th1 = new Mythread770(h1);
		 Mythread770 th2 = new Mythread770(h1);
		th1.start();
		 th2.start();
	}
}

class Mythread770 extends Thread {
	Hello770 h ;

	public Mythread770(Hello770 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello770 {
	synchronized void show() {
		ArrayList al=new ArrayList();		
		Thread th = Thread.currentThread();
		synchronized (al) {
			for (int i = 0; i < 5; i++) {
				try {
				wait(1000);
				al.wait(1000);
				System.out.println(th.getName() + " -show: " + i+"\t"+this);
			
				} catch (Exception e) {
					e.printStackTrace();

				}
		}
		
		
		}

	}
}

// run it and watch
/*
 
 */
