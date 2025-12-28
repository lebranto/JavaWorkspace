package com.kh.prcatice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);

	public void upDown() {

		int num2 = (int) (Math.random() * 100 + 1);
		int count = 0;

		while (true) {
			System.out.print("1~ 100 사이의 임의의 난수를 맞춰 보세요 : ");
			int num1 = sc.nextInt();

			if (num1 > 100 || num1 < 1) {
				System.out.println("1~100 사이의 숫자를 입력해주세요");
				continue;
			}

			if (num1 > num2) {
				System.out.println("down !");
				count++;
			} else if (num1 < num2) {
				System.out.println("up !");
				count++;
			} else {
				System.out.println(count + "회만에 맞추셨습니다!");
				break;
			}

		}

	}

	public void rps() {

		int num = 0;
		int win = 0;
		int loose = 0;
		int draw = 0;
		int su = 0;
		
		while (true) {
			System.out.print("가위바위보 : ");
			String st = sc.next();			
			int num1 = (int) (Math.random() * 3 + 1);
			
			if(st.equals("exit")) {
				break;
			}
			
			if (!(st.equals("가위")  ||st.equals("바위") ||st.equals("보") )){
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
			
		
			
			
			switch (num1) {
			case 1 : 
				System.out.println("컴퓨터 : 가위");
				break;
			case 2 : 
				System.out.println("컴퓨터 : 바위");
				break;
			case 3 : 
				System.out.println("컴퓨터 : 보");
				break;
			}
			
			switch (st) {
			case "가위" :
				System.out.println("권혁주 : 가위");
				su =1;
				break;
			case "바위" :
				System.out.println("권혁주 : 바위");
				su =2;
				break;
			case "보" :
				System.out.println("권혁주 : 보");
				su =3;
				break;
			}
			
			if (su==1 && (num1==3) || su==2 && num1 == 1 || su==3 && num1 ==2) {
				System.out.println("이겼습니다 !");
				System.out.println();
				num++;
				win++;
				continue;
			} else if (su==1 && num1 == 2 || su ==2 && num1== 3 || su==3 &&num1 == 1 ) {
				System.out.println("졌습니다 ㅠㅠ");
				System.out.println();
				num++;
				loose++;
				continue;
			} else {
				System.out.println("비겼습니다.");
				System.out.println();
				num++;
				draw++;
				continue;
			} 
	
		}

		System.out.println(num + "전 " + win + "승 " + loose +"패 " + draw + "무");
		
	}

}
