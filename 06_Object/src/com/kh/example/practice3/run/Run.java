package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle ci = new Circle();
		ci.getAreaOfCircle(); // 원둘레 출력
		ci.getSizeOfCircle(); // 원 넓이 출력
		
		ci.incrementRadius(); // 반지름 1증가
		
		ci.getAreaOfCircle(); // 원둘레 출력
		ci.getSizeOfCircle(); // 원 넓이 출력
		
	}
}
