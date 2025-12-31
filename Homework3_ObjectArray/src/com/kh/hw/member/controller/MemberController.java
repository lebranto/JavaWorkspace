package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	
	public MemberController() {
			
	}
	
	
	public int existMemberNum() {
		int num = 10;
		for (int i = 0; i<m.length; i++) {
			num--;
		}
		
		return num;
	}
	
	public boolean checkId(String inputId) {
		
	}
	
	public void insertMember(String id, String name, String password
			, String email, String gender, int age) {
		
		
		
		m[num].setId(id);
		m[num].setEmail(email);
		m[num].setPassword(password);
		m[num].setName(name);
		m[num].setGender(gender);
		m[num].setAge(age);
		
		
	}
	
	public String searchId (String id) {
		
	}
	
	public Member[] searchName(String name) {
		
	}
	
	public Member[] searchEmail(String email) {
		
	}
	
	public boolean updatePassword(String id, String password) {
		
	}
	
	public boolean updateName(String id, String name) {
		
	}
	
	public boolean updateEmail(String id, String email) {
		
	}
	
	public boolean delete(String id) {
		
	}
	
	public void delete () {
		
	}

	public Member[] printAll() {
		
	}
	
	
}
