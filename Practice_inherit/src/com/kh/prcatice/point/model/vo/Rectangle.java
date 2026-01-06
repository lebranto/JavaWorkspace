package com.kh.prcatice.point.model.vo;

public class Rectangle extends Point {
	private int width;
	private int heigth;
	
	
	public Rectangle() {}


	public Rectangle(int x , int y , int width, int heigth) {
		Point p = new Point();
		
		p.setX(x);
		p.setY(y);
		this.width = width;
		this.heigth = heigth;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeigth() {
		return heigth;
	}


	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	@Override
	public String toString () {
		
		 return super.toString()+ ", " + heigth + ", " + width + " / ";
	} 

	

}
