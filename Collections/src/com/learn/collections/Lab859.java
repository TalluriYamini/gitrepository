package com.learn.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Lab859 {
	public static void main(String[] args) throws ParseException {
		 
		SimpleDateFormat fmt=new SimpleDateFormat("yyy-MM-dd");
		String res=fmt.format(new Date());
		System.out.println(res);//2016-04-21
		SimpleDateFormat fmt2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String res1=fmt2.format(new Date());
		System.out.println(res1);//2016-04-21 13:06:13
		Date date= fmt.parse("2013-10-25");//Fri Oct 25 00:00:00 IST 2013
		System.out.println(date);
		
		
	}
}
/*
 
 y=year(yy or yyyy)				M=month(MM)				
 d=day in month(dd)				h=hour(0-12)(hh);
 H=hour(0-23)(HH)				m=minute in hour(mm)
 s=seconds(ss)					S=milliseconds(SSS)
 
 
 */


/*

2016-04-21
2016-04-21 13:06:13
Fri Oct 25 00:00:00 IST 2013


*/