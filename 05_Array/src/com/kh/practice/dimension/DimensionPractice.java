package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		/*int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("( " + i + ", " + j + ")");
			}
			System.out.println();
		}*/
		
		String[][] arr = new String[3][3];
		
		for (int i = 0; i < arr.length; i++) { // 행기준 반복
			for (int j = 0; j < arr[i].length; j++) { //열기준 반복
				arr[i][j] = "(" + i +", "+ j +")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] arr = new int[4][4];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num++;
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {

		int[][] arr = new int[4][4];
		int num = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];

//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				int num = (int) (Math.random() * 10 + 1);
//				arr[i][j] = num;
//			}
//		}
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[3][j] += arr[i][j];
//			}
//			/*
//			 * arr[3][0] =arr[3][0] + arr[0][0] + [1][0]+[2][0] arr[3][1] =arr[3][1] +
//			 * arr[0][1] + [1][1]+[2][1] arr[3][2] =arr[3][2] + arr[0][2] + [1][2]+[2][2]
//			 * 
//			 */
//		}
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[i][3] += arr[i][j];
//			}
//		}
//
//		arr[3][3] = arr[0][3] + arr[1][3] + arr[2][3] + arr[3][0] + arr[3][1] + arr[3][2];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.printf("[ " + arr[i][j] + " ]" + " ");
//			}
//			System.out.println();
//		}
		
		
		for (int i = 0; i < arr.length-1; i++) {
			for(int j =0; j <arr[i].length-1; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j]*2;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[ " + arr[i][j] + " ]" + " ");
			}
			System.out.println();
		}
		
	}

	public void practice5() {

		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		if (row > 10 || row < 1) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
			return;
		}

		System.out.print("열 크기 : ");
		int col = sc.nextInt();

		if (col > 10 || col < 1) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
			return;
		}

		char[][] alp = new char[row][col];

		for (int i = 0; i < alp.length; i++) {
			for (int j = 0; j < alp[i].length; j++) {
				char ran = (char)(Math.random() * 26 + 65);
				alp[i][j] = ran;
				System.out.print(alp[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice6() {

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}

		}

	}
	public void practice7() {
		System.out.print("행의 크기 : ");
		int line =sc.nextInt();
		
		char [][] alp = new char[line][];
		char ch = 'a';
		
	
		for (int i =0 ; i<alp.length; i++) {
			System.out.print(i+1 +"행의 열 크기 : ");{	
			int row = sc.nextInt();	
			}
		}
		
		for(int i= 0; i<alp.length; i++) {
			for (int j = 0; j<alp[i].length; j++) {
				System.out.print(alp[i][j] + " ");
			}
		}
	}
}
