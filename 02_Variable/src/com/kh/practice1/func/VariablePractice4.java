package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String ch = sc.next();
		char ch1 = ch.charAt(0);
		char ch2 = ch.charAt(1);
		char ch3 = ch.charAt(2);

		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		
		//char ch =sc.next().charAt(); 
		
		/*System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);*/
		
		//이걸로 쓰면 apple을 3번 써야 원하는 a p p 가 나오게 된다.

	}

}
