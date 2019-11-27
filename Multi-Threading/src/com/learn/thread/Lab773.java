package com.learn.thread;


class Lab773 {
	public static void main(String[] args) throws InterruptedException {
		
		Greetings773 g=new Greetings773();
		g.start();
		g.join();
		System.out.println("Greetings ! from java Lerning Center");
		
	}

}
 class Greetings773 extends Thread {
	public void run() {
		for (int i = 0; i >1; i--) {
			try{
				System.out.println(i);
			Thread.sleep(500);	
			}catch(Exception e)
			{e.printStackTrace();}
			
		}
	}
 }