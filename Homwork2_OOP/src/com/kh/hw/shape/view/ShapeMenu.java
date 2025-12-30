package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquarController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquarController scr = new SquarController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");

		while (true) {
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();

			if (num != 3 && num != 4 && num != 9) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
				continue;
			}

			if (num == 9) {
				System.out.println("프로그램 종료");
				return;
			}

			if (num == 3) {
				triangleMenu();
			} else if (num == 4) {
				squareMenu();
			}
		}

	}

	public void triangleMenu() {
		while (true) {
		System.out.println("==== 삼각형 ====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");

			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();

			if (num != 1 && num != 2 && num != 3 && num != 9) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
				continue;
			}

			if (num == 9) {
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				return;
			} else if (num == 1) {
				inputSize(3, 1);
			} else if (num == 2) {
				inputSize(3, 2);

			}
		}

	}

	public void squareMenu() {
		while (true) {
			System.out.println("==== 사각형 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");

			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();

			if (num != 1 && num != 2 && num != 3 && num != 4 && num != 9) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
				continue;
			}

			if (num == 9) {
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				
			} else if (num == 1) {
				inputSize(4, 1);
				
			} else if (num == 2) {
				inputSize(4, 2);
			
			} else if (num == 3){
				inputSize(4, 3);
			} else {
				inputSize(4, 4);
			} 
				
		}

	}

	public void inputSize(int type, int menuNum) {
		if (type == 3) {
			if (menuNum == 1) {
				System.out.print("높이 : ");
				int num1 = sc.nextInt();
				System.out.print("너비 : ");
				int num2 = sc.nextInt();

				System.out.println();
				System.out.println("삼각형 면적 : " + tc.calcArea(num1, num2));
			} else if (menuNum == 2) {
				System.out.println("색깔을 입력하세요 : ");
				String col = sc.next();

				tc.paintColor(col);
			} else if (menuNum ==3) {
				printInfomation(3);
			}
			
			
		} else if (type == 4) {
			if (menuNum == 1 || menuNum == 2) {
				System.out.print("높이 : ");
				int num1 = sc.nextInt();
				System.out.print("너비 : ");
				int num2 = sc.nextInt();
				System.out.println();

				if (menuNum == 1) {
					System.out.println("사각형 둘레 : " + scr.calcPerimeter(num1, num2));
					System.out.println();
				} else if (menuNum == 2) {
					System.out.println("사각형 면적 : " + scr.calcArea(num1, num2));
					System.out.println();
				} 
			} else if (menuNum == 3) {
				System.out.println("색깔을 입력하세요 : ");
				String col = sc.next();

				scr.paintColor(col);
				
			}else if (menuNum == 4){
				printInfomation(4);
			}
			

		}

	}

	public void printInfomation(int type) {
		if (type == 3) {
			System.out.println(tc.print());			
		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}

}
