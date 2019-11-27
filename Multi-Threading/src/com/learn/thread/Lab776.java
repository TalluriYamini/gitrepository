package com.learn.thread;

class Lab776 {
	public static void main(String[] args) {

		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				Thread th=Thread.currentThread();
				for (int i = 0; i < 10; i++) {
					System.out.println(th.getName()+"\t"+i);
				}
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();t2.start();

	}

}
