package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	public void fileSave() {
		//FileWriter : 파일로 데이터를 2byte 단위로 출력하는 스트림
		FileWriter fw = null; //try와 final 둘따 쓰기 위해 따로 생성
		
		try {
			fw = new FileWriter("b_char.txt", true); // 파일 없으면 생성하고, 이어쓰기 true.
			
			fw.write("재밌는 io시간..\n");
			fw.write("잘 즐기고 계신가요..\n");
			fw.write(' ');
			
			
			char[] arr = {'a','p','p','l','e'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close(); 
				// 자바는 1024바이트 문자를 모두 전달받고 출력하기 때문에 
				// 덜 입력했다면 close 함수를 써야 flush를 통해 비우고 문자열을 출력한다.
				// 1024 바이트를 다썻다면 close를 안써도 알아서 비우고 문자열을 출력한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
