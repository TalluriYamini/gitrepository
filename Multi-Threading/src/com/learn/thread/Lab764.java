package com.learn.thread;

public class Lab764 {

	public static void main(String[] args) throws Exception {
		Hello764 h1=new Hello764();
		//Hello764 h2=new Hello764();
		Mythread764 th1=new Mythread764(h1);
		Mythread764 th2=new Mythread764(h1);
		th1.start();th2.start();
	}
}
class Mythread764 extends Thread{
	Hello764 h;
	public Mythread764( Hello764 h) {
	this.h=h;
	}
	@Override
	public void run(){
		h.show();
	}
}
class Hello764 {
	synchronized void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName()+" -show: "+i+"\t"+this);
		 try{
			 Thread.sleep(500);
		 }catch(Exception e){
		 e.printStackTrace();
		 
		 }
		
		}
	}
}

// run it
/*
 
						Thread-0 -show: 0	book2.codes.Hello764@22406f8d
						Thread-1 -show: 0	book2.codes.Hello764@282c7f0c
						Thread-0 -show: 1	book2.codes.Hello764@22406f8d
						Thread-1 -show: 1	book2.codes.Hello764@282c7f0c
						Thread-0 -show: 2	book2.codes.Hello764@22406f8d
						Thread-1 -show: 2	book2.codes.Hello764@282c7f0c
						Thread-1 -show: 3	book2.codes.Hello764@282c7f0c
						Thread-0 -show: 3	book2.codes.Hello764@22406f8d
						Thread-0 -show: 4	book2.codes.Hello764@22406f8d
						Thread-1 -show: 4	book2.codes.Hello764@282c7f0c

 
 
 */
