package com.learn.collections;

import java.util.*;

class Lab863 {
	public static void main(String[] args) {
		System.out.println("About to schedule task.");
		new Reminder(5);
		System.out.println("Task scheduled");
 	}
}

class Reminder{
	Timer timer;
	public Reminder(int seconds){
		timer=new Timer();
		timer.schedule(new ReminderTask(), seconds*1000);
	}
	
	class ReminderTask extends TimerTask{
		public void run(){
			System.out.println("Times up!");
			timer.cancel();
}


	}
}

/*
 
					About to schedule task.
					Task scheduled
					Times up!

*/