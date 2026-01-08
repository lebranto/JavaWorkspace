package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		
		
		Calendar cal1 = Calendar.getInstance();
		LeapController lc = new LeapController();

		int year = cal1.get(Calendar.YEAR);
		String nyun = "";
		
		boolean s = lc.isLeapyear(year);
		
		if(s == false) {
			nyun = "평년";
		} else if (s== true) {
			nyun = "윤년";
		}
		
		
		//System.out.println(year+ "년은 " +lc.isLeapyear(year)+ "입니다");
		// lc.isLeapyear(year)가 먼저 실행되고 결과값이 합쳐지기 때문에 
		// 평년이 앞에 나오게 된다.
		
		System.out.println( year+ "년은 " +nyun+ "입니다");
		
		System.out.println("총 날짜 수 : " + lc.leapDate(cal1));
		
		
		//System.out.println(year+ "년은 " +(lc.isLeapyear(year) ? "윤년" : "평년")+ "입니다");
		//long total = lc.leapdate(cal1)
	}

}
