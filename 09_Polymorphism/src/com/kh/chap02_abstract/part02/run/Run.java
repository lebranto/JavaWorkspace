package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		// 추상 클래스
		//  - 객체 생성불가. 단, 참조변수로는 사용가능
		
		//Person p = new Person();
		
		Person p1 = new Mother("악아",50,30,"출산");
		Person p2 = new Baby("어",3.5,50);
		
		System.out.println(p1); // 동적 바인딩
		System.out.println(p2);
		
		p1.eat();
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("다음날");
		
		System.out.println(p1); // 동적 바인딩
		System.out.println(p2);
		
		
		//인터 페이스
		
		//Basic b = new Basic(); 객체 생성 불가능
		
		Basic b1 = new Mother("어", 100,100,"출"); //참조변수 사용 가능
		Basic b2 = new Baby("어", 100,100);
		
		b1.eat(); // 동적 바인딩
		b2.eat(); 
		
		System.out.println(b1); //동적 바인딩
		System.out.println(b2);
		
	}

}
