package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감 연산자(당항연산자) ++ --
	 * 
	 * ++ : 변수에 담긴값을 1 증가. 
	 * ++변수 (전위 연산자) 
	 * 변수++ (후위 연산자)
	 * 
	 * -- : 변수에 담긴 값을 1 감소
	 * 
	 * (증감연산자) 변수 : 전위 연산 -> 선증감 후처리 
	 * 
	 * 변수 (증감연산자) : 후위 연산 -> 선처리 후증감
	 * 
	 */

	public void method1() {
		int num = 10;
		System.out.println("전위연산 적용전 num : " + num); // 10
		System.out.println("1회 수행 : " + ++num); // 11
		System.out.println("2회 수행 : " + ++num); // 12
		System.out.println("3회 수행 : " + ++num); // 13
		System.out.println("최종 num : " + num); // 13

		System.out.println();

		int num2 = 10;

		System.out.println("후위연산 전 num2 : " + num2); // 10
		System.out.println("1회 수행 : " + num2++); // 10(11)출력 실제 num2는 11 '+' -> '++' 순 실행
		System.out.println("2회 수행 : " + num2++); // 11(12) 실제 num2는 12
		System.out.println("3회 수행 : " + num2++); // 12(13) 실제 num2는 13
		System.out.println("최종 num2 : " + num2); // 13 + 먼저 실행후 ++이 실행
	}

	public void method2() {
		// 전위연산
		int a = 10;
		int b = ++a;

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		// 후위연산
		int c = 10;
		int d = c++;

		System.out.println("c : " + c);
		System.out.println("d : " + d);

	}

	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		// 주석으로 어떻게 출력될거같은지 생각하기
		System.out.println(a++); // 10(11)
		System.out.println((++a) + (b++)); //a = 12 b = 20(21)   합 : 33
		System.out.println((a++) + (--b) + (--c)); //a = 12(13) b= 20 c= 29  합 : 61
		System.out.printf("a: %d , b: %d, c: %d", a, b, c); //a= 13 = 20 c = 29

	}

}
