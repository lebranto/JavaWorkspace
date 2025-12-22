package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * switch문과 if문의 차이점 if(조건식) => 조건식을 복잡하게 기술 할 수 있음 switch 는 조건식이 없으며, 확실한 값의
	 * 변수만 기술한다
	 * 
	 * [표현법] switch(동등비교 수행 대상) { case 값1 :실행할 코드; break; case 값2 :실행할 코드; break;
	 * ...
	 * 
	 * default : 실행할 코드; }
	 * 
	 * switch문의 장점 - case를 통해 내가 실행하길 원하는 코드로 프리패스 하기 때문에 if~ else문 보다 "훨씬 빠르다".
	 * 
	 * switch문 -자주 사용되지는 않지만, 정밀한 연산결과가 동일한 속도로 수행되어야 하는 경우 사용한다.
	 * 
	 */

	Scanner sc = new Scanner(System.in);

	public void method1() {
		/*
		 * 1 ~ 3사이의 정수값을 입력받아 
		 * 1인 경우 빨간불 
		 * 2인 경우 파란불 
		 * 3인 경우 초록불 		 * 
		 * 모두 아닌경우 "잘못 입력했습니다"를 출력
		 */

		System.out.print(("1 ~ 3사이의 정수 입력 : "));
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("빨간불");
			break;
		case 2 :
			System.out.println("파란불");
			break;
		case 3 :
			System.out.println("초록불");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
		}
		
		/*if (num == 1) {
		System.out.println("빨간불");
		} else if (num == 2) {
		System.out.println("파란불");
		} else if (num == 3) {
		System.out.println("초록불");
		} else {
		System.out.println("잘못 입력했습니다.");
		}*/		
	
		
	}
	
	public void method2 ( ) {
		//사용자에게 구매할 과일명을 입력받아
		//각 과일마다의 가격을 출력
		// 사과(1000), 배(2000), 귤(5000)
		
		System.out.println("KH 과일가게");
		System.out.print("구매할 과일(사과, 배, 귤, 수박) : ");
		
		String fruit = sc.next();
		int price = 0;
		
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "배" :
			price = 2000;
			break;
		case "수박" : case "귤"  :
			price = 5000;
			break;
		}
		
		System.out.println(fruit +"의 가격은 " + price + "입니다.");
	}
	
	

}
