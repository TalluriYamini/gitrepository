package com.learn.exception;


public class Lab744 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");
		
		try(
			JLCResource744 res1=new JLCResource744(1);
			JLCResource744 res2= new JLCResource744(2);
		){
		//statement
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Main Ends");
		
	}
}
class JLCResource744 implements AutoCloseable{
	int id;
	public JLCResource744(int id) {
		this.id=id;
	}
	public void close() {
		System.out.println("JLCResource744 Closed: " +id);
	}
}





/*
 
				Main Started
				JLCResource744 Closed: 2
				JLCResource744 Closed: 1
				Main Ends
			
  
  
*/
