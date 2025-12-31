package com.kh.chap01.ondeVsMany.run;

import java.util.Scanner;

import com.kh.chap01.ondeVsMany.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		
		//객체 배열 없이 코딩하기
		// 1. setter 방식 초기화
		//가독성이 좋지만 값이 많을 수록 코드가 길어진다.
		Book bk1 = new Book();
		bk1.setTitle("아이");
		bk1.setAuthor("어른");
		bk1.setPrice(5000);
		bk1.setPublisher("세상");
		
		//2. 매개변수 초기화
		//정확한 값을 보려면 객체를 확인해야 한다. 가독성이 부족
		Book bk2 = new Book("아이", "어른",5000, "세상");
		
		
		//3. 매개변수 생성자로 객체 생성 및 초기화
		Book bk3 = new Book("원피스", "오다", 10000, "이지스");
		
		
		// 도서정보 출력 서비스
		
		for(int i = 0; i<3; i++) {
			if( i== 0) {
				System.out.println(bk1.information());
			}
			else if(i == 1) {
				System.out.println(bk2.information());
			}
			else {
				System.out.println(bk3.information());
			}
		}
		
		//객체만 있는 상태에선 작업이 비효율적이므로, 배열에 넣어서 관리해줘야 한다.
		
		Book [] arr = new Book[3]; // null, null, null
		arr[0] = bk1;
		arr[1] = bk2; 
		arr[2] = bk3; 
		
		//배열을 통해 도서정보 출력 서비스 만들기
		for (int i = 0 ; i<arr.length ; i++) {
			System.out.println();
		}
		
		Scanner sc =new Scanner(System.in);
		
		//사용자에게 검색할 도서 제목을 입력받아 전체 도서목록들 중 일하는 제목의 도서 찾기
		System.out.print("검색할 책의 제목 : ");
		String searchTitle = sc.next();
		
		//객체배열 사용 반복문
		
		Book [] arr2 = new Book[3];
		
		arr2[0] = bk1;
		arr2[1] = bk2; 
		arr2[2] = bk3; 
		
		for(int i = 0 ; i<arr2.length;i++) {
	
			if (searchTitle.equals(arr2[i].getTitle()) ) {
				System.out.println(arr2[i].information());
			}
			
		}
		
		
		
	}

}
