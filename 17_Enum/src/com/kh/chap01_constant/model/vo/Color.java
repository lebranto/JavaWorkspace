package com.kh.chap01_constant.model.vo;


// 자동차의 색깔에 대한 상수값을 객체형태로 관리하는 클래스.

public class Color {
	
	public static final Color BLACK = new Color(0, "black");
	public static final Color WHITE = new Color(1, "white");
	
	//고유 메서드를 만들고 싶다면 익명 클래스를 사용해 Color을 상속받아 자식메서드처럼 쓴다.
	public static final Color RED = new Color(2, "red") {
		public void method() {
			System.out.println("저는 red에만 존재하는 메서드 입니다.");
		}
		
	};
	
	
	
	
	private int color;
	private String strColor;
	
	public Color() {}
	
	
	// 외부에서 상수값을 함부로 생성할 수 없게 만든다.
	private Color(int color, String strColor) {
		this.color = color;
		this.strColor = strColor;
	}

	public int getColor() {
		return color;
	}

	public String getStrColor() {
		return strColor;
	}
	
	
	
	
	

}
