package com.kh.chap02_string.controller;

public class D_StringMethod {
	
	public void method() {
		String str1 = "Hello World";
		
		
		// 1. 문자열.charAt(int index) -> char 로 반환
		// 특정 위치의 문자를 뽑아내는 함수
		
		char ch = str1.charAt(6); //=> W문자를 뽑음
		System.out.println("CH : " + ch);
		
		
		//2. 문자열의 길이를 반환하는 메서드
		//   문자열.length()  -> int 값 반환
		System.out.println("str1의 길이 : " + str1.length());
		
		//3. 문자열.concat (String str) -> String 값 반환
		//   - 문자열과 전달된 또다른 문자열을 하나라로 합쳐주는 메서드
		
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		//4. 문자열.substring(int beginIndex)  -> String 값 반환
		//  - 문자열의 시작 인덱스 위치부터 끝까지의 문자열을 추출하여 리턴
		
		//  문자열.substring(int beginIndex ,int endIndex) -> String값 반환
		//  - 문자열의 시작 인덱스부터 종료 인덱스까지의 문자열을 추출하여 리턴
		
		// "World" 만 추출
		System.out.println(str1.substring(6));
		
		// "Hello" 만 추출
		System.out.println(str1.substring(0,5)); //0번 인덱스부터 5번까지
		
		//5. 문자열.replace (char old, char new) -> String 값 반환 
		//  -> 문자열에서 old문자를 new 문자로 변환한 문자열을 반환
		
		String str3 = str1.replace('l', 'c');
		System.out.println("str3 : " + str3);
		
		//6. 문자열.trim() -> String 값 반환
		//  -문자열의 앞 , 뒤 공백을 제거한 문자열 리턴
		
		String str4 = "      J A V A       ";
		System.out.println("trim() : " + str4.trim());
		
		// 7. 문자열.toUpperCase() : 대문자로 변경
		//    문자열.toLowerCase() : 소문자로 변경
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase()); 
		
		
		// 8. 문자열.toCharArray()  -> char 배열에 담아 반환.
		char [] arr = str1.toCharArray();
		
		// 9. static valueOf(자료형) ->  String 값 반환
		// - 전달된 자료형의 값을 "문자열"로 반환해주는 메서드, 함수형 프로그래밍에서 사용
		// - 1 -> "1"
		
		String str = "" + 1; //-> 문자열 값으로 반환됨 '문자 + 자료형' 이기 떄문 
		System.out.println(String.valueOf(arr));
		
		
		
		
		
		
}


}
