package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		/*
		 * if (num == 1) { System.out.println("입력 메뉴 입니다."); } else if (num == 2) {
		 * System.out.println("수정 메뉴 입니다."); } else if (num == 3) {
		 * System.out.println("조회 메뉴 입니다."); } else if (num == 4) {
		 * System.out.println("삭제 메뉴 입니다."); } else {
		 * System.out.println("프로그램이 종료됩니다."); }
		 */

		switch (num) {
		case 1:
			System.out.print("입력");
			break;
		case 2:
			System.out.print("수정");
			break;
		case 3:
			System.out.print("조회");
			break;
		case 4:
			System.out.print("삭제");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			return;
		// 메서드 내 어디서든 사용 가능
		// 현재 위치에서 메서드를 종료

		}
		System.out.println(" 메뉴입니다.");

	}

	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();

		if (num > 0 && num % 2 == 0) { // !(num>0) : 양수가 아닌 경우라는 뜻
			System.out.println("짝수다");
		} else if (num > 0 && num % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}

		/*
		 * 가드조건문
		 * 
		 * if(!(num >0)){ 
		 * 	System.out.println ("양수만 입력해주세요.") 
		 * 	retrun; 
		 * }
		 * 
		 * if (num % 2 ==1){ 
		 * 	System.out.println ("홀수다") 
		 * }else { 
		 * 	System.out.println ("짝수다")
		 * }
		 * 
		 */
		
		//중첩 의문문
		
		/*if(num >0) {
			if(num % 2 == 0 )
				System.out.println("짝수다");
			else
				System.out.println("홀수다");
		}
		else
			System.out.println("양수를 입력해주세요.");*/
	}

	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int mat = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int result = kor + mat + eng;
		double pyun = (kor + mat + eng) / 3;

		if (kor < 40 || mat < 40 || eng < 40) {
			System.out.println("불합격입니다.");
		} else if (pyun >= 60) {
			System.out.println("국어점수 : " + kor);
			System.out.println("수학점수 : " + mat);
			System.out.println("영어점수 : " + eng);
			System.out.println("합계 : " + result);
			System.out.println("평균 : " + pyun);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
					
	}

	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		// if else 문장이 동등 비교를 가지거나 범위가 적은 비교 연산자를 가지면
		// switch 문으로 바꿀 수 있다.

		String season;
		
		switch (num) {
		case 12:
		case 1:
		case 2:
		// case 1, 2 , 12 로도 사용 가능
			//System.out.println(num + "월은 겨울입니다.");
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			//System.out.println(num + "월은 봄입니다.");
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			//System.out.println(num + "월은 여름입니다.");
			season = "봄";
			break;
		case 9:
		case 10:
		case 11:
			//System.out.println(num + "월은 가을입니다.");
			season = "가을";
			break;
		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			return;
		}
		
		System.out.println(num +"월은 " + season + "입니다.");

	}

	public void practice5() {
		
		String realId ="gurwn";
		String realPw ="abcd1234";
				
		System.out.print("아이디 : ");
		String Id = sc.next();

		System.out.print("비밀번호 : ");
		String Pw = sc.next();
		
		
		
		if (!(Id.equals(realId))) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		
		if (!(Id.equals(realPw))) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		} 
			System.out.println("로그인 성공");	
	} 
		
		

		/*if (Id.equals(realId) && Pw.equals(realPw)) {
			System.out.println("로그인 성공");
		} else if (Id.equals("gurwn")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (Pw.equals("abcd1234")) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("둘다 맞지 않습니다.");
		}*/
	

	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String authority = sc.next();

		switch (authority) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("올바른 사용자를 입력하세요");
		}
	}

	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		String result;

		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}

		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
	}

	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char yun = sc.next().charAt(0);

		switch (yun) {
		case '+':
			System.out.println(num1 + '+' + num2 + '=' + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + '-' + num2 + '=' + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + '*' + num2 + '=' + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + '/' + num2 + '=' + (num1 / num2));
			break;
		case '%':
			System.out.println(num1 + '%' + num2 + '=' + (num1 / num2));
			break;
		}

	}

	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();

		System.out.print("과제 점수 : ");
		int test = sc.nextInt();

		System.out.print("출석 횟수 : ");
		int check = sc.nextInt();

		int midp = (int) (mid * 0.2);
		int finp = (int) (fin * 0.3);
		int testp = (int) (test * 0.3);
		int checkp = (int) (check * 0.2);

		int result = midp + finp + testp + checkp;

		System.out.println("======결과======");
		System.out.println("중간 고사 점수(20) : " + midp);
		System.out.println("기말 고사 점수(30) : " + finp);
		System.out.println("과제 점수    (30) : " + testp);
		System.out.println("출석 점수    (20) : " + checkp);
		System.out.println("총점 : " + result);

		if (result < 70 && check < check * 0.7) {
			System.out.println("Fail");
		} else if (result < 70) {
			System.out.println("Fail [점수 부족 " + (70 - result) + "]");
		} else if (check < check * 0.7) {
			System.out.println("Fail [출석 횟수 부족 " + check * 0.7 + "/20]");
		}
	}

	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1.메뉴 출력");
		System.out.println("2.짝수/홀수");
		System.out.println("3.합격/불합격");
		System.out.println("4.계절");
		System.out.println("5.로그인");
		System.out.println("6.권한 확인");
		System.out.println("7.BMI");
		System.out.println("8.계산기");
		System.out.println("9.P/F");
		System.out.println("선택 : ");
		int num = sc.nextInt();


		switch (num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
	}
	
	public void practice11() {
		System.out.println("비밀번호 입력(1000~9999) : ");
		int num =sc.nextInt();
		
		if (num>=10000 && num<=999) {
			System.out.println("자리수가 맞지 않습니다.");
			}
	}//모르겠다
	
}
