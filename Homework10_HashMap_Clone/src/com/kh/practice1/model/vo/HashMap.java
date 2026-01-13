package com.kh.practice1.model.vo;

public class HashMap {

	private Entry[] table;
	private int capacity;
	private int size;

	public void HashMap(int capacity) {
		
		HashMap<?> hm = new HashMap<>(capacity);
		

	}

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap(10);
		
		

	}

	public void put(String key, Snack value) {
		 
		// getIndex함수 호출후 반환값으로 table의 index에 접근  
		// 접근시 내부의 값이 null이라면 Entry매개변수 있는 생성자를 이용하여 
		// 객체생성후 비어있는 저장공간에 Entry객체 추가하기. 
		//  ex) 최초 Entry 객체 생성시 : new Entry(key, value , null) 
		// 값이 null이 아니라면 , entry에 저장된 key값과 새롭게 추가하려는 entry의 
		// key값이 동일한지 검사후 동일하다면 , 중복값이므로 value값만 덮어씌우고 
		// key값이 다르다면 현재 entry의 next요소에 entry객체 저장. 
		// 만약 next에도 이미 값이 존재하는경우, next가 없는 entry를 찾을때까지 반복  
		// 중복값을 제외하고, 값이 새롭게 추가된경우 size 증가
		
		
		if (table[getIndex(key)] ==null) {
			
			table[getIndex(key)] = new Entry(key,value,null);
		}else {
			
			for(int i = 0 ; i<table.length; i++) {
			if(table[getIndex(i)] == table[getIndex(key)]) {
				
			}
			
			}
		}
			
		
		
		 
		
		 
	}

	public boolean containsKey(String key) {

	}

	public void remove(String key) {

	}

	public int size() {

	}

	public int getIndex(String key) {

		return key.hashCode() % capacity;
	}

}
