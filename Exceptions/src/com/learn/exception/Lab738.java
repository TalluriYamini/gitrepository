package com.learn.exception;


public class Lab738 {

	public static void main(String[] args) {

		System.out.println("Main Started");
	
		try{
			StudentService738 serv=new StudentService738();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main Completed");
		
	
	}
}
 

class StudentService738{
	String getNameBySid(String sid){
		if(sid==null || sid.isEmpty()|| !sid.equals("JLC-099"))
				throw new StudentnotFoundException738(sid);
			
		else 
			return "Hrishi";
	}
}
 class StudentnotFoundException738 extends RuntimeException{
	 public StudentnotFoundException738(String sid) {
		 super(sid);
	 }
 }



/*
	

			Main Started
			book2.codes.StudentnotFoundException738
				at book2.codes.StudentService738.getNameBySid(Lab738.java:26)
				at book2.codes.Lab738.main(Lab738.java:12)
			main Completed



*/				