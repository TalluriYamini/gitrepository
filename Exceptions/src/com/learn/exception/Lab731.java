package com.learn.exception;

public class Lab731 {

	public static void main(String[] args) {
		try{
			new Hello731().show();
		}catch(Exception e){
			System.out.println("\ncatch block");
			System.out.println("EX: "+e);
			System.out.println("Message: "+e.getMessage());
			System.out.println("Cause: "+e.getCause());
			System.out.println();
			e.printStackTrace();
		}
	}
}

class Hello731{
	void show(){
	System.out.println("show() begins");
	new A().m1();
	System.out.println("show() ends");
	}
}

class A{
	void m1(){
		System.out.println("A->m1() begins");
		new B().m2();
		System.out.println("A-> m1() ends");
	}
}
 class B{
	 void m2(){
			System.out.println("B->m2() begins");
			new C().m3();
			System.out.println("B-> m2() ends");
		}
 }
 class C{
	 void m3(){
			System.out.println("C->m3() begins");
			int x=10/0;
			System.out.println("C-> m3() ends");
		}
 }

// java Lab714 value(numeric)

// output:

/*


				show() begins
				A->m1() begins
				B->m2() begins
				C->m3() begins
				
				catch block
				EX: java.lang.ArithmeticException: / by zero
				Message: / by zero
				Cause: null
				
				java.lang.ArithmeticException: / by zero
					at book2.codes.C.m3(Lab731.java:44)
					at book2.codes.B.m2(Lab731.java:37)
					at book2.codes.A.m1(Lab731.java:30)
					at book2.codes.Hello731.show(Lab731.java:22)
					at book2.codes.Lab731.main(Lab731.java:7)

 
 
 */
