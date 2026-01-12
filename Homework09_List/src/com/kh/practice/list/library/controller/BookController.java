package com.kh.practice.list.library.controller;

import java.util.ArrayList;

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
		
		for(Book b : searchList) {
			if(b.getTitle().equals(keyword)) {
				searchList = list;
			}
		}
		
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		
	}
	
	public int ascBook() {
		
	}
	

}
