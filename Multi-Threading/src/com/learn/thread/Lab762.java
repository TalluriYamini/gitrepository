package com.learn.thread;

public class Lab762 {

	public static void main(String[] args) throws Exception {
		MyThread762 th=new MyThread762();
		System.out.println(th.hashCode());
		Thread t1=new Thread(th);
		System.out.println(t1.hashCode());
		System.out.println(t1.getState());
		
		Thread.sleep(500);
		System.out.println(t1.getState());
		t1.start();
		Thread.sleep(5000);
		System.out.println(t1.getState());
	
	}
}

class MyThread762 extends Thread {
	
	public void run() {
		Thread th=Thread.currentThread();
		for (int i = 0; i <10; i++) {
			System.out.println(th.getName()+"-value is: "+i+"\t"+th.getState());
		try{
			Thread.sleep(10000);
			System.out.println(th.getState());
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After try- sleep ==>>"+th.getName());
		}
	}
	
}

// run it 
/*
			
			NEW
			Thread-1-value is: 0	RUNNABLE
			TIMED_WAITING
			Thread-1-value is: 1	RUNNABLE
			Thread-1-value is: 2	RUNNABLE
			Thread-1-value is: 3	RUNNABLE
			Thread-1-value is: 4	RUNNABLE
			Thread-1-value is: 5	RUNNABLE
			Thread-1-value is: 6	RUNNABLE
			Thread-1-value is: 7	RUNNABLE
			Thread-1-value is: 8	RUNNABLE
			Thread-1-value is: 9	RUNNABLE
			TERMINATED		

 */
