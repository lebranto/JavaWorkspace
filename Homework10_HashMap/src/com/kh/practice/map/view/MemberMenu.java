package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		System.out.println("======== KH 사이트 ========");
		
		
		while(true) {
			System.out.println("******* 메인메뉴 *******");
			
			
		}
		
	}
	
	public void memberMenu() {
		
	}
	
	
	public void joinMembership() {
		
	}
	
	public void login() {
		
	}
	
	public void changePassword() {
		
	}
	
	public void changeName() {
		
	}
	
	public void sameName() {
		
		System.out.println();
		String name = sc.next();
		
		TreeMap<String, String> tm = mc.sameName(name);
		Set<Entry<String, String>> entrys = tm.entrySet();
		
		for(Entry<String, String> en : entrys) {
			System.out.println(en.getValue() + "-" + en.getKey());
		}
		
	}
	
	
	

}
