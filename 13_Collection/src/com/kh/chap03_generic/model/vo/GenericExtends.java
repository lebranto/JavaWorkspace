package com.kh.chap03_generic.model.vo;

public class GenericExtends <T extends Parent> {

	private T type;
	
	
	public void printing () {
		
		// doPrint() 메서드를 가지고 있는 Parent 계열 클래스로 T의 범위를 제한하고 싶다면
		// extends를 사용
		
		type.doPrint();
		
		// extends 가 없으면 (Parent)type.doPrint 처럼 다운 캐스팅을 해야함
	}


	public T getType() {
		return type;
	}


	public void setType(T type) {
		this.type = type;
	}
	
	
}
