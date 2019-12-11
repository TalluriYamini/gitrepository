package com.learn.exception;


public class Lab737 {

	public static void main(String[] args) {

		System.out.println("Main Started");
		String nm="";
		try{
			StudentService serv=new StudentService();
			//nm=serv.getNameBySid(null);
			//nm=serv.getNameBySid("");
			//nm=serv.getNameBySid("JLC-088");
			nm=serv.getNameBySid("JLC-099");
			System.out.println("Name: "+nm);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main Completed");
		
	
	}
}
 
class EmptySidException extends RuntimeException{}

class StudentService{
	String getNameBySid(String sid){
		if(sid==null)
			throw new NullPointerException();
		else if(sid.isEmpty())
			throw new EmptySidException();
		else if(sid.equals("JLC-099"))
			return "Hrishi";
		else {
			throw new StudentnotFoundException(sid);
		}
	}
}
 class StudentnotFoundException extends RuntimeException{
	 public StudentnotFoundException(String sid) {
		 super(sid);
	 }
 }



/*
	
			
			
			Main Started
			Name: Hrishi
			main Completed
*/				