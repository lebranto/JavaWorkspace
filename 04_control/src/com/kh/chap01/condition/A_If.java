package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * 조건문 - 조건식을 통해 참/거짓을 판단하여 그에 해당하는 코드를 실행 - 조식은 보통 비교연산자, 논리 연산자를 사용하여 작성한다. -
	 * 조건문은 IF / Switch문으로 나뉜다.
	 * 
	 */
	Scanner sc = new Scanner(System.in);

	public void method() {
		/*
		 * 단독 IF문 [표현법] if(조건식) { 조건식이 true인 경우 실행할 코드 }
		 * 
		 */

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다.");
		}
		if (num <= 0) {
			System.out.println("양수가 아니다.");
		}
	}

	public void method2() {

		/*
		 * if ~ else문 if(조건식){ //조건식이 true인 경우 실행할 코드 } else{ //조건식이 false인 경우 실행할 코드 }
		 */

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {

			System.out.println("양수다.");
		} else {
			System.out.println("양수 아니다.");
		}

	}

	public void method3() {
		/*
		 * if ~ else if 문 - 같은 비교대상으로 "여러개의 조건"을 제시해야 하는 경우 사용. if (조건식 1){ //조건식 1이
		 * true인 경우 실행할 코드 } else if(조건식2) { // 조건식2가 true인 경우 실행할 코드 } else if(조건식n) {
		 * // 조건식n이 true인 경우 실행할 코드 } else { //위 조건들이 모두 false인 경우 실행할 코드 }
		 */
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다.");
		} else if (num == 0) {
			System.out.println("0이다.");
		} else {
			System.out.println("음수다.");
		}
	}

	public void methodP() {
		// if ~else if가 없는 버전
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다.");
		} else {
			if (num == 0) {
				System.out.println("0이다.");
			} else {
				System.out.println("음수다.");

			}
		}

	}

	public void method4() {
		// 사용자가 입력한 나이를 가지고 어린이/창소년/성인/어르신 인지 출력
		// 어린이(13세 이하). 청소년 (13세 초과, 19세이하),
		// 성인 (19세 초과 60세 이하) , 어르신 (60세 초과)

		System.out.print("나이를 입력해주세요. : ");
		int num = sc.nextInt();

		if (num > 100) {
			System.out.println("나이를 제대로 입력해주세요.");
		} else if (num <= 13) {
			System.out.println("어린이입니다.");
		} else if (num <= 19) {
			System.out.println("청소년입니다.");
		} else if (num <= 60) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("어르신입니다.");
		}

	}
	
	public void method5( ) {
		//성별과 이름을 입력받아 , 이름과 성별을 풀력
		// 성별은 m/ㄹ로 입력받고 출력시에는 남자,여자로 출력
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별 : ");
		char ch = sc.next().charAt(0);
		
		/*String result; // 변수 선언만.
		if(ch == 'm' || ch == 'M') {
			result = "남자";
		} else if (ch == 'f' || ch == 'F') {
			result = "여자";
		} else {
			result = "중성";
		}*/
		
		String result = "여자"; // 변수 선언만.
		if(ch == 'm' || ch == 'M') {
			result = "남자";
		}
		
		//더욱 간단하게 사용가능
		
		
		System.out.println(name + "님은 " + result + "입니다.");
	}
	
	public void method6( ) {
		//사용자에게 이름을 입력받아 본인 이름과 이치하는지 비교하기.
		String name = sc.next();
		
		if(name == "권혁주") {
			System.out.println("권혁주님 반갑습니다.");
		}else {
			System.out.println("권혁주님이 아닙니다. 당신은 누구십니까.");
		}
		
		/*
		 * 기본 자료형 : boolean, char, byte, short, int, long, float, double
		 * 참조 자료형 : String
		 * 
		 * - 기본자료형간 비교시 ==, !=는 사용가능함.
		 * - 단, 참조 자료형은 동등비교시 정상적인 비교가 안된다.
		 * - 참조 자료형은 서로 값이 동일한지 비교할 때 .equals()를 이용한다.
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		if(name.equals("권혁주")){
			System.out.println("권혁주님 반갑습니다.");
		}else {
			System.out.println("권혁주님이 아닙니다. 당신은 누구십니까.");
		}
	}

}
