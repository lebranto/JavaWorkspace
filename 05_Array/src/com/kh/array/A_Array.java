package com.kh.array;

import java.util.Arrays;

public class A_Array {
	/*
	 * 
	 * 변수 : 하나의 공간에 하나의 값을 저장할 수 있는 저장 공간.
	 * 		int a = 10;
	 * 		a = 20;
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있다. ("같은 자료형" 기준)
	 * 		ex) int a [] = new int[3];   // int [] a 도 된다.
	 * 		=> int 자료형 값을 담을 수 있는 저장 공간이 3칸 할당된다.
	 *      => 3 * 4 byte = 12byte 저장 공간 확보
	 *      [0, 0, 0]
	 *      배열에서 저장된 데이터를 꺼낼때는 "인덱스"를 활용하며, 인덱스 값은 0부터 시작
	 * 		arr[0],arr[1],arr[2]
	 * 		배열의 크기가 n이라면, 해당 배열의 마지막 인덱스는 항상 'n-1'
	 */

	
	public void method1() {
		/*
		 * 배열선언
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 * 
		 * */
		
		int a;
		int [] arr;
		int arr2 [];
		
		/*
		 * 배열 할당 
		 * - 이 배열에 몇 개의 값들을 보관할건지 그 배열의 크기를 지정해주는 과정
		 * - 크기를 지정해주면, 지정한 갯수만큼의 저장공간을 가진 배열이 생성
		 * 
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 * */
		
		arr = new int[5]; // 할당 완료
		int [] arr3 = new int[5];
		
		System.out.println(arr3[0]); // [0,0,0,0,0] => 0은 int 자료형의 "기본값" 
		
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3; // [1,2,3,0,0]
		
		System.out.println(arr3[3]);
		System.out.println(arr3[2]);
		System.out.println(arr3); 
		// aar3 = 참조형변수 : 출력문으로 출력하면 주소값이 나오는 변수
		
	}
	
	public void method2() {
		int num = 10;
		//변수 선언, 배열 선언은 스택(stack)에 저장됨
		int [] iArr = new int[5];
		//[0,0,0,0,0]
		//new int[5] 구문으로 생성된 배열의 시작 주소를
		//iArr 변수에 대입
		//시작 주소는 heap 메모리에 저장됨
		//heap 메모리 할당 공간은 !절대! 비워둘 수 없음
		
		System.out.println("iArr : " + iArr);
		//배열에 저장한 값이 아닌 주소값이 나온다.
		System.out.println("iArr의 HashCode : " + iArr.hashCode());
		//주소값을 10진수 형태로 변경해준다.
		
		int [] iArr2 = new int[5]; //[0,0,0,0,0]
		System.out.println("iArr2의 HashCode : " + iArr2.hashCode());
		
		int [] iArr3 = iArr2;
		System.out.println("iArr3의 HashCode : " + iArr3.hashCode());
		//iArr2 = iArr3 같은 주소값이다.
		//새로 생성된게 아니라 이미 생성된 배열값을 다른 배열에 넣기만 했기 때문
		
		System.out.println(iArr == iArr2); //false
		System.out.println(iArr2 == iArr3); //true
		
		// 참조자료형 기준으로는 주소값을 비교하는 것이기 때문에 값을 비교 할 수는 없다.

	}
	
	public void method3() {
		int [] iArr = new int [5];
		
		//배열 값 초기화
		for(int i = 0 ; i > 5 ; i ++) { // 5대신 iArr.length => 배열의 크기가 나온다.
			iArr[i] = i;			
		}
		//[0,1,2,3,4] 가 각각 들어갔다.
		System.out.println(iArr[4]); //4가 나온다. 5번째라고 5를 쓰는게 아니다.
	}

	public void method4() {
		int result =0;
		String str = null; //"" 
		int [] arr = null;
		
		
		//NULL 은 모든 참조 자료형의 기본값이다.
		// 단, 참조변수가 null을 저장한 상태에서, 주소값이 있어야 수행할 수 있는 행위를
		//코드로 작성하면 실행시 에러가 난다.
		
		//System.out.println(arr.length); //배열의 크기가 정해져 있지 않아 에러
		//System.out.println(arr[0]); 
	}
	
	public void method5() {
		int [] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 * 1. 반복문을 이용하여 배열 초기화 하기
		 * 
		 * 2. 초기화 완료된 배열을 반복문을 활용하여 내부에 저장된 값을 출력
		 * 출력형식 : 10 8 6 4 2 
		 */
						
		/*for (int i = 4; i>=0; i--) {
			arr[i] = (i*2 +2);
			System.out.print(arr[i] + " ");
		}*/
		// 내가 한거
		
		
		int value = 2;
		for (int i = 0; i<5; i++) {
			arr[i] = value;
			value +=2;
		}
		
		// 값 출력
		for (int i = arr.length -1 ; i > -1; i-- ) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
		
		arr[5] = 12;
		// 배열의 크기를 벗어난 인덱스 제시시 에러 발생.
		// 배열은 한번 지정한 크기를 변경할 수 없다.
		// 배열의 범위를 넘어선 값들을 지정하고자 한다면, 새로운 배열을 생성해야 한다.
		
        arr = new int [6];
        arr[5] = 12; // 기존 0~4의 값은 0으로 돌아간다.
	}
	public void method6() {
		//배열의 선언, 할당, 초기화를 한번에 수행하는 방법.
		
		//1.
		int [] arr1 = new int[] {1,2,3,4};
		//크기 4의 배열이 생성되고 [1,2,3,4]의 값이 들어간다.
		
		//2.
		int [] arr2 = {1,2,3,4};
	}

	public void method7() {
		//문자열을 문자 배열로 만드는 방법
		
		//1. toCharArray() 함수 사용
		String str = "merry";
		char[] arr = str.toCharArray(); //['m','e','r','r','y']
				
		//2. for 문으로 문자배열 생성하여 옮겨담기		
		char [] arr2 = new char [str.length()];
		
		for(int i = 0 ; i <arr2.length; i++){
			arr2[i]= str.charAt(i);			
		}
		//Arrays.toString(배열) => 배열내부의 값들을 문자열로 변환하여 반환하는 메서드
		System.out.println(Arrays.toString(arr));
		System.out.println(arr2);
		
	}
}
