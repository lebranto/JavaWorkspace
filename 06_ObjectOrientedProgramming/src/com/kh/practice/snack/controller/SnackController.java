package com.kh.practice.snack.controller;

//기능 담당(정보 저장 같은 기능)

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();

	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor,
			int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장완료";
		
	}
	
	public String CofirmData(){
		return s.information();	
	}

}
