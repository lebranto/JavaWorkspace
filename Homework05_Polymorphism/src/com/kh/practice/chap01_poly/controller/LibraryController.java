package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;



public class LibraryController {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}	
	
	public void insertMember(Member mem) {
		// 전달받은 m 은 주소값 mem 에 대입해야 됨.
		this.mem= mem;
		
	}
	
	public Member myInfo() {
		
		System.out.println(mem);
		
		return mem;
		
	}
	
	public Book[] selectAll() {
		
		return bList;
		
	}
	
	public Book[] searchBook(String keyword) {
		
		Book [] search = new Book [5];	
	
		int index = 0;
	
		
		for(Book b : bList) {  
			// b.getTitle은 bList를 가지고 값을 찾는 거기 때문에 null 값이 나오지 않는다.
			if(b.getTitle().contains(keyword));
			search[index++] = b;
		}

//		
//		Book [] o  = new Book [5];
//			
//		for (int i = 0 ; i < key.length ; i++) {
//			o.getTitle().contains(keyword)}
		//o.getTitle()을 쓰면 null 값이 나온다.
		//o 는 새로 만든 객체이기 때문에 전부 null 값으로 초기화 되어 있기 때문
//			

		
		return search;
		
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		Book b = bList[index]; // index 값 대입
		
		if(b instanceof AniBook && mem.getAge() < ((AniBook)b).getAccessAge()) {
			result = 1;
		}
		// instanceof 필수 
		
		else if (b instanceof CookBook && ((CookBook)b).isCoupon()) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		} 
		
		return result;
		
		
	}

}
