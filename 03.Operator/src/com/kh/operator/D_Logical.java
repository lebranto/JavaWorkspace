package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	
	/*
	 * 논리 연산자
	 *  -논리 값 두개를 비교하는 연산자
	 * 
	 * and && : a&&b -> a와 b가 모두 참일 경우 true 반환.
	 * 					a와 b 둘 중 하나라도 거짓일 경우 false 반환
	 * 
	 * and || : a||b -> a와 b 둘 중 하나라도 참일 경우 true 반환.
	 *                  a와 b 둘 다 거짓인 경우 false로 반환. 
	 * 
	 * 
	 * ~하면서 => AND
	 * 또는 => OR
	 * 			
	 */
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void method1 ( ) {
		
		System.out.println("숫자를 하나 입력하세요.");
		int num = sc.nextInt();
		
		//num의 값이 0보다 크면서 짝수 입니까?
		boolean result = (num > 0) && (num%2 == 0);
		
		
	}
	public void method2( ) {
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		//num의 값이 1 이상 100 이하의 숫자인지 확인
		boolean result = (num >=1) && (num <=100);
	}
	
	public void method3( ) {
		
		System.out.println("Y를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		
		//사용자가 입력한 값이 'y'거나 'Y'인 경우 참, 아니면 거짓을 반환하시오
		boolean result = (ch == 'y') || (ch == 'Y') ;
	}
	
	public void method4( ) {
		int num1 = 10;
		
		//and 연산자의 경우 A && B의 조건중 A의 값이 false인 경우
		// 뒤쪽 조건들은 무조건 false기 때문에 B는 실행되지 않는다.
		// -> 숏컷 익스프레션
		
		boolean result = (num1<5) && (num1++>0);
		System.out.println("result1 : " + result); 
		System.out.println(num1); //10
		
		
		int num2 = 10;
		boolean result2 = num2 < 20 ||  ++num2 > 0;
		System.out.println(num2);
		
	}
	
	
	
		
}


