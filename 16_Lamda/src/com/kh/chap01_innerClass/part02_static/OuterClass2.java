package com.kh.chap01_innerClass.part02_static;

public class OuterClass2 {
	private String str = "필드";
	private static String staticStr = "정적필드";
	
	
	/*
	 * 정적 내부 클래스
	 * 	- 외부 클래스가 로드되는 시점에서 정적 내부클래스도 함께 static 영역으로 저장된다.
	 * 	- 외부 클래스에 종속적이지 않다.
	 * 	- 하나의 클래스파일에 다양한 클래스를 설계할 때 '주로' 사용한다.(DTO)
	 * 	- 외부클래스와 무관하게 다른 클래스에서도 이용할 목적으로 사용한다.
	 *   대표적으로 빌더패턴(Builder pattern) 설정
	 * 
	 */
	
	// 이 친구는 일반 내부 클래스와 다르게 public 을 쓴다.
	// outer 클래스를 보조하는 역할이 아니기 때문
	public static class staticInnerClass{
		private int num = 100;
		private static int num2 = 100;
		
		public void test() {
			//System.out.println(str); -> static 필드라 일반 클래스의 필드는 사용하지 못한다.
			System.out.println(staticStr);
			System.out.println(num);
			System.out.println(num2);
			
		}
	}
}
