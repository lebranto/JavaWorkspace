package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				break;
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}

		}*/
		//내가 한거
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 1; i <=num ; i++ ) {
			System.out.print(i + " ");
		}
		
		if (num <1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice1();
		}
		

	}// 1

	public void practice2() {
		/*while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				break;
			} else {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
			}
			break;
		}*/
		//내가 한거
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = num ; i > 0 ; i-- ) {
			System.out.print(i + " ");
		}
		
		if (num <1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice2();
		}
		
		
	}// 2

	public void practice3() {
		/*System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);

			if (i == num) {
				break;
			}

			System.out.print(" + ");
		}
		System.out.println(" = " + sum);*/
		
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i + (num == i ? " = " : " + ") + sum);
		}
		
		
		
	}// 3

	public void practice4() {

		/*while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else if (num1 < num2) {
				for (int i = num1; i <= num2; i++)
					System.out.print(i + " ");
				break;
			} else if (num2 < num1) {
				for (int i = num2; i <= num1; i++)
					System.out.print(i + " ");
				break;
			} else {
				System.out.print(num1);
				break;
			}
		}*/
		// 내가 한거
		
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(!(num1 > 0 && num2 > 0)) {
			System.out.println("1 이상의 수를 입력해 주세요.");
			practice4();
			return; 
			// return 값이 없다면 기존 입력된 값도 출력된다.
		}
		
		//practice4();를 다시 실행한다고 해서 기존에 입력했던 값이 없어지는게 아니다.
		//main -> practice4 (입력 1,2) -> practice4 (입력 3, 4) -> 출력 1234
		
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for( int i = min ; i <=max ; i++) {
			System.out.print(i+ " ");
		}
	}// 4

	
	
	public void practice5() {

		/*while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9 || num < 1) {
				System.out.println("9 이하의 양수 값을 입력하세요");
			} else {
				for (int dan = num; dan <= 9; dan++) {
					System.out.println("=====" + dan + "단=====");
					for (int i = 1; i <= 9; i++) {
						System.out.println(dan + "X" + i + "= " + (dan * i));
					}
				}
				break;
			}
		}*/
		
		while(true) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num > 9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			continue;
			//break도 상관 없음
		}
		
		for(int dan= num; dan <=9 ; dan++) {
			System.out.println("==== " + dan + " ====");
			for (int i = 1 ; i<=9; i++) {
				System.out.println(dan + " X " +i + " = " + (dan*i));
				}
			}
			break;
		}
		
	}// 5

	public void practice6() {
		/*System.out.print("시작숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			int j = i * num2;
			System.out.print((num1 + j) + " ");
		}*/
		
		System.out.print("시작숫자 : ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		//10회 반복하라
		for(int i = 0; i< 10; i++) {
			num+= gong;
			System.out.println(num + " ");
			
			
		}

	}// 6

	public void practice7() {

		while (true) {
			System.out.print("연산자(+,-,*,/,%) : ");
			String str = sc.next();

			if ("exit".equals(str)) {
				System.out.println("연산자 프로그램을 종료합니다.");
				return;
			}

			char ch = str.charAt(0);// 'e'

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%')) {
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
			} else if (ch == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없는니다. 다시 입력해주세요.");
			} else {
				switch (ch) {
				case '+':
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					break;
				case '-':
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					break;
				case '*':
					System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
					break;
				case '/':
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					break;
				case '%':
					System.out.println(num1 + " + " + num2 + " = " + (num1 % num2));
					break;
				}
			}
			break;

		}

	}// 7

	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int line = 0; line < num; line++) {
			for (int star = 0; star < num; star++) {
				if (line >= star) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int line = num; line >=0 ; line--) {
			for (int star = 0; star < num; star++) {
				if (line >= star) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice10 ( ) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for (int i = 2 ; i<num ; i++) {
			if(num%i==0)
			System.out.print(i + " ");
		}			
		
	}
	
	public void practice11 ( ) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		
		for (int i = 2 ; i<num ; i++) {
			if(num % i==0) {
				System.out.print("소수가 아닙니다.");
				break;
				//이코드가 1회라도 수행된 경우 소수아님
			}
			System.out.println("소수 입니다.");	
			break;	
		}
	}
	
	public void practice12 ( ) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for (int i = 2 ; i<num ; i++) {
			if(num % i==0) {
				System.out.println("소수가 아닙니다.");
				break;
				//이코드가 1회라도 수행된 경우 소수아님
			}
		}
		System.out.println( num + " ");	
	}
	
	public void sosu () {
	    int num = 0;
		
		for(int i = 2 ; i<=20; i++){
			for (int j = (i-1) ; j<=2 ;j-- ) {
				if (!(i%j==0 && j!=1)) {
					num = i;
				}
				System.out.println(num);
			}
			
		}		
	}
	
}
