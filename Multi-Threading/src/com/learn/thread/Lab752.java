package com.learn.thread;

public class Lab752 {

	public static void main(String[] args) throws Exception {
		MyThread752 t1 = new MyThread752();
		MyThread752 t2 = new MyThread752();
		//t1.start();//The method start() is undefined for the type MyThread752
		//t2.start();//The method start() is undefined for the type MyThread752
		Thread t = Thread.currentThread();
		for (int i = 0; i < 100; i++) {
			System.out.println(t.getName() + "-value is : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread752 implements Runnable {
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i <= 10; i++) {
			System.out.println("MyThread752 "+th.getName() + "-value is: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// run it 
/*

 */
