package com.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Lab835 {
	public static void main(String[] args) {
		ArrayList<String> emails=new ArrayList<String>();
		emails.add("sri@jlc.com");
		emails.add("dk@jlc.com");
		emails.add("mk@jlc.com");
		ArrayList<Long> phones=new ArrayList<Long>();
		phones.add(555555L);
		phones.add(66666L);
		phones.add(777777L);
		LinkedHashMap<String, Long> refs= new LinkedHashMap<String,Long>();
		refs.put("Dande", 111111L);
		refs.put("kumar", 22222L);
		refs.put("Ranjan", 33333L);
		Student835 stu=new Student835(99, "Hrishi", emails, phones, refs);
		ArrayList<Student835> stList=new ArrayList<Student835>();
		stList.add(stu);stList.add(stu);stList.add(stu);
		stList.add(stu);stList.add(stu);
		
		System.out.println(stList);
	}	
}

class Student835{
	int sid;
	String name;
	List<String> emails;
	List<Long> phones;
	Map<String,Long> refs;
	public Student835(int sid, String name, List<String> emails, List<Long> phones, Map<String, Long> refs) {
		this.sid = sid;
		this.name = name;
		this.emails = emails;
		this.phones = phones;
		this.refs = refs;
	}
	public String toString() {
		return "Student835 [sid=" + sid + ", name=" + name + ", emails=" + emails + ", phones=" + phones + ", refs="
				+ refs + "]\n";
	}
	
	
	
}

/*
				 

		[Student835 [sid=99, name=Hrishi, emails=[sri@jlc.com, dk@jlc.com, mk@jlc.com], phones=[555555, 66666, 777777], refs={Dande=111111, kumar=22222, Ranjan=33333}]
		, Student835 [sid=99, name=Hrishi, emails=[sri@jlc.com, dk@jlc.com, mk@jlc.com], phones=[555555, 66666, 777777], refs={Dande=111111, kumar=22222, Ranjan=33333}]
		, Student835 [sid=99, name=Hrishi, emails=[sri@jlc.com, dk@jlc.com, mk@jlc.com], phones=[555555, 66666, 777777], refs={Dande=111111, kumar=22222, Ranjan=33333}]
		, Student835 [sid=99, name=Hrishi, emails=[sri@jlc.com, dk@jlc.com, mk@jlc.com], phones=[555555, 66666, 777777], refs={Dande=111111, kumar=22222, Ranjan=33333}]
		, Student835 [sid=99, name=Hrishi, emails=[sri@jlc.com, dk@jlc.com, mk@jlc.com], phones=[555555, 66666, 777777], refs={Dande=111111, kumar=22222, Ranjan=33333}]
		]



 */
