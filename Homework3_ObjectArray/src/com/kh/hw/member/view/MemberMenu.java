package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {

		int membernum = mc.existMemberNum();
		while (true) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			// mc.SIZE 로 호출해도 되지만
			// static field는 class명.메서드명을 쓰는게 낫다.
			// 생성시점의 차이 떄문
			System.out.println("현재 등록된 회원 수는 " + membernum + "명입니다.");

			if (membernum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}

			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				if (membernum != MemberController.SIZE) {
					insertMember();
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
				break;

			}
		}

	}

	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");

		System.out.print("아이디 : ");
		String id = sc.next();

		boolean isDup = mc.checkId(id);
		if (isDup) { // 중복인경우
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMember();
		}

		System.out.print("이름 :");
		String name = sc.next();

		System.out.print("비밀번호 : ");
		String pw = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		char gender = '\u0000';
		while (true) {
			System.out.print("성별(M/f) : ");
			gender = sc.next().toUpperCase().charAt(0);

			if (gender == 'M' || gender == 'F') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");

		}

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, pw, email, gender, age);

	}

	public void searchMember() {

		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
		}
	}

	public void searchId() {
		System.out.print("검색할 id : ");
		String id = sc.next();

		mc.searchId(id);
		String result = mc.searchId(id);

		if (result != null) {
			System.out.println("찾으신 회원 조회의 결과입니다");
			System.out.println(result);
		} else {
			System.out.println("검색 결과가 없습니다.");
		}

	}

	public void searchName() {

		System.out.print("검색할 이름 : ");
		String name = sc.next();

		mc.searchName(name);
		Member[] result = mc.searchName(name);

		if (result != null) {
			System.out.println("찾으신 회원 조회의 결과입니다");
			for (Member m : result) {
				System.out.println(m);
				// 주소값이 나오는게 아닌 자식 메서드를 먼저 실행하기 때문에
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}

	}

	public void searchEmail() {

	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			insertMember();
			break;
		case 2:
			searchMember();
			break;
		case 3:
			updateMember();
		}
	}

	public void updatePassword() {

		System.out.println("수정할 회원 id : ");
		String id = sc.next();

		System.out.println("수정할 회원 id : ");
		String password = sc.next();

		boolean result = mc.updatePassword(id, password);

		if (result = true) {
			System.out.println("비밀번호가 변경되었습니다.");
		}

	}

	public void updateName() {

	}

	public void updateEmail() {

	}

	public void deleteMember() {

		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			insertMember();
			break;
		case 2:
			searchMember();
			break;
		case 3:
			updateMember();
		}

	}

	public void deleteOne() {
		System.out.println("삭제할 회원 아이디 : ");
		String id = sc.next();

		System.out.println("정말 삭제하시겠습니까(y/n : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if (ch != 'Y') {
			System.out.println();
			return;
		}

		boolean result = mc.delete(id);
		if (result) {
			System.out.println("성공적으로 삭제");
		}
	}

	public void deleteAll() {

		System.out.println("정말 삭제하시겠습니까(y/n : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if (ch != 'Y') {
			System.out.println();
			return;
		}

	}

	public void printAll() {

		Member[] m = mc.printAll();
		int memberNum = mc.existMemberNum();

		if (memberNum == 0) {
			System.out.println("없다");
			return;
		}

		for (Member mem : m) {
			if (mem != null)
				System.out.println(mem);

		}
		mc.printAll();

	}

}
