package com.kh.hw.employee.vlew;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {

	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {

		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");

			}

		}

	}

	public void insertEmp() {
		System.out.print("사원 번호 : ");
		int eno = sc.nextInt();

		System.out.print("사원 이름 : ");
		String ename = sc.next();

		System.out.print("사원 성별 : ");
		char gen = sc.next().charAt(0);

		System.out.print("전화 번호 : ");
		String ph = sc.next();
		while (true) {
			System.out.print("추가적인 정보를 더 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);

			if (ch == 'y' || ch == 'Y') {
				System.out.print("사원 부서 : ");
				String dno = sc.next();

				System.out.print("사원 연봉 : ");
				int sal = sc.nextInt();

				System.out.print("사원 보너스 율 : ");
				double comm = sc.nextDouble();

				ec.add(eno, ename, gen, ph, dno, sal, comm);
				return;

			} else if (ch == 'n' || ch == 'N') {
				ec.add(eno, ename, gen, ph);
				return;
			} else {
				System.out.println("다시 선택하세요");
			}
		}
	}

	public void updateEmp() {
		System.out.println("가장 최신의 사원정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요. : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.print("수정할 전화번호 : ");
			String ph = sc.next();

			ec.modify(ph);
			break;
		case 2:
			System.out.print("수정할 사원 연봉 : ");
			int sal = sc.nextInt();

			ec.modify(sal);
			break;
		case 3:
			System.out.print("수정할 보너스 율 : ");
			double comm = sc.nextDouble();

			ec.modify(comm);
			break;
		case 9:
			System.out.println("메뉴로 돌아갑니다.");
			return;

		}

	}

	public void deleteEmp() {
		
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'y' || ch == 'Y') {
			ec.remove();
		} else if (ch == 'n' || ch == 'N'){
			return;
		} else {
			System.out.println("다시 선택하세요");
		}

	}

	public void printEmp() {
		
		System.out.println(ec.inform());
	}

}
