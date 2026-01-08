package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	Scanner sc = new Scanner(System.in);
	CharacterController cc= new CharacterController();
	
	public void menu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();	
		
		try {
		/*int count = */ cc.countAlpha(str);
		/*System.out.println(str + "포함된 영문자 갯수 : " +count);*/
		}catch(CharCheckException c) {
			c.printStackTrace();
		}
	
	}
	
	

}
