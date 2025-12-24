package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*
		 * while (true) { System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt();
		 * 
		 * if (num < 1) { System.out.println("1 이상의 숫자를 입력해주세요"); break; } else { for
		 * (int i = 1; i <= num; i++) { System.out.print(i + " "); } break; }
		 * 
		 * }
		 */
		// 내가 한거

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice1();
		}

	}// 1

	public void practice2() {
		/*
		 * while (true) { System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt();
		 * 
		 * if (num < 1) { System.out.println("1 이상의 숫자를 입력해주세요"); break; } else { for
		 * (int i = num; i > 0; i--) { System.out.print(i + " "); } } break; }
		 */
		// 내가 한거

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice2();
		}

	}// 2

	public void practice3() {
		/*
		 * System.out.print("정수를 입력하세요 : "); int num = sc.nextInt();
		 * 
		 * int sum = 0;
		 * 
		 * for (int i = 1; i <= num; i++) { sum += i; System.out.print(i);
		 * 
		 * if (i == num) { break; }
		 * 
		 * System.out.print(" + "); } System.out.println(" = " + sum);
		 */

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i + (num == i ? " = " : " + ") + sum);
		}

	}// 3

	public void practice4() {

		/*
		 * while (true) { System.out.print("첫 번째 숫자 : "); int num1 = sc.nextInt();
		 * 
		 * System.out.print("두 번째 숫자 : "); int num2 = sc.nextInt();
		 * 
		 * if (num1 < 1 || num2 < 1) { System.out.println("1 이상의 숫자를 입력해주세요."); } else
		 * if (num1 < num2) { for (int i = num1; i <= num2; i++) System.out.print(i +
		 * " "); break; } else if (num2 < num1) { for (int i = num2; i <= num1; i++)
		 * System.out.print(i + " "); break; } else { System.out.print(num1); break; } }
		 */
		// 내가 한거

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (!(num1 > 0 && num2 > 0)) {
			System.out.println("1 이상의 수를 입력해 주세요.");
			practice4();
			return;
			// return 값이 없다면 기존 입력된 값도 출력된다.
		}

		// practice4();를 다시 실행한다고 해서 기존에 입력했던 값이 없어지는게 아니다.
		// main -> practice4 (입력 1,2) -> practice4 (입력 3, 4) -> 출력 1234

		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;

		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}// 4

	public void practice5() {

		/*
		 * while (true) { System.out.print("숫자 : "); int num = sc.nextInt();
		 * 
		 * if (num > 9 || num < 1) { System.out.println("9 이하의 양수 값을 입력하세요"); } else {
		 * for (int dan = num; dan <= 9; dan++) { System.out.println("=====" + dan +
		 * "단====="); for (int i = 1; i <= 9; i++) { System.out.println(dan + "X" + i +
		 * "= " + (dan * i)); } } break; } }
		 */

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9) {
				System.out.println("9이하의 숫자만 입력해주세요.");
				continue;
				// break도 상관 없음
			}

			for (int dan = num; dan <= 9; dan++) {
				System.out.println("==== " + dan + " ====");
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan + " X " + i + " = " + (dan * i));
				}
			}
			break;
		}

	}// 5

	public void practice6() {
		/*
		 * System.out.print("시작숫자 : "); int num1 = sc.nextInt();
		 * 
		 * System.out.print("공차 : "); int num2 = sc.nextInt();
		 * 
		 * for (int i = 0; i < 10; i++) { int j = i * num2; System.out.print((num1 + j)
		 * + " "); }
		 */

		System.out.print("시작숫자 : ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int gong = sc.nextInt();

		// 10회 반복하라
		for (int i = 0; i < 10; i++) {
			num += gong;
			System.out.println(num + " ");

		}

	}// 6

	public void practice7() {

		/*while (true) {
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
			} else if ((ch == '/' || ch == '%') && num2 == 0) {
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

		}*/
		
		//내가 한거
		
		while(true) {
		
			System.out.print("연산자(+,-,*,/,%) : ");
			String str= sc.next();
			char ch = str.charAt(0);
			
			if ("exit".equals(str)) {
				System.out.println("연산자 프로그램을 종료합니다.");
				break;
			}
			
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if(num2 == 0 && (ch == '/' || ch == '%')) {
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}
			
			
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
			default :
				System.out.println("없는 연산자 입니다, 다시 입력해주세요.");
				
			}break;
		}
		
		
		

	}// 7

	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		/*for (int line = 0; line < num; line++) {
			for (int star = 0; star < num; star++) {
				if (line >= star) {
					System.out.print("*");
				}
			}
			System.out.println();
		}*/
		// 내가 한거
		
		for(int j = 1; j< num; j++) {
			for(int i = 1 ; j< j ;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}//8

	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int line = num; line >= 0; line--) {
			for (int star = 0; star < num; star++) {
				if (line >= star) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}//9

	public void practice10() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		/*if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.print("소수가 아닙니다.");
				break;
				// 이코드가 1회라도 수행된 경우 소수아님
			}
			System.out.println("소수 입니다.");
			break;
		}*/
		//내가 푼거
		
		
		if (num <2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		// 소수는 1부터 n까지 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수
		
		boolean isPrime = true;
		
		for(int i = 2; i< num; i++) {
			if(num % i ==0) {
				System.out.println("소수가 아닙니다.");
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("소수입니다.");
		}

	}//10

	public void practice11() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		// 외부반복문 : 2~ 내가 입력한 값까지 반복
		// 내부반복문 : 현재 값이 소수인지 아닌지 판단.
		
		/*loop1:
		for (int i = 2; i <= num; i++) {   // .... 01 반복문
			loop2:
			for (int j = 2; j <= i; j++) { // .... 02 반복문
				
				if (i % j == 0) {    // 나누면 0이되는 값이 출력
					if (i != j) {	 // 그 중 나눈 값과 나뉜 값이 같지 않은 수가 있으면 소수가 아니다.
						break ;       // 그런 값이 나오면 가장 가까운 02 반복문에서 탈출하겠다.
					}
					System.out.print(i + " ");
				}
			}
		}*/
		
		//인터넷에서 도움받아 한것
		
		int count = 0;// 내부에 쓰면 외부에서 다시 초기화가 되기 때문
		
		for(int i = 2; i <= num ; i++) {
			boolean isPrime = true;
			for(int j = 2 ; j < i ;j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count ++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개 입니다.");
		
	}//11

	public void practice12() {
			
		// 못 풀은 문제
		
		System.out.print("자연수 하나를 입력하세요. : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1;  i<=num ; i++) {
			
			//2 혹은 3의 배수이면 출력
			if ( i % 2 == 0 || i%3==0) {
				System.out.println(i + " ");
			}
			//2와 3의 공배수이면 갯수 카운팅
			if(i% 2 == 0 && i % 3 ==0) {
				count++;
			}
			
		}
		System.out.println("/n count : " + count);
				
	}//12
	
	
}//class
