package com.kh.practice1.model.vo;

public class Entry {
	
	protected String key;
	protected Snack value;
	protected Emtry next;
	
	
	
	public Entry(String key, Snack value, Emtry next) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
	}
	

	
	
}
