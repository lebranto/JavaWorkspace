package com.kh.prcatice.point.controller;

import com.kh.prcatice.point.model.vo.Rectangle;

public class RectangleController {
	
	Rectangle r = new Rectangle();
	
	public String calcArea (int x , int y, int heigth, int width) {
		
		//값을 초기화 시켜주지 않으면 0으로 출력된다.
		 r.setX(x);
		 r.setY(y);
		 r.setHeigth(heigth);
		 r.setWidth(width);
		
		return r.toString()+ (heigth * width);
	}
	
	public String calcPerimeter (int x , int y, int heigth, int width) {
		
		 r.setX(x);
		 r.setY(y);
		 r.setHeigth(heigth);
		 r.setWidth(width);
		
	 return r.toString() + (heigth * width*2);
	}
	
	

}
