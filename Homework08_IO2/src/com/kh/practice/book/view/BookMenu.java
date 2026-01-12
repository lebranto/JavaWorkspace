package com.kh.practice.book.view;


import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;


public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;

	public BookMenu() {
		
		bc.makeFile();
		
		bArr = bc.fileRead();
 		//못한 부분
	  
		
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			
			switch(num){
			case 1 :
				fileSave();
				break;
			case 2 :
				fileRead();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					
			}
			
		}
	}
	
	public void fileSave() {
		
		System.out.print("도서명 : ");
		String name = sc.next();
		
		System.out.print("저자명 : ");
		String author = sc.next();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String str = sc.next();
		
		String [] a = str.split("-");
		
		Calendar date = Calendar.getInstance();
		
		date.set(Integer.parseInt(a[0]),Integer.parseInt(a[1])-1,Integer.parseInt(a[2]));
		
//		String year = a[0];
//		String month = a[1];
//		String day = a[2];
//		
//		
//		int b = Integer.parseInt(year);
//		int c = Integer.parseInt(month);
//		int d = Integer.parseInt(day);
//		
//	
//		date.set(b, c, d);
		
		
		System.out.print("할인율 : ");
		Double sale = sc.nextDouble();
		
		Book b = new Book(name, author, price, date, sale);
		
		
		for (int i = 0 ; i< 10 ; i++) {
			if(bArr[i]== null) {
				bArr[i] = b;
				break;
		}
		}
		
		
		bc.fileSave(bArr);
		
		
	}
	
	public void fileRead() {
		
		Book[] bArr = bc.fileRead();
		
		for(Book b : bArr) {
			if( b!= null) {
				System.out.println(b);
			}
		}
		
	}
}
