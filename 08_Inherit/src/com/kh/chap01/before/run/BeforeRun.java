package com.kh.chap01.before.run;

import com.kh.chap01.before.model.vo.Desktop;
import com.kh.chap01.before.model.vo.Smartphone;

public class BeforeRun {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼", "d-01","데탑",20000,true);
		Smartphone s = new Smartphone();
		
		System.out.println(d.information());
		System.out.println(s);
		
		/*
		 * 
		 * 매 클래스마다 중복된 코드들을 일일히 기술해두게 되면
		 * 수정과 유지보수에서 번거로움이 발생됨
		 * 
		 * 상속이라는 개념을 적용시켜서,
		 * 매 클래스에 존재하는 중복된 필드 및 메서드를 하나의 클래스에 정의해두고, 이 클래스를
		 * 상속시켜주는 방식으로 작업한다.
		 * 
		 * 
		 */
	}

}
