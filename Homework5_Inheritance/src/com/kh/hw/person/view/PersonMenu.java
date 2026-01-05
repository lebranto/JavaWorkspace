package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {

	
		
		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");

			
			
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
		
		Student [] a = new Student [3];
		
		while (true) {
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
			
			
			if (a[2] ==null) {
				System.out.println("그만하시려면 N, 이어하시려면 아무키나 누르세요");
				char ch = sc.next().toUpperCase().charAt(0);
				
				if(ch != 'N') {
					return;
				}
			}
			
		}

	}

	public void printStuden() {
		
		System.out.println(pc.printStudent());

	}

	public void insertEmployee() {
		
		Employee [] a = new Employee [10];
		
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
		
		
		if (a[10] ==null) {
			System.out.println("그만하시려면 N, 이어하시려면 아무키나 누르세요");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch != 'N') {
				return;
			}
		}else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 학생 메뉴로 돌아갑니다.");
		}
		
	}

		
		
	}

	public void printEmployee() {
		System.out.println(pc.printStudent());
	}

}
