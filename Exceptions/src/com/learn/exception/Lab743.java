package com.learn.exception;


public class Lab743 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");
		JLCResource743 res1=null;
		JLCResource743 res2=null;
		//try(
			res1=new JLCResource743(1);
			res2= new JLCResource743(2);
		//){	
		//statement
		//}
		//catch(Exception e){
			//System.out.println(e);
		//}
		System.out.println("Main Ends");
		//Multiple markers at this line
		//- Syntax error, insert "}" to complete Block
		//- Syntax error, insert "Finally" to complete 
		 //TryStatement
	}
}
class JLCResource743 implements AutoCloseable{
	int id;
	public JLCResource743(int id) {
		this.id=id;
	}
	public void close() {
		System.out.println("JLCResource743 Closed: " +id);
	}
}




/*
 
		

  
  
*/
