package com.learn.thread;


class Lab773 {
	public static void main(String[] args) throws InterruptedException {
		
		Greetings773 g=new Greetings773();
		Greetings773 g2=new Greetings773();
	
	
		//g.join();
		g2.start();
		
		g.start();
		g2.join();
		
		System.out.println("Greetings ! from java Lerning Center");
		
	}

}
 class Greetings773 extends Thread {
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 10; i >=1; i--) {
			try{
				System.out.println(i + th.getName());
			Thread.sleep(500);	
			}catch(Exception e)
			{e.printStackTrace();}
			
		}
	}
 }