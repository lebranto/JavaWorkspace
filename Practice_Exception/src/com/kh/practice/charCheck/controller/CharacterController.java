package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {
		
		
	}
	
	public int countAlpha (String s) throws CharCheckException {
		int num = s.replace(" ","").length();
		
		if(!(s.contains(" "))) {
		System.out.println(s + "포함된 영문자 갯수 : " +num);
		}else {
		throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		
		/*if(s.contains(" ")){
		 * throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		 * }
		 * 
		 * int count = 0;
		 * 
		 * char[] arr = s.toUpperCase().toCharArray();
		 * for(char : arr){
		 *  //각문자가 영문자인지 검사
		 *  if>='A' && ch<= 'Z'{
		 *  count++
		 *  } 
		 * 
		 * retrun count;
		 * 
		 * */
		
		return num;
	}
}
