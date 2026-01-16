package com.kh.chap01_lambda.model.functional;


/*
 * 함수형 인터페이스로 사용될 인터페이스는 
 * 내부적으로 반드시 1개의 추상 메서드만 존재해야 한다.
 */

@FunctionalInterface
public interface LambdaTest1 {
	
	
	/*public*/ int add(int x, int y);
	
	//void print(); 함수형 인터페이스에서는 메서드가 2개 있을 수 없다.

}
