package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public NumberController() {
		
	}

	public boolean checkDouble(int num1, int num2) throws NumRangeException{
	
		boolean a = false;
		
		if(1>num1 || num1>100 || 1>num2 || num2>100) {
		throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
			
		if(num1%num2 ==0) {
			a= true;
		}else {
			a=false;
		}
	
		
		return a; //num1 % num2 == 0 <- 논리 연산이기 때문에 받는값에 따라 true/false 가 나오게 된다.
	}

}