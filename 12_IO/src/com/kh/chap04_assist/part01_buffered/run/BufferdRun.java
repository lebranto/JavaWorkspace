package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferdDao;

public class BufferdRun {

	public static void main(String[] args) {
		/*
		 * 보조 스트림
		 * 	- 기반 스트림의 부족한 성능이나 기능을 추가할 수 있는 스트림
		 *	- 보조 스트림은 단독으로는 사용이 불가능 
		 * 	
		 * [표현법]
		 * 보조스트림 변수명 = new 보조스트림(기반스트림 객체);  <new 기반스트림(파일객체)>
		 * 보조스트림 1 변수명 new 보조스트림1(new 보조스트림2(기반스트림객체);
		 *  -> 객체안에 객체넣고 하는 방식을 데코레이터 방식
		 *  
		 * BufferedXXX
		 * 	- 속도 성능 향상 목적의 보조 스트림
		 *  - 내부적으로 버퍼 공간을 제공하여 데이터를 모아뒀다가 한번에 입출력을 진행.
		 * 
		 */
		BufferdDao bd = new BufferdDao(); 
		bd.fileRead();
		
	}
}
