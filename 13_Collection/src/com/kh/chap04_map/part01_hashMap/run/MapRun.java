package com.kh.chap04_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		/*
		 * HashMap
		 * 	- 많은 양의 데이터를 "빠르게 저장하고 관리" 하기 위하여 사용하는 클래스로,
		 * 	  key값과 value 값을 함께 저장한다.
		 * 	- 계층구조상 List, Set 계열과 다른 Map 계열 인터페이스를 상속한 클래스로,
		 * 	  사용하는 메서드가 다르다.
		 * 	- 데이터를 저장할 때 key, value를 한 쌍으로 저장하고, key를 통해 value가
		 * 	  저장된 위치에 접근한다.
		 * 	- key 값의 중복을 허용하지 않는다.
		 * 	- 동일한 key값에 데이터를 저장하면, 마지막으로 추가된 value 값이 저장된다. 
		 */
		
		// key 값의 자료형은 String
		// value값의 자료형은 Snack
		// HashMap<K, V> 컬렉션명 = new HashMap<>();
		HashMap<String, Snack> hm = new HashMap<>();
		
		
		// 1. put(K key, V value) : map 공간에 key, value를 세트로 추가하는 메서드
		//△저장될 위치를 내가 지정
		// 키값 = 벨류값  이런식으로 나온다.
		
		hm.put("다이제", new Snack("초코맛",800));
		hm.put("칸쵸", new Snack("초코맛",400));
		hm.put("두쫀쿠", new Snack("초코맛",450));
		hm.put("포테토칩", new Snack("솔트맛",500));
		
		hm.put("다이제", new Snack("초코맛",900));
		
		
		System.out.println(hm);
		
		
		// 2. get(K key) : V 값 추출
		//HashMap에서 key와 일치하는 value 값을 찾는 메서드
		System.out.println(hm.get("두쫀쿠"));
		
		
		// 3. size() : 초기화된 데이터 수 반환
		System.out.println(hm.size());
		
		
		// 4. replace(K key, V value)
		// 	- hashmap에서 key 값과 일치하는 값을 찾아, 새로 전달된 value로
		//    "교체"하는 메서드
		
		hm.replace("다이제", new Snack("고소한맛",500)); 
		//키 값이 반드시 있어야 한다.
		//교체만 하는 것  cf) put은 교체 및 추가의 기능을 한다.
		
		
		// 5. remove(Key k) : key 값과 일치하는 값을 찾아서 제거해주는 메서드
		//					  key와 value 가 함께 제거된다.
		
		hm.remove("다이제");
		System.out.println(hm.get("다이제")); // null 값이 나온다.
		
		
		System.out.println("===========================================");
		//Map 계열 반복문 돌리기 (참고로 자체적으로는 베이직for, 향상된 for, Iterator는 사용 불가
		//방법 1. keyset()을 활용한 반복
		// - 맵의 key값들을 따로 Set에 담아 반환해주는 메서드 
		Set<String> s = hm.keySet(); //우리가 지정한 제네릭을 따라감
		
		for(String key : s ) {
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		
		//방법 2. entrySet()을 활용한 반복
		// - 맵의 key, value 값이 담긴 entry를 set에 담아 반환해주는 매서드
		
		Set<Entry<String, Snack>> es = hm.entrySet();
		//entrySet() 의 반환형 Entry<K , V>
		
		for(Entry<String, Snack> a : es) {
			System.out.println("Key : " + a.getKey()); // key 값을 가져오는 메서드
			System.out.println("value : " + a.getValue()); // value 값을 가져오는 메서드
		}
		
	}
}
