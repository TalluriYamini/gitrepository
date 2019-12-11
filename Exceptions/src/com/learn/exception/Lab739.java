package com.learn.exception;


public class Lab739 {

	public static void main(String[] args) {

		System.out.println("Main Started");
	
		try{
			StudentService739 serv=new StudentService739();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main Completed");
		
	
	}
}
 

class StudentService739{
	String getNameBySid(String sid) throws StudentnotFoundException739{
		if(sid==null || sid.isEmpty()|| !sid.equals("JLC-099"))
				throw new StudentnotFoundException739(sid);
			
		else 
			return "Hrishi";
	}
}
 class StudentnotFoundException739 extends RuntimeException{
	 public StudentnotFoundException739(String sid) {
		 super(sid);
	 }
 }



/*
	

			Main Started
			book2.codes.StudentnotFoundException739
				at book2.codes.StudentService739.getNameBySid(Lab738.java:26)
				at book2.codes.Lab738.main(Lab738.java:12)
			main Completed



*/				