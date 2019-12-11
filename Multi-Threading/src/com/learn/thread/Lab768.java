package com.learn.thread;

public class Lab768 {

	public static void main(String[] args) throws Exception {
		Hello768 h1 = new Hello768();
		//Hello768 h2 = new Hello768();
		Mythread768 th1 = new Mythread768(h1);
		 Mythread768 th2 = new Mythread768(h1);
		th1.start();
		 th2.start();
	}
}

class Mythread768 extends Thread {
	Hello768 h ;

	public Mythread768(Hello768 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello768 {
	synchronized void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			try {
			wait(1000);
			Thread.sleep(1000);
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
