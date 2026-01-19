package com.kh.practice.lambda;

import java.util.function.BiFunction;

public class LambdaPractice5 {
		
	
	
	public static BiFunction<Integer, Integer, Integer> getOperator(String str){
		
		BiFunction<Integer, Integer, Integer> bi = null;
		
		switch(str) {
		case "+" ->  bi= (a,b) -> a+b;
		case "-" ->  bi= (a,b) -> a-b;
		case "*" ->  bi= (a,b) -> a*b;
		case "/" ->  bi= (a,b) -> a/b;
		case "%" ->  bi= (a,b) -> a%b;
		default ->
		 throw new RuntimeException("존재하지 않는 연산자 입니다.");
		}
		
		return bi;
	} 

}
