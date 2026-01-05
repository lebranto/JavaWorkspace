package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount() + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount() + "명입니다.");

			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				break;
			}
		}
	}

	public void studentMenu() {
		
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStuden();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				break;
			}
		}

	}

	public void employeeMenu() {
		while(true) {
			System.out.println("1. 직원 추가");
			System.out.println("2. 직원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				break;
			}
		}

	}

	public void insertStudent() {
		
		System.out.print("학생 이름 :");
		String name = sc.next();
		
		System.out.print("학생 나이 :");
		int age = sc.nextInt();
		
		System.out.print("학생 키 :");
		double height = sc.nextDouble();
		
		System.out.print("학생 몸무게 :");
		double weight = sc.nextDouble();
		
		System.out.print("학생 학년 :");
		int grade = sc.nextInt();
		
		System.out.print("학생 전공 :");
		String major = sc.next();
		
		pc.insertStudnt(name, age, height, weight, grade, major);

	}

	public void printStuden() {

	}

	public void insertEmployee() {
		
		System.out.print("사원 이름 :");
		String name = sc.next();
		
		System.out.print("사원 나이 :");
		int age = sc.nextInt();
		
		System.out.print("사원 키 :");
		double height = sc.nextDouble();
		
		System.out.print("사원 몸무게 :");
		double weight = sc.nextDouble();
		
		System.out.print("사원 급여 :");
		int salary = sc.nextInt();
		
		System.out.print("사원 부서 :");
		String dept = sc.next();

		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		
	}

	public void printEmployee() {

	}

}
