package com.learn.thread;

public class Lab766 {

	public static void main(String[] args) throws Exception {
		Hello766 h1 = new Hello766();
		Hello766 h2 = new Hello766();
		Mythread766 th1 = new Mythread766(h1);
		Mythread766 th2 = new Mythread766(h2);
		th1.start();
		 th2.start();
	}
}

class Mythread766 extends Thread {
	Hello766 h = null;

	public Mythread766(Hello766 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello766 {
	synchronized static void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + " -show: " + i );
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();

			}

		}
	}
}

// run it and watch
/*
 
 */
