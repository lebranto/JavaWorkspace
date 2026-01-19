package com.kh.prcatice.point.controller;

import com.kh.prcatice.point.model.vo.Circle;

public class CircleController {
	
	
	Circle c = new Circle();
	
	public String calcArea (int x , int y, int radius) {
		
		//c = new Circle(x,y,radius);  //필드 초기화
		
		 c.setX(x);
		 c.setY(y);
		 c.setRadius(radius);
		 
		return c.toString() +( Math.PI*radius * radius);  //=> c.toString은 c만 써도 상관없다.
	    												  //단 무조건은 아니니 상황을 잘 볼것
														  //참조 자료형을 문자열로 바꾸는 경우에 해당
	}
	public String calcCircum (int x , int y, int radius) {
		 c.setX(x);
		 c.setY(y);
		 c.setRadius(radius);
		
		return c.toString()+( Math.PI*radius * 2);
	   //return x + " " + y + " " + radius + " " +  ( Math.PI*radius * 2);
	}

}
