package com.kh.practice.snack.view;
// 상대방이 보는 화면 (입력하거나 출력되는 화면)은 대부분 여기
import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

// 입/출력 담당
public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("이름 : ");
		String kind =sc.next();
		
		System.out.print("종류 : ");
		String name =sc.next();
		
		System.out.print("맛 : ");
		String flavor =sc.next();
		
		System.out.print("갯수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price =sc.nextInt();
		
		System.out.println(scr.saveData(kind, kind, flavor, numOf, price)
				);
		//저장 기능 필요
		
		System.out.println("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'y' || ch == 'Y' ) {
			//상품정보 출력
			String result = scr.CofirmData();
			System.out.println(result);
		}
		
	}
	

}
