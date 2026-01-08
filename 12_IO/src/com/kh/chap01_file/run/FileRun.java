package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		/*
		 * java.io.File 
		 * 	- 파일의 개념을 추상화하여 만들어진 클래스
		 * 	- 별도의 입출력 기능은 존재하지 않는다.
		 * 	- 파일의 속성이나 경로, 이름, 크기 등을 알 수 있다.
		 */
		
		try {
		 // 1. 경로를 지정하지 않고 파일 생성
		 File file1 = new File("test.txt");
		 file1.createNewFile();
		 
		 // 2. 경로를 지정하고 파일 생성
		 //File file2 = new File("C:/aaa/test.txt");
		 //file2.createNewFile();
		 
		 
		 // 3. 폴더만 생성하기
		 File bbbFolder = new File("C:/bbb");
		 bbbFolder.mkdir();//makeDiretory
		 
		 //여러개의 폴더는 만들 수 없고 하나만 만들 수 있다.
		 
		 // 4. 폴더 여러개 만들기
		 File cccdddFolder = new File("C:/ccc/ddd");
		 cccdddFolder.mkdirs();
		 //없는 파일을 지정하면 IOException 오류가 발생 한다.
		 
		 
		 // 5. 폴더가 존재하지 않는 상황에서, 폴더 및 파일 생성
		 // 이미 있는 디렉토리인가 아닌가 검토도 함
		 
		 File aaa = new File("C:/aaa");
		 //폴더가 이미 존재하는지 체크, 존재하지 않는다면 폴더 생성
		 if(!aaa.exists()) {
			 aaa.mkdir();
		 }
		 
		File file2 = new File("C:/aaa/test.txt");
		file2.createNewFile();
		
		//File에서 제공하는 메서드들.
		System.out.println(aaa.isFile());
		System.out.println(aaa.isDirectory()); 
		
		System.out.println("파일명 : " + file1.getName()); //이름
		System.out.println("상위폴더 : " + file1.getParent()); //경로 현재는 최상위 위치에 있어서 null이 나옴
		System.out.println("파일 용량 : " + file2.length()); //파일의 용량
		System.out.println("절대경로 : " +file1.getAbsolutePath()); //물리저장 위치에서 저장된 위치값 반환
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	
		

	}

}
