package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {

		int[] count = pc.personCount();

		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + count[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + count[1] + "명입니다.");

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
			}
		}
	}

	public void studentMenu() {

		while (true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			int count = pc.personCount()[0];
			if(count==3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 담을 수 없습니다.");
			}
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				if(count == 3) {
					System.out.println("다시 입력");
					continue;
				}
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
		while (true) {
			System.out.println("1. 직원 추가");
			System.out.println("2. 직원 보기");
			System.out.println("9. 메인으로");
			
			int count = pc.personCount()[1];//<><>
			if(count==10) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 담을 수 없습니다.");
			} //  <><>
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				if(count == 10) {//<><>
					System.out.println("다시 입력");
					continue;
				}//<><>
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

		Student[] a = new Student[3];

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
			
			int count = pc.personCount()[0];//<><>
			
			if (count !=3) {
				System.out.println("그만하시려면 N, 이어하시려면 아무키나 누르세요");
				char ch = sc.next().toUpperCase().charAt(0);

				if (ch == 'N') {
					return;
				}

			}else if (count ==3){
				System.out.println("더 입력할 수 없어 학생메뉴로 돌아갑니다.");
				break;
			}
		}

	}

	public void printStuden() {

		Student[] std = pc.printStudent();

		for (Student a : std)
			if (a != null) {
				System.out.println(a); // <> toString 이 아니라 a 를 사용한다.
			}
	}

	public void insertEmployee() {
		while (true) {
	
			Employee[] a = new Employee[10];
			
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
			
			int count = pc.personCount()[1];//<><>
			
			if (count !=10) {
				System.out.println("그만하시려면 N, 이어하시려면 아무키나 누르세요");
				char ch = sc.next().toUpperCase().charAt(0);
				
				if (ch == 'N') {
					return;
				}
				
			}else if (count ==10){
				System.out.println("더 입력할 수 없어 학생메뉴로 돌아갑니다.");
				break;
			}
		}

	}

	public void printEmployee() {
		Employee[] emp = pc.printEmployee();
		

		for (Employee a : emp)
			if (a != null) {
				System.out.println(a);
			}
	}

}
