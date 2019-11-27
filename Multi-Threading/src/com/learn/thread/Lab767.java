package com.learn.thread;

public class Lab767 {

	public static void main(String[] args) throws Exception {
		Hello767 h1 = new Hello767();
		Hello767 h2 = new Hello767();
		Mythread767 th1 = new Mythread767(h1);
		 Mythread767 th2 = new Mythread767(h2);
		th1.start();
		 th2.start();
	}
}

class Mythread767 extends Thread {
	Hello767 h = null;

	public Mythread767(Hello767 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello767 {
	void show() {
		Thread th = Thread.currentThread();
		synchronized (Hello767.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + " -show: " + i);
				try {
					Thread.sleep(1500);
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
