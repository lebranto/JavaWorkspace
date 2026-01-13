package com.kh.chap04_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun {
	public static void main(String[] args) {
		/*
		 * properties
		 *  - Map 계열 인터페이스를 구현한 클래스로, Key, value 쌍으로 값을 저장
		 *  - 단 properties는 key, value값을 모두 "String"으로 관리하는 것을
		 *  권장하며, 파일 입출력메서드(IO)를 지원한다.
		 *  - 주로 프로젝트의 설정정보를 기록하는데 사용된다.
		 */
		
		Properties prop = new Properties();
		
		//map 계열 인터페이스를 구현하였기 때문에 put 메서드 사용 가능, 그러나 잘 사용하진 않는다.
		//prop.put("다이제", new Snack("초코맛", 500));
		
		
		// 1. setProperty(String, String)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties"); // 동일한 키값(주소값)에 저장하면 어떻게 될까.
											   // HashMap의 put과 동일하게 마지막 값이 저장된다.
		
		System.out.println(prop);
		
		
		// 2. getProperty(String key)
		// - key에 저장된 value 값을 가져오는 메서드
		System.out.println(prop.getProperty("Set"));
		
		
		
		// 3. store(OutputStream os, String Comments<맨 위에 쓰이는 코멘트>)
		// - prop에 담긴 key, value를 모두 출력스트림을 활용하여 출력하는 메서드
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 4. load(InputStream is) : properties를 읽어오는데 사용하는 메서드
		Properties prop2 = new Properties();
		
		
		System.out.println(prop2); // 아무값도 없다
		
		try {
			prop2.load(new FileInputStream("test.properties"));
			//xml 이라는 파일을 읽어올때는 loadFromXML의 메서드를 사용한다.
			
			System.out.println(prop2); // 데이터가 추가됨
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
