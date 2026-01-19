package com.kh.practice.lambda;

import com.kh.practice.lnterfaceLambda.Calculator;

public class LambdaPractice2 {

	public static void main(String[] args) {
		Calculator<Integer> adder = (num1, num2) -> num1*num2;
		Calculator<Integer> findMax = (num1, num2) -> Math.max(num1, num2); //Math::max
		Calculator<String>  combiner = (str1, str2) -> str1 + "-" +str2;
		
		System.out.println(adder.operate(1, 2));
		System.out.println(findMax.operate(5, 4));
		System.out.println(combiner.operate("hello", "world"));
		
	}
	
	
	
	
	@FunctionalInterface
	interface  Calculation<V>{
	 V operate(V v1, V v2);
	}
}
