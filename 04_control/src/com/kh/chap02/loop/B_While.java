package com.kh.chap02.loop;

public class B_While {
	/*
	 * while 
	 * [표현법]
	 * "[]" <- 코드에 있으면필수가 아니라는 뜻 
	 * while(조건식){
	 * 	반복적으로 수행할 코드
	 *	[증감식]
	 *}
	 * 
	 * */
	
	public void method1() {
		// for문을 while 문으로 변경;
		
		//5회 반복문 for
		for(int i = 0; i<5 ; i++) {
			System.out.println("안녕!");
		}
		
		
		//5회 반복문 while
		int i = 0; // 초기식
		while (i<5) {//조건식
			System.out.println("안녕");
			i++;
		}// i = 5가 나온다.
	}
	
	public void method2 () {
		//while 문으로 5회 반복하여 아래 코드 출력
		//1 2 3 4 5
		
		int i = 1;
		while (i <6) {
			System.out.print(i + " ");
			i++;
			
			//System.out.print(i++ + " ");
		}		
	}//method2
	
	public void method3() {
		//1부터 랜덤값(1~10)까지의 총 합계를 while문으로 작성
		//출력예시 : 1부터 x까지의 합계는 x입니다.
		int sum = 0;
		int i = 0;
		
		
		int num = (int)(Math.random() *10 + 1);
		
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println( "1부터 " + num + "까지의 합계는" + sum +"입니다.");

	}
	
	/*do-while
	 * [표현법]
	 * do{
	 * 
	 * 반복 실행할 코드(단, 최초 1회는 반드시 수행)
	 * 
	 * }while (조건식);
	 * 
	 * - do-while문은 별도의 조건검사 없이 최초 1회는 무조건 실행
	 * 
	 */
	
	public void method4() {
		
		do {
			System.out.println("하이!");
		}while(false);
	} //method4
	
	public void method5() {
		//do-while 문을 활용하여
		//1 2 3 4 5 출력
		
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5);

	}//method5		
	
}
