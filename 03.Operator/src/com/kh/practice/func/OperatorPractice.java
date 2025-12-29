package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("인원 수 : ");
		int people = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println();

		System.out.println("1인당 사탕개수 : " + (candy / people));
		System.out.println("남는 사탕 개수 : " + (candy % people));

	}

	public void practice2() {
		System.out.print("이름 : ");
		String a = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int b = sc.nextInt();

		System.out.print("반(숫자만): ");
		int c = sc.nextInt();

		System.out.print("번호(숫자만): ");
		int d = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char e = sc.next().charAt(0);

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double f = sc.nextDouble();

		System.out.println(b + "학년" + c + "반 " + d + "번 " + a + " " + (e == 'M' || e == 'm' ? '남' : '여') + "학생님의 성적은 "
				+ f + "이다.");

	}

	public void practice3() {

		System.out.print("나이 : ");
		int a = sc.nextInt();

		System.out.println(a <= 13 ? "어린이" : (a <= 19 ? "청소년" : "성인"));
		// a>13 && a<=19 라고 쓰지 않아도 되는 이유는 13은 이미 앞에서 걸러져서 a<= 19만 확인하기 때문.

	}

	public void practice4() {

		System.out.print("국어 : ");
		double a = sc.nextDouble();

		System.out.print("영어 : ");
		double b = sc.nextDouble();

		System.out.print("수학 : ");
		double c = sc.nextDouble();

		int d = (int) (a + b + c);
		double e = d / 3.0;
		boolean f = a >= 40 && b >= 40 && c >= 40 && e >= 60;

		System.out.println("합계 : " + d);
		System.out.println("평균 : " + e);
		System.out.println(f ? "합격" : "불합격");

	}

	public void practice5() {
		System.out.print("주민번호를 입력하세요 : ");
		String a = sc.nextLine();
		char b = a.charAt(7);

		System.out.println(b == '1' || b == '3' ? "남자" : "여자");

	}

	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int a = sc.nextInt();

		System.out.println(num1 >= a && num2 < a || num1 < num2 ? "true" : "false");

	}

	public void practice7() {
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		System.out.println(num1 == num2 && num2 == num3 ? "true" : "false");

	}

	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();

		double ap = a * 1.4;

		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();

		double bp = b;

		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();

		double cp = a * 1.15;

		System.out.println("A사원 연봉/연봉+인센 : " + (a + "/" + ap));
		System.out.println(ap < 3000 ? "3000미만" : "3000이상");

		System.out.println("B사원 연봉/연봉+인센 : " + (b + "/" + bp));
		System.out.println(bp < 3000 ? "3000미만" : "3000이상");

		System.out.println("C사원 연봉/연봉+인센 : " + (c + "/" + cp));
		System.out.println(cp < 3000 ? "3000미만" : "3000이상");

	}

	public void practice9() {
		int cnum1 = (int) (Math.random() * 9 + 1);
		int cnum2 = (int) (Math.random() * 9 + 1);
		int cnum3 = (int) (Math.random() * 9 + 1);
		int cnum4 = (int) (Math.random() * 9 + 1);

		System.out.println("숫자가 생성되었습니다.");
		while (true) {

			int st = 0;
			int ball = 0;
			int out = 0;

			System.out.print("4자리 숫자를 입력해 주세요. : ");

			int pnum = sc.nextInt();
			int pnum1 = pnum / 1000;
			int pnum2 = pnum / 100 % 10;
			int pnum3 = pnum / 10 % 10;
			int pnum4 = pnum % 10;

			System.out.print(pnum1);
			System.out.print(pnum2);
			System.out.print(pnum3);
			System.out.print(pnum4);

			if (pnum1 == cnum1 && pnum2 == cnum2 && pnum3 == cnum3 && pnum4 == cnum4) {
				System.out.println("\n맞추셨습니다!");
				break;
			}
			
			if (pnum1 == cnum1)
				++st;
			if (pnum2 == cnum2)
				++st;
			if (pnum3 == cnum3)
				++st;
			if (pnum4 == cnum4)
				++st;

			if (pnum1 == cnum2)
				++ball;
			if (pnum1 == cnum3)
				++ball;
			if (pnum1 == cnum4)
				++ball;
			if (pnum2 == cnum3)
				++ball;
			if (pnum2 == cnum4)
				++ball;
			if (pnum3 == cnum4)
				++ball;

			if (st == 0 && ball == 0) {
				out = 4;
			} else if (st == 1 && ball == 0 || st == 0 && ball == 1) {
				out = 3;
			} else if (st == 2 && ball == 0 || st == 0 && ball == 2 || st == 1 && ball == 1 || st == 1 && ball == 1) {
				out = 2;
			} else if (st == 3 && ball == 0 || st == 0 && ball == 3 || st == 2 && ball == 1 || st == 1 && ball == 2) {
				out = 1;
			} else {
				out = 0;
			}

			System.out.println("\nst : " + st);
			System.out.println("ball : " + ball);
			System.out.println("out : " + out);

			System.out.println();

		}
		System.out.print(cnum1);
		System.out.print(cnum2);
		System.out.print(cnum3);
		System.out.print(cnum4);

	}
}
