package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {
	
	public GalaxyNote9(String maker) {
		setMaker(maker);
		
	}
	
	
	public String makeCall() {
		
		return "번호를 누르고 통화버튼을 누름\n";
	}
	
	public String takeCall() {
		
		return "전화 받기 버튼을 누름\n";
		
	}
	
	public String picture() {
		
		return "1300만 듀얼카메라\n";
		
		
	}
	
	public String charge() {
		
		return "고속충전, 고속 무선 충전\n";
		
	}
	
	public String touch() {
		return "정전식, 와콤펜 지원\n";
		
	}
	
	public boolean bluetoothPen() {
		
		return true;
		
	}
	@Override
	public String printInformation() {
		
	 return "갤럭시 노트9은 " + getMaker() + "에서 만들어졌고 제원은 다음과 같다." + makeCall()+
			takeCall() + picture() + charge() + touch() +"블루투스 펜 탑재 여부 : " +  bluetoothPen();
			
		
		
	}

}
