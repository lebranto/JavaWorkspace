package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker;
	
	
	SmartPhone() {}
	
	
	public abstract String printInformation(); //추상 메서드


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}
	

}
