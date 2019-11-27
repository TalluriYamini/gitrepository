package com.learn.thread;


class Stack771 {
	int x;
	boolean flag = false;

	public synchronized void push(int x) {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.x = x;
		System.out.println(x + " is pushed...");
		flag = true;
		notify();
	}

	synchronized public int pop() {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(x + " is poped");
			}
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		flag = false;
		notify();
		return x;

	}
}

class A771 implements Runnable{
	Stack771 st=null;
	A771( Stack771 st, String name){
		this.st=st;
		Thread t1=new Thread(this,name);
		t1.start();
	}
	public void run() {
		int a=1;
		for (int i = 0; i < 7; i++) {
			st.push(a++);
		}
	}
}
class B771 implements Runnable{
	Stack771 st=null;
	public B771(Stack771 st,String name) {
	this.st=st;
	Thread t2=new Thread(this,name);
	t2.start();
	}
	public void run() {
		for (int i = 0; i < 7; i++) {
			st.pop();
		}
	}
}

public class Lab771 {

	public static void main(String[] args) throws Exception {
		Stack771 st=new Stack771();
		B771 obj2= new B771(st, "B");
		A771 objq= new A771(st, "A");
		
	}
}