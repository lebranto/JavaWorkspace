package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("±¹¾î : ");
		double iNum1 = sc.nextDouble();

		System.out.print("¿µ¾î : ");
		double iNum2 = sc.nextDouble();

		System.out.print("¼öÇÐ : ");
		double iNum3 = sc.nextDouble();
		
		int total = (int)(iNum1 + iNum2 + iNum3);
		int avg	  = total / 3 ;

		System.out.println("ÃÑÁ¡ : " + (int) (iNum1 + iNum2 + iNum3));
		System.out.println("Æò±Õ : " + (int) (iNum1 + iNum2 + iNum3) / 3);
		
		System.out.println(total);
		System.out.println(total / 3);

	}

}
