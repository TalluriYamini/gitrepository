package com.learn.thread;

class Lab772 {
	public static void main(String[] args) {

		Service772 s = new Service772();
		s.start();
		for (char ch = 'A'; ch < 'j'; ch++) {
			System.out.println("main Running: " + ch);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}

class Service772 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Service Running " + i);
			if (i == 5) {
				int x = 10 / 0;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}