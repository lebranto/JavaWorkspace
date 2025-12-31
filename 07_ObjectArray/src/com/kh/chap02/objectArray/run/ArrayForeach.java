package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ArrayForeach {
	
	
	public static void main(String[] args) {
		int [] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//향상된/개선된 반복문 advanced loop/ foreach
		/*
		 * for each문
		 * -배열 또는 컬렉션과 함께 사용되는 반봅문으로, 배열 또는 컬렉션의 
		 * 0번 인덱스부터, 마지막 인덱스까지 순차적으로 접근할 때 사용
		 *
		 * 초기식 초건식 증감식 x
		 * 반복횟수는 배열의 크기
		 * 
		 * [표현법]
		 * for( 순차적으로 접근한 값을 담을 변수 : 반복하고자 하는 배열명){
		 * 	//반복적으로 실행할 내용
		 *}
		 * 
		 */
		
		
		int [] arr2 = {10,20,30};
		for ( int a : arr2) {
			System.out.println(a);
		}
	
	
		Phone [] phones = new Phone[3]; //null, null, null
	
		phones[0] = new Phone ("갤","삼","노",150000);
		phones[1] = new Phone ("아","애","11",150000);
		phones[2] = new Phone ("아","애","10",150000);
	
//	phones 객체 배열에 저장된 핸드폰 가격들의 총합 구하기
		
		
		int sum = 0;
		for ( Phone p : phones) { // 참조자료형 Phone 변수 => p
			sum+=p.getPrice();
		}
		System.out.println(sum);
		
	
	}

}
