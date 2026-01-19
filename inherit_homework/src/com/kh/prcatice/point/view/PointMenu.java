package com.kh.prcatice.point.view;

import java.util.Scanner;

import com.kh.prcatice.point.controller.CircleController;
import com.kh.prcatice.point.controller.RectangleController;

public class PointMenu {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();

	public PointMenu() {
	}

	public void mainMenu() {
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				;
				return;
			default:
				System.out.println("다시 입력해 주세요.\n");

			}

		}

	}

	public void circleMenu() {
		while (true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("다시 입력해 주세요.\n");
			}
		}
	}

	public void rectangleMenu() {
		while (true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				calperimeter();
				break;
			case 2:
				calRectArea();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("다시 입력해 주세요.\n");
			}
		}
	}

	public void calcCircum() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		System.out.println(cc.calcCircum(x, y, radius));

	}

	public void calcCircleArea() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		System.out.println(cc.calcArea(x, y, radius));

	}

	public void calperimeter() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int heigth = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();

		System.out.println(rc.calcPerimeter(x, y, heigth, width));
	}

	public void calRectArea() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int heigth = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();

		System.out.println(rc.calcArea(x, y, heigth, width));

	}

}
