package com.learn.collections;

import java.util.Calendar;
import java.util.Date;

class Lab857 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		Date dt=cal.getTime();
		System.out.println(dt);
		System.out.println("Day: "+cal.get(Calendar.DATE));
		System.out.println("Day: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mon: "+cal.get(Calendar.MONTH));
		System.out.println("Mon: "+cal.get((Calendar.MONTH)+1));
		System.out.println("Year: "+cal.get(Calendar.YEAR));
		System.out.println("Hour: "+cal.get(Calendar.HOUR));
		System.out.println("Hour: "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Min:"+cal.get(Calendar.MINUTE));
		System.out.println("Sec: "+cal.get(Calendar.SECOND));
		System.out.println("AM_PM: "+cal.get(Calendar.AM_PM));
		System.out.println("\n ADDING 7 DAYS");
		cal.add(Calendar.DATE, 7);
		System.out.println(cal.getTime());
		System.out.println("\n set Month as March");
		cal.set(Calendar.MONTH, Calendar.MARCH);
		System.out.println(cal.getTime());
		

	}
}

/*
 
 
					java.util.GregorianCalendar[time=1461223616973,areFieldsSet=true,areAllFieldsSet=true,
					 lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,
					 dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
					 ERA=1,YEAR=2016,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=112,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,
					 AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=56,SECOND=56,MILLISECOND=973,ZONE_OFFSET=19800000,DST_OFFSET=0]
					Thu Apr 21 12:56:56 IST 2016
					Day: 21
					Day: 21
					Mon: 3
					Mon: 17
					Year: 2016
					Hour: 0
					Hour: 12
					Min:56
					Sec: 56
					AM_PM: 1
					
					 ADDING 7 DAYS
					Thu Apr 28 12:56:56 IST 2016

 set Month as March
Mon Mar 28 12:56:56 IST 2016
 
 */