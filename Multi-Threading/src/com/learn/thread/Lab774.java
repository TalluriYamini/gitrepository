package com.learn.thread;

class Lab774 {
	public static void main(String[] args) {

		Thread th1 = Thread.currentThread();
		MyTread774 th2 = new MyTread774();
		th2.start();
		for (char ch = 'A'; ch < 'L'; ch++) {
			System.out.println(th1.getName() + "\t\t" + ch + "\t" + th1.isDaemon());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

class MyTread774 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + "\t" + i + "\t" + isDaemon());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}