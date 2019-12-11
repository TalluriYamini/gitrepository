package com.learn.exception;

class Hello741 {
	void m1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		try {
			m2();

		} catch (ArithmeticException e) {
			System.out.println("m1-ok");
			if (1 == 2) {
				throw new ArrayIndexOutOfBoundsException();
			}else {
				throw new ArithmeticException("Dont do this");
			}
		}

	}

	void m2() throws ArrayIndexOutOfBoundsException {
		m3();
	}

	void m3() throws ArrayIndexOutOfBoundsException {
		try {
			m4();
		} catch (ArithmeticException e) {
			System.out.println("m3-ok");
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	void m4() throws ArithmeticException {
		m5();
	}

	void m5() {
		int x = 10 / 0;
	}
}

public class Lab741 {

	public static void main(String[] args) {

		System.out.println("Main Started");

		try{
			Hello741 h=new Hello741();
			h.m1();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("main Completed");

	}
}




/*
					Main Started
					m3-ok
					java.lang.ArrayIndexOutOfBoundsException
						at book2.codes.Hello741.m3(Lab741.java:28)
						at book2.codes.Hello741.m2(Lab741.java:20)
						at book2.codes.Hello741.m1(Lab741.java:6)
						at book2.codes.Lab741.main(Lab741.java:49)
					main Completed
					
					*/
