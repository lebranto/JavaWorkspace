package com.kh.practice.file.view;

import java.io.FileOutputStream;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {

		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();

		while (true) {
			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

			}
		}

	}

	public void fileSave() {

		StringBuilder b = new StringBuilder();
		FileOutputStream outPut = null;

		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.next();

			if (str.equals("ex끝it")) {
				break;
			} else {
				b.append(str);
			}
		}
		while (true) {
			System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt): ");
			String fileName = sc.nextLine();
			boolean a = fc.checkName(fileName);

			if (a == true) {
				System.out.println("이미 존재하는 파일입니다. 덮어 쓰시겠습니까(Y/N) : ");
				char ch = sc.next().toUpperCase().charAt(0);

				switch (ch) {
				case 'N':
					System.out.println("저장할 파일명을 다시 입력해주세요 ~");
					break;
				case 'Y':
					fc.fileSave(fileName, b);
					return;
				default : 
					System.out.println("다시 입력해 주세요.");
				}

			}

		}
	}

	public void fileOpen() {
		System.out.println("열 파일 명 : ");
		String fileName = sc.nextLine();

	}

	public void fileEdit() {

	}

}
