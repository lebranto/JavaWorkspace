package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	Member[] m = new Member[SIZE];
	public static final int SIZE = 10;


	public MemberController() {
		
		for (int i = 0 ; i < m.length ; i++) {
			m[i] = new Member();
		}
	
	}

	public int existMemberNum() {

		return 0;
	}

	public boolean checkId(String inputId) {

		boolean check = false;
		for (int i = 0; i < m.length; i++) {
				if (inputId.equals(m[i].getId())) {
					check = true;
					break;
				}
		}
		
		if (check = true) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		
		return check = true;

	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {



		
	}

	public String searchId(String id) {

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

	public void delete() {

		for (int i = 0; i < m.length; i++) {
			m[i].setId(null);
			m[i].setName(null);
			m[i].setPassword(null);
			m[i].setEmail(null);
			m[i].setGender(' ');
			m[i].setAge(0);
		}

	}

	public Member[] printAll() {

		
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				System.out.println(m[i].inform());
			} else {
				System.out.print(" ");
			}

		}
		System.out.println();
		
		return m;
	}

}
