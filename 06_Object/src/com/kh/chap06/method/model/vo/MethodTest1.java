package com.kh.chap06.method.model.vo;

public class MethodTest1 {
	
	/*
	 * [표현법]
	 * 접근제한자 [예약어] 자료형 메서드명([매개변수]){
	 * 수행할코드
	 * return 반환할 값; (생략가능)  
	 * }
	 * 
	 * 
	 * // 반환할 값과 자료형의 반환형은 똑같아야 한다.
	 * // void는 반환할 값이 따로 없을 때 쓴다.
	 * 
	 * 
	 * */
	
	
	//1. 매개변수가 없고, 반환할 값도 없는 메서드
	public void method1() {
		System.out.println("매개변수 x , 반환값 x");
		
		return;
		// void기 때문에 return의 값을 써도 되고 안써도 된다.
	}
	
	//2 .매개 변수x , 반환형 o
	public int method2 (){
		System.out.println("매개변수x, 반환값 o");
		int random = (int)(Math.random()*100 +1);
		
		return random;
	}
	
	//3. 매개변수x ,반환형o
	public void method3(int x , int y) {
		int min = 0;
		int max = 0;
		
		if (x>y) {
			min =y;
			max =x;
		} else {
			min =x;
			max =y;
		}
		
		System.out.println("최소값 : " + min + "최대값 : " +max);
	}
	
	
	//매개변수 o , 반환형 o
	
	public int multiply (int a ,int b) {
		int num = a*b;
		return num; 
		
		// 또는 return a*b 만 적어도 됨
		
		
		
	}
	
}
