package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdDao {
	
	//BufferedWriter/Reader
	
	
	public void fileSave() {
		
		BufferedWriter bw = null;
		
		
		try {
			//보조스트림이 Writer 계열이라면, 기반 스트림도 Writer 계열만 와야한다.
			bw =new BufferedWriter(new FileWriter(new File("c_buffer.txt")));
			
			bw.write("안녕하세요");
			bw.newLine(); //개행문자 넣어주는 메서드
			bw.write("반갑습니다.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//bw.close();
				bw.flush(); //버퍼공간(8kb)을 비워주는 메서드. close()호출시 자동 호출
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		
		/*
		 * try 	~ with ~ resource 구문 (jdk 7 이상부터 사용가능)
		 * 
		 * try(스트림 객체 생성 ;){
		 *  // 코드
		 * }catch(예외클래스){
		 * 
		 * }
		 * 스트림객체를 try에 붙여넣으면 스트림객체 생성 후 해당 블록의 구문이 실행
		 * 완료되면 알아서 자원을 반납(close) 한다.
		 * 
		 */
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));){
			
		     //br.readLine() 
			// read : 한글자씩, readLine : 한줄씩
			// 더이상 반환할 값이 없다면 null 반환
			
			String value = "";
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
