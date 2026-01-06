package com.kh.prcatice.point.model.vo;

public class Circle extends Point {

	private int radius;
	
	public Circle () {}

	public Circle(int x, int y ,int radius) {
		Point p = new Point();
		
		p.setX(x);
		p.setY(y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() {
		
		return super.toString()+ ", "+ radius+ " / ";
		
	} 
	
}
