package com.kh.chap01_math.run;

//import java.lang.Math;
//안써도 되는 이유는 java.lang 패키지는 보이지 않지만 항상 import 되어 있기 때문

public class MathRun {
	public static void main(String[] args) {
	// Math 클래스의 유용한 메스드들	
	// 파이 (PI)
	System.out.println("파이 : " + Math.PI);
	
	// 올림처리 메서드
	// 올림 => Math.ceil(double) => double 값으로 반환
	double num1 = 4.349;
	System.out.println("올림 : " + Math.ceil(num1));
	
	//4.4 로 올림처리 하려면
	System.out.println("올림 : " + Math.ceil(num1*10)/10);
	
	// 반올림 => Math.round(double); => long 값으로 반환
	System.out.println("반올림 : " + Math.round(num1));
	
	// 버림 => Math.floor(double); => double 값으로 반환
	System.out.println("버림 : " + Math.floor(num1));
	
	
	//절대값 => 음수도 양수, 양수는 양수로 만드는 메서드
	//Math.abs(int/double/long/float) => 내가 지정한 값에 따라 반환형이 달라짐
	int num2 = -10;
	System.out.println("절대값 : " + Math.abs(num2));
	
	//최소값
	//Math.min(int, int)  -> double long float 도 됨 
	System.out.println("최소값 : " + Math.min(5, 10));
	
	//최대값
	//Math.max(int, int) -> double long float 도 됨 
	System.out.println("최대값 : " + Math.max(5, 10));
	
	//제곱근(루트)
	//Math.sqrt(double) : double
	System.out.println("4의 제곱근 : " + Math.sqrt(4.0));
	
	//제곱
	//Math.pow(double, double) : double 
	
	System.out.println("2의 10승 : " + Math.pow(2, 10));
	}

}
