package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	
	public void mainMenu() {
		
		System.out.println("==Welcome KH Library==");
		System.out.println();
		
		while(true) {
			System.out.println("******* 메인메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 :
				insertBook();
				break;
			case 2 : 
				selectList();
				break;
			case 3 :
				searchBook();
				break;
			case 4 :
				deleteBook();
				break;
			case 5 :
				ascBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
		
		
		
		
	}
	
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타 : ");
		int category = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		//다른 풀이
		//String [] arr = {"인문", "과학", "의료" " 기타"};
		//Book b = new Book (title, author, arr[category -1], price);
		
		String str = "";
		
		switch(category){
			case 1 :
				str = "인문";
				break;
			case 2 :
				str = "과학";
				break;
			case 3 :
				str = "외국어";
				break;
			case 4 :
				str = "기타";
				break;
		}
		
		Book b = new Book (title, author, str, price);
		
		bc.insertBook(b);
		
		
	}
	
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList<Book> booklist = bc.selectList();
		
		
		if(!(booklist.isEmpty())) {
			for(int i = 0 ; i < booklist.size() ; i++) {
				System.out.println(booklist.get(i)); 
				//booklist를 그냥 쓰면 모든 값이 나오게 된다. 
				//get을 써서 인덱스에 있는 값 하나하나 가져오기
				//collecttion 에서 null 조건식은 잘 쓰지 않는다..
				
				
				/*for(Book b : bookLits){
				  System.out.print(b);
				}*/
			}
		}else {
			System.out.println("존재하는 도서가 없습니다.");
		}
		
		
	}
	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		if(!(searchList.isEmpty())) {
			for(int i = 0 ; i < searchList.size() ; i++) {
				System.out.println(searchList.get(i));
			}
		}else {
			System.out.println("존재하는 도서가 없습니다.");
		}
		
		
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		
		
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove!=null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
 		
	}
	
	public void ascBook() {
		
		int num = bc.ascBook();
		
		if(num == 1) {
			System.out.println("정렬에 성공했습니다.");
		}else {
			System.out.println("정렬에 실패했습니다.");
		}
		
	}
	
}
