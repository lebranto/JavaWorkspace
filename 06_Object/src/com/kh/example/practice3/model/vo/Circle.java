package com.kh.example.practice3.model.vo;

public class Circle {

	private static final double PI = 3.14;
	private static int radius = 1;

	// 기본 생성자
	public Circle() {
	};
	
	
	public void incrementRadius() {
		radius += 1;
		
	}

	public void getAreaOfCircle() {
		// 원둘레
		System.out.println(2 * PI * radius);

	}

	public void getSizeOfCircle() {
		System.out.println(PI * radius * radius);	
	}

}
