package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	// 체크하지 않아도 되는 예외

	Scanner sc = new Scanner(System.in);
	/*
	 * UncheckedException 
	 * 	- RuntimeException처럼 프로그램 실행시 발생되는 예외들이 대표적인
	 * 	UncheckedException 계열의 예외들이다. 
	 * 	1. ArratIndexoutoufBoundException 
	 * 	2.NegativeArraySizeException 
	 * 	3. ClassCastException 
	 * 		- 허용할 수 없는 형변환이 진행될 경우 발생하는 예외 
	 * 		ex) p1이 child2 객체로 생성된 참조변수일 때, (child1) p1 등의 다운캐스팅을 수행할 경우 
	 * 	4.NullpointerException 
	 * 		- 참조변수가 null안 상황에서 특정 메서드 및 필드에 접근하려고 할때 발생하는 예외 
	 * 		->null값은 상관 없지만 null.() 이 안되는 것 
	 * 	5. ArithmeticException ....
	 * 
	 * 
	 * => 이러한 RuntimeException과 관련한 예외는 충분히 예측가능한 상황이다. 
	 * 	예외 처리가 애초에 발생이 안되게끔, 대부분조건문으로 해결이 가능하다. 
	 * 	즉, 굳이 예외처리(예외처리 코드들 Ex) Throw,Try ~ catch )를 할 필요가 없다는 의미
	 * 
	 */

	public void method1() {
		// ArithmeticException
		// - 나누기 연산시 0으로 나눌 때 발생

		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		// 예외처리 방법 1) 조건문으로 애초에 예외가 발생하지 않게끔 처리한다.
//		if(num2 ==0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}else {
//			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
//		}

		try {
			// ArtihmeticException이 발생할 수 있는 코드
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();
			// 오류를 로그로 출력하는 기능, 필수적인 구문
			// 프로그램을 종료 시키진 않는다

		}

		// 예외처리 방법 2) try~ catch 문으로 해결하기
		/*
		 * try ~ catch 문 - 예외가 발생했을 경우를 대비해서 실행할 내용을 정의해 두는 문법
		 * 
		 * [표현법] try { // 예외 발생할 수 있는 코드 } catch(발생할 수 있는 예외클래스 객체명){ // 해당 예외가 발생시 실행할
		 * 구문 }
		 * 
		 */

		System.out.println("프로그램 종료!");

	}

	public void method2() {

		System.out.print("정수 입력(0 제외) : ");

		try {
			int num = sc.nextInt();
			//nextInt는 조건문으로 예외처리를 할 수 없어 무조건 예외문 작성
			System.out.println("나눗셈 연산 결과 : " + 10 / num);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException i) {
			System.out.println("정수의 값을 입력해주세요");
		} // 다중예외처리문법 : 예외가 여러개인 경우 사용
		
		System.out.println("프로그램 종료");
	}
	
	public void method3() {
		// ArrayIndexOutOfBoundsException
		// NegativeArraySizeException
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		//예외 처리 방법 1. 다중 캐치 블럭 
		//에러가 많아지면 쓰기 불편해짐
//		try {
//			int[] arr = new int[size];
//			System.out.println("100번째 인덱스의 값 : " + arr[100]);
//		}catch(NegativeArraySizeException n) {
//			System.out.println("배열의 크기는 음수일 수 없습니다.");
//		}catch(ArrayIndexOutOfBoundsException o) {
//			System.out.println("부적절한 인덱스 입니다.");
//		}
		// 처리방법 2. 다형성을 이용한 catch
		// 에러 별로 정확한 처리가 불가
		try {
			int[] arr = new int[size];
			System.out.println("100번째 인덱스의 값 : " + arr[100]);
		// 다중 catch 블럭 작성이 범위가 작은 자식 클래스를 먼저 기술해야 한다.	
		}catch(ArrayIndexOutOfBoundsException a){
		   System.out.println("잘못된 인덱스 접근 입니다.");
		}catch(RuntimeException r) { // 다형성 적용
			System.out.println("예외가 발생했습니다.");
			r.printStackTrace(); // 어떤 예외 인지 알려주는 함수를 넣어야 한다.
		} 
		
	}
	
	/*
	 * RuntimeException 관련된 예외는
	 * 	- 조건문으로 해결이 가능하기 때문에 예외 자체가 애초에 발생 안되게끔
	 * 	  개발자가 소스코드로 핸들링하는게 권장 된다.
	 * 	- 예외처리 구문으로도 해결이 가능하긴 하다.
	 * 
	 *  예측이 가능한 상황 => 조건문으로 해결
	 *  예측이 불가능한 상황 예외처리 구문으로 해결 
	 * 
	 * 
	 */
}
