package com.learn.thread;

public class Lab765 {

	public static void main(String[] args) throws Exception {
		Hello765 h1 = new Hello765();
		//Hello765 h2 = new Hello765();
		Mythread765 th1 = new Mythread765(h1);
		Mythread765 th2 = new Mythread765(h1);
		th1.start();
		th2.start();
	}
}

class Mythread765 extends Thread {
	Hello765 h = null;

	public Mythread765(Hello765 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello765 {
	void show() {
		Thread th = Thread.currentThread();

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + " -show: " + i + "\t" + this);
				try {
					Thread.sleep(500);
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
