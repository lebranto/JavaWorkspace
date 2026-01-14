package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	Member m = new Member();
	HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership (String id, Member m) {
		
	}
	
	public String login (String id, String password) {
		
	}
	
	public boolean changePassword(String id, String oldPw,String newPW ) {
		
	}
	
	public void changeName(String id, String newName) {
		
		map.get(id).setName(newName);
		
	}
	
	
	public TreeMap sameName(String name){
		
		TreeMap<String, String> tree = new TreeMap<>();
		
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			String str = map.get(key).getName();
			if(str.equals(name)) {
				tree.put(key, name);
			}
			
		}
		
		return tree;
	}

}
