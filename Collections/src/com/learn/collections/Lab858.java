package com.learn.collections;

import java.util.Calendar;

class Lab858 {
	public static void main(String[] args) {
		
		Calendar today=Calendar.getInstance();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DATE, 13);
		cal.set(Calendar.MONTH,5);
		cal.set(Calendar.YEAR, 2014);
		System.out.println("After Today: "+today.after(cal));
		System.out.println("Before Today: "+today.before(cal));
		System.out.println("compareTo: "+today.compareTo(cal));
		
	}
}

/*
			After Today: true
			Before Today: false
			compareTo: 1

*/