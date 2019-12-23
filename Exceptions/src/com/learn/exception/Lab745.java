package com.learn.exception;


public class Lab745 {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");
		
		//try(
			//JLCResource745 res1=new JLCResource745(1);
			//The resource type JLCResource745 does not implement 
				//java.lang.AutoCloseable	
			//JLCResource745 res2= new JLCResource745(2);
				//The resource type JLCResource745 does not implement 
				//java.lang.AutoCloseable	
	//	)
		
		
		//{
		
		//}
		//catch(Exception e){
		//	System.out.println(e);
		//}
		System.out.println("Main Ends");

	}
}
class JLCResource745 {
	int id;
	public JLCResource745(int id) {
		this.id=id;
	}
	public void close() {
		System.out.println("JLCResource745 Closed: " +id);
	}
}



/*
  
  
*/
