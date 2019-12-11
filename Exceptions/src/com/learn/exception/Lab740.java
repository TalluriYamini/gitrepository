package com.learn.exception;


public class Lab740 {

	public static void main(String[] args) throws StudentnotFoundException740{

		System.out.println("Main Started");
	
		try{
			StudentService740 serv=new StudentService740();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main Completed");
		
	
	}
}
 

class StudentService740{
	String getNameBySid(String sid) throws StudentnotFoundException740{
		if(sid==null || sid.isEmpty()|| !sid.equals("JLC-099"))
				throw new StudentnotFoundException740(sid);
			
		else 
			return "Hrishi";
	}
}
 class StudentnotFoundException740 extends RuntimeException{
	 public StudentnotFoundException740(String sid) {
		 super(sid);
	 }
 }



/*
	

			Main Started
			book2.codes.StudentnotFoundException740
				at book2.codes.StudentService740.getNameBySid(Lab738.java:26)
				at book2.codes.Lab738.main(Lab738.java:12)
			main Completed



*/				