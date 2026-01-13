package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	ArrayList<Book> list = new ArrayList<>();
	
	
	public BookController() {
		
		list.add(new Book("자바의 정석","남궁 성", "기타",20000));
		list.add(new Book("쉽게 배우는 알고리즘","문병로", "기타",15000));
		list.add(new Book("대화의 기술","강보람", "인문",17500));
		list.add(new Book("암 정복기","박신우", "의료",21000));
		
		
	}
	
	public void insertBook(Book bk) {
		
		list.add(bk);
		
		
	}
	
	public ArrayList<Book> selectList() {
		
		
		
		
		return list;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		//null로 두지 않는 이유는 내부 객체를 사용해야 하기 때문
		//null로 초기화 했다면 사용 할 수 있었지만 그러지 않는 추세.
		
		for(int i = 0 ; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		/*
		 * for( Book b : list){
		 * if(b.getTitle().contains(keyword)){
		 * 		searchList.add(b);
		 * 	}
		 * }
		 * */
		

		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		
		Book removeBook = null;
		
		for(int i = 0; i<list.size() ; i++) {
			if(list.get(i).getTitle().equals(title) &&
					list.get(i).getAuthor().equals(author)){
				removeBook = list.remove(i);
			}
		}
		
		
		return removeBook;
		
	}
	
	public int ascBook() {
		
		Collections.sort(list);
		
		return 1;
	}
	

}
