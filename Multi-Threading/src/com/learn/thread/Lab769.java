package com.learn.thread;

import java.util.ArrayList;

public class Lab769 {

	public static void main(String[] args) throws Exception {
		Hello769 h1 = new Hello769();
		Mythread769 th1 = new Mythread769(h1);
		 Mythread769 th2 = new Mythread769(h1);
		th1.start();
		 th2.start();
	}
}

class Mythread769 extends Thread {
	Hello769 h ;

	public Mythread769(Hello769 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello769 {
	synchronized void show() {
		ArrayList al=new ArrayList();		
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			try {
			//wait(1000);
			//al.wait(1000);
			System.out.println(th.getName() + " -show: " + i+"\t"+this);
		
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}
}

// run it and watch
/*
 
 */
