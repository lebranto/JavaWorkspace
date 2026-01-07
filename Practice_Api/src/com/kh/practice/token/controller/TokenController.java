package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
			
		
		//공백 제거
		//방법 1.
		System.out.println(str.replace(" ", ""));
		//방법 2.
		//split(" ")을 활용하여 " "기준 문자를 분리하고, 분리된 문자를 다시 하나로 합친다.
		String[]arr = str.split(" ");
		String result = "";
		for (String s : arr) {
			result += s;
		}
		System.out.println("split : " + result);
		
		//방법 3.
		//StringTokenizer 이용
		StringTokenizer stz = new StringTokenizer(str, " ");
		
		String result2 = "";
		while(stz.hasMoreTokens()) {
			result2 += stz.nextToken(); 
		}
		
		
		
		return "";
	}
	
	
	public String firstCap(String input) {
		
		//String s = input.replace(input.substring(0,1),input.substring(0,1).toUpperCase());
		//같은 문자열을 다 바꾸기 때문에 안됨.
		
		String other = input.substring(1);
		String first = input.substring(0,1).toUpperCase().concat(other);
		
		
		
		return first;
		
	}
	
	public int findCahr(String input, char one) {
		
		int count = 0;
		
//		for(int i = 0 ; i < input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
		
		char [] arr = input.toCharArray();
		for (char ch : arr) {
			if(ch == one) {
				count++;
			}
		}
		
		return count;
	}

}
