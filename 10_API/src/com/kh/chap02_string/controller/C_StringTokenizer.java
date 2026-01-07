package com.kh.chap02_string.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C_StringTokenizer {
	
	
	public void method(){
		String str = "Java,Oracle,JDBC,HTML,Spring";
		
		// 구분자를 제시해서 문자열 구분자 기준으로 분리시키는 방법
		// 방법 1 문자열 split(구분자) -> 스트링 배열에 담아 출력 출력 String[]
		// - 분리된 문자열들을 String[] 에 담아 관리해주는 메서드
		String [] arr = str.split(","); //[Java, Oracle, JDBC, HTML, Spring] 로 저장

		//장점 : 사용하기 편하다.
		//단점 : 배열이 커지면 메모리 부족으로 성능 저하가 일어 날 수 있다.
		
		System.out.println(Arrays.toString(arr));
		
		//방법 2. 분리된 각각의 문자열들을 토큰으로 취급하여 관리하는 방법
		//   StringTokenizer stn = new SringTokenize(문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());
		
		//countTokens은 token 화된 문자열을 세어주는 함수
		
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
	
		//nextToken은 token화된 문자열을 순서대로 꺼내는 것.
		//꺼내게 되면 그 값은 없어지게 된다.
		//호출 할때마다 잠깐 저장 공간을 갖기 때문에 메모리 부족이 완화 될 수 있다.
		//단 원하는 문자열을 꺼낼 때 원하는 문자열까지 반복 작업을 해야 한다는 단점이 있다.
		
		//NosuchElementException
		//현재 남아 있는 토큰의 갯수 범위를 벗어나면 에러 발생
		
//		//1번 방법
//		while(stn.countTokens() > 0) {
//			System.out.println(stn.nextToken());
//		}
		
		//2번 방법
		while(stn.hasMoreTokens()) { //stn에 토큰이 1개 이상 있는 경우 true / false
			System.out.println(stn.nextToken());
		}
		
	}

}
