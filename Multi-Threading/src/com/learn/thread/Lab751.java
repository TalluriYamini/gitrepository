package com.learn.thread;

public class Lab751 {

	public static void main(String[] args) throws Exception {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		for (int i = 0; i < 100; i++) {
			System.out.println(t.getName() + "-value is : " + i+" ===>>Main Method");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread {
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i <= 10; i++) {
			System.out.println("MyThread"+th.getName() + "-value is: " + i+" ===>>run Method");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// run it

/*

 */
