package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {

	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();

	public void mainMenu() {
		System.out.println("============ KH 마트 =============");

		while (true) {
			System.out.println("1. 직원메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}

	}

	public void adminMenu() {

		while (true) {
			System.out.println("******* 직원 메뉴 ********");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printBuyFarm();
				break;
			case 9:
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}

	}

	public void customerMenu() {
		
		while (true) {
			System.out.println("******* 직원 메뉴 ********");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}


	}

	public void addNewKind() {
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("추가할 종류 번호 : ");
		int num = sc.nextInt();
		
		if(!(num == 1 || num ==2 || num ==3)) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			addNewKind();
			return;
		}
		
		String [] kind = {"과일", "채소" , "견과"};
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("수량: ");
		int amount = sc.nextInt();
		
		Farm f =new Farm();
		
		switch(num) {
		case 1 :
			f = new Fruit(kind[0],name);
			break;
		case 2 :
			f = new Vegetable(kind[1], name);
			break;
		case 3 :
			f = new Nut(kind[2], name);
		}
		
		if(fc.addNewKind(f, amount)) {
			System.out.println("새 농산물이 추가되었습니다");
		} else {
			System.out.println("새 농산물 추가에 실패하였습니다");
		}
	

	}

	public void removeKind() {
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("삭제할 종류 번호 : ");
		int num = sc.nextInt();
		
		if(!(num == 1 || num ==2 || num ==3)) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			addNewKind();
			return;
		}
		
		String [] kind = {"과일", "채소" , "견과"};
		
		System.out.print("이름 : ");
		String name = sc.next();
		
Farm f =new Farm();
		
		switch(num) {
		case 1 :
			f = new Fruit(kind[0],name);
			break;
		case 2 :
			f = new Vegetable(kind[1], name);
			break;
		case 3 :
			f = new Nut(kind[2], name);
		}
		
		if(fc.removeFarm(f)) {
			System.out.println("새 농산물이 추가되었습니다");
		} else {
			System.out.println("새 농산물 추가에 실패하였습니다");
		}
		

	}

	public void changeAmount() {

	}

	public void printFarm() {

	}

	public void buyFarm() {

	}

	public void removeFarm() {

	}

	public void printBuyFarm() {

	}

}
