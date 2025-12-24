package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*
		 * int[] arr1 = new int[10];
		 * 
		 * int num = 10;
		 * 
		 * for (int i = 9; i >= 0; i--) { arr1[i] = num; System.out.print(arr1[i] +
		 * " "); num--; }
		 */
		// 내가 한거

		int arr[] = new int[10];

		// 배열의 길이만큼 반복 진행
		// i=> 0
		// i=> 1
		// i=> 2
		// i=> ...
		// i=> 9
		for (int i = 0; 1 < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}
	}// 1

	public void practice2() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		/*
		 * int a = 1;
		 * 
		 * int[] arr = new int[num]; for (int i = 0; i < num; i++) { arr[i] = a;
		 * System.out.print(arr[i] + " "); a++; }
		 */
		// 내가 한거

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i] + " ");
		}
	}// 2

	public void practice3() {
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}

	}// 3

	public void practice4() {

		/*
		 * System.out.print("0 ~ 6 사이 숫자 입력 : "); int num = sc.nextInt();
		 * 
		 * char[] ch = { '월', '화', '수', '목', '금', '토', '일' };
		 * 
		 * switch (num) { case 0: System.out.print(ch[num] + "요일"); break; case 1:
		 * System.out.print(ch[num] + "요일"); break; case 2: System.out.print(ch[num] +
		 * "요일"); break; case 3: System.out.print(ch[num] + "요일"); break; case 4:
		 * System.out.print(ch[num] + "요일"); break; case 5: System.out.print(ch[num] +
		 * "요일"); break; case 6: System.out.print(ch[num] + "요일"); break; default:
		 * System.out.println("잘못 입력하셨습니다."); }
		 */

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (!(num >= 0 && num <= 6)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		System.out.print(arr[num] + "요일");

	}// 4

	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		int num1 = 1;
		int sum = 0;

		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				arr[i] = num - (1 * num1);
			}
			if (i % 2 == 1) {
				arr[i] = -(num - (1 * num1));
				num1++;
			}
			sum += arr[i];
		}

		// System.out.println(arr[4]);

		for (int j = 0; j < num; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("\n총합 : " + sum);
		// 내가한거

	}// 5

	public void practice6() {
		System.out.print("문자열 : ");
		String str = sc.next();

		/*
		 * char[] ch = new char[st.length()];
		 * 
		 * for (int i = 0; i < st.length(); i++) { ch[i] = st.charAt(i);
		 * System.out.print(ch[i] + (i == st.length() - 1 ? " " : ", ")); }
		 * System.out.println(); System.out.print("문자 개수 : " + st.length());
		 */
		// 내가 한거 틀림...

		char[] arr = str.toCharArray();
		// ex) application 이 있다면 a위치에서 앞쪽의 단어들과 비교해 a라는 값이 있는지 확인한다.

		int count = 0;
		for (int i = 0; i < arr.length; i++) {// 검사하는 문자를 순회하는 반복문
			char ch = arr[i];
			boolean isDup = false;

			for (int j = 0; j < i; j++) { // loop2
				if (ch == arr[j]) {
					// 중복
					isDup = true;
					break; // loop2에서 빠져 나간다. 아래의 if문으로
				}
			}
			if (!isDup) {
				System.out.print(ch + " ");
				count++;
			}
		}
		System.out.println("\n" + count);
	}// 6

	public void practice7() {
		System.out.print("문자열 : ");
		String str = sc.next();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == ch) {
				System.out.println(str + "에 " + ch + "가 존재하는 위치 : " + i);
				count++;
			} // 먼저 실행?

		}
		System.out.println(ch + "의 개수 : " + count);

	}

	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();

		char[] arr1 = new char[str.length()];
		char[] arr2 = arr1;

		for (int i = 0; i < str.length(); i++) {
			char st = str.charAt(i);
			if (i <= 7) {
				arr1[i] = st;
			} else {
				arr1[i] = '*';
			}
		}
		System.out.print(arr2);

	}

	public void practice9() {
		int[] arr = new int[10];

		int max = 0;
		int min = 0;

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice10() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 10 + 1);
			boolean ju = false;
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					ju = true;
					i--;
					break;
				}
			}
			if (!ju) {
				System.out.print(arr[i] + " ");
			}
		}		
		
	}
	public void practice11() {
		System.out.print("정수 : ");
		int num =sc.nextInt();
		
		if(num <3 || num%2==0) {
			System.out.println("다시 입력해주세요.");
			practice11();
			return;
		}
		
		int [] arr = new int [num];
		int a = 1;
		
		for(int i = 0 ; i<arr.length; i++) {
			arr[i] = a++;
			
		}
		
	}
	
	

}
