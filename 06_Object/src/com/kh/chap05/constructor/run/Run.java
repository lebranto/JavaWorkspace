package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		//기본 생성자로 객체 생성
		User ul = new User();
		
		User u2 = new User("user01");
		
		//기본 생성자과 매개변수 생성자 차이
		// 값이 있냐 없냐고 자바는 구분한다.
		
		User u3 = new User("user03",30,'M');
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getAge());
		System.out.println(u3.getGender());
		
		
	}

}
