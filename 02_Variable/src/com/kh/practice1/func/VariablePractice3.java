package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("가로 : ");
		double iNum1 = sc.nextDouble();

		System.out.println("세로 : ");
		double iNum2 = sc.nextDouble();

		System.out.println();

		System.out.println("면적 : " + (iNum1 * iNum2));
		System.out.println("둘레 : " + (iNum1 + iNum2) * 2);

	}

}
