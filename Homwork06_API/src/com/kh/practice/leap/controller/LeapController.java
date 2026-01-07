package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapyear(int year){
		
		boolean yun = false;
		
		if(year %4 ==0 && year % 100 !=0 || year % 400 ==0) {
			yun = true;
		}else {
			yun = false;
		}
		
		return yun;
	}
	
	public long leapDate(Calendar c) {
		
		
		long nyun = 0;
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2001, 0, 1);
		
		int year = c1.get(Calendar.YEAR);
		
		for(int i = 1 ; i<26 ; i++) {
			if (year %4 ==0 && year % 100 !=0 || year % 400 ==0) {
				nyun += 366;
			}else {
				nyun += 365;
			}
			year+=1;
		}
		
		Calendar c2 = Calendar.getInstance();
		c2.set(2025, 11, 31);
		
		long day1 = c.getTimeInMillis();
		long day2 = c2.getTimeInMillis();
		
		long diff = (long)((day1 - day2)/1000.0 / 60/ 60/24);
	
		
		return nyun+diff+1;
		
	}

}
