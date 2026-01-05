package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	Member[] m = new Member[SIZE]; // { null, null , ...
									// new member()객체를 넣는다.

	public static final int SIZE = 10;

	public MemberController() {

	}

	public int existMemberNum() {

		int count = 0;
		for (Member mem : m) {
			// 객체가 초기화 된 경우
			if (mem != null) {
				count++;
			}
		}

		return count;
	}

	public boolean checkId(String inputId) {

		boolean check = false;
		/*
		 * for (int i = 0; i < m.length; i++) { if (inputId.equals(m[i].getId())) {
		 * check = true; break; } } -> 이렇게 하면 null 값도 검색 해버리기 때문에 null 에러가 난다.
		 */

		for (Member mem : m) {
			// 객체배열에 저장된 Member 객체의 id 값과 사용자가 입력한 id값을 비교
			if (mem != null && inputId.equals(mem.getId())) {
				// mem이 null 이 아니라는 조건은 꼭 넣어주자!!
				check = true;
				break;
			}
		}

		return check;

	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {

	// 전달받은 데이터로 객체 생성
	Member mem = new Member(id, name, password, email, gender, age);

	// 생성한 객체를 객체배열상 비어있는 부분(null 값인)에 저장
	for(int i = 0; i<m.length ; i++){
		if(m[i] == null) {
			m[i] = mem;
			break;
		}
		//향상된 for 문은 객체 배열을 초기화 할 때 사용하려고 하면 에러가 난다.
	}
	
	}

	public String searchId(String id) {

		// Member 객체 배열에서 id와 일치하는 회원의 정보를 찾은 후, 회원의 정보를 반환
		for (Member mem : m) {
			if (mem != null && mem.getId().equals(id)) {
				return mem.toString(); // 회원 정보 반환
			}
		}
		return null;

	}

	public Member[] searchName(String name) {
		Member[] m = new Member[SIZE];

		int index = 0;
		for (Member mem : this.m) {
			if (mem != null && mem.getName().equals(name)) {
				m[index++] = mem;
			}
		}
		if (index == 0) {
			return null;
		} else {
			Member[] copy = Arrays.copyOf(m, index); // 선택사항
		}
		return null;
	}


	public Member[] searchEmail(String email) {

		return m;
	}

	public boolean updatePassword(String id, String password) {
		
		for(int i = 0 ; i<m.length; i++) {
			Member mem = m[i];
			if (mem != null && mem.getId().equals(id)) {
				mem.setPassword(password); // 비밀번호 변경
				return true;
			}
		}

		return true;

	}

	public boolean updateName(String id, String name) {
		return true;
	}

	public boolean updateEmail(String id, String email) {
		return true;
	}

	public boolean delete(String id) {
		
		
		for(int i = 0; i<m.length ; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}

	public void delete() {

		// 전체 회원 삭제
		
		m = new Member[SIZE];
		

	}

	public Member[] printAll() {
		
		Member[] m = mc.printAll();

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
