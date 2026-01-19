package com.kh.practice.lambda;

import java.util.Comparator;

public class LambdaPractice6 {
	
	
	
	
	
	public static Comparator<String> getComparator(String mod){
		Comparator<String> comp = null;
		
		switch(mod) {
		case "length" ->
		     comp = (s1, s2) -> s1.length() - s2.length();
		case "reverse" ->
			 comp = (s1,s2)-> s2.compareTo(s1);
		default ->
		  throw new RuntimeException("잘못된 입력입니다.");
		
		}
		
		return comp;
	} 
}
