package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapyear(int year) {

		boolean yun = false;

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			yun = true;
		} else {
			yun = false;
		}

		return yun;
	}

	public long leapDate(Calendar c) {

		long total = 0;

		Calendar c1 = Calendar.getInstance();
		c1.set(2001, 0, 1);

		int year = c1.get(Calendar.YEAR);

		for (int i = 1; i < c1.get(Calendar.YEAR); i++) {
			// if (year %4 ==0 && (year % 100 !=0 || year % 400 ==0))
			if (isLeapyear(c.get(Calendar.YEAR))) {
				total += 366;
			} else {
				total += 365;
			}
			year += 1;
		}

		int month = c.get(Calendar.MONTH);

		for (int i = 0; i < month; i++) {
			switch (i) {
			case 1, 3, 5, 7, 8, 10, 12:
				total += 31;
				break;
			case 4, 6, 9, 11:
				total += 30;
				break;
			case 2:
				total += isLeapyear(c.get(Calendar.YEAR)) ? 29 : 28;

			}
		}
			
		int date = c.get(Calendar.DATE);
		total += date;

//		Calendar c2 = Calendar.getInstance();
//		c2.set(2025, 11, 31);

//		long day1 = c.getTimeInMillis();
//		long day2 = c2.getTimeInMillis();
//
//		long diff = (long) ((day1 - day2) / 1000.0 / 60 / 60 / 24);

		return total;
		
	}
}
