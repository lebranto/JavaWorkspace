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
		
	  
		
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			
			switch(num){
			case 1 :
				bc.fileSave(bArr);
				break;
			case 2 :
				bc.fileRead();
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
		
		System.out.println("도서명 : ");
		String name = sc.next();
		
		System.out.println("저자명 : ");
		String author = sc.next();
		
		System.out.println("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.println("출판 날짜(yyyy-mm-dd) : ");
		String str = sc.next();
		
		String [] a = str.split("-");
		
		String year = a[0];
		String month = a[1];
		String day = a[2];
		
		
		int b = Integer.parseInt(year);
		int c = Integer.parseInt(month);
		int d = Integer.parseInt(day);
		
		
		Calendar date = Calendar.getInstance();
		date.set(b, c, d);
		
		
		System.out.println("할인율 : ");
		Double sale = sc.nextDouble();
		
		
		
		for (int i = 0 ; i< bArr.length ; i++) {
			
			if(bArr[i]== null) {
				bArr[i] = new Book(name, author, price, date, sale);
			}
			break;
		}
		
		
		bc.fileSave(bArr);
		
		
	}
	
	public void fileRead() {
		
		System.out.println(bc.fileRead());
		
	}
}
