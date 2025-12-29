package com.kh.practice.dimension;

public class DimensionPractice {

	public void practice1() {
		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("( " + i + ", " + j + ")");
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
				System.out.print(arr[i][j] + " ");
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

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				int num = (int) (Math.random() * 10 + 1);
				if(i==3) {
					arr[3][j] = arr[][]
				}else if {
				arr[i][j] = num;
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
			arr[3][0];
			arr[3][1];
			arr[3][2];
			arr[1][3];
			arr[2][3];
			arr[3][3];
		}
	}

}
