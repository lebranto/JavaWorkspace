package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	
	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();
	
	
	public boolean addNewKind(Farm f, int amount) {
		
		if (!(hMap.containsKey(f))){
			hMap.put(f, amount);
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	public boolean removeKind(Farm f) {
		if (hMap.containsKey(f)){
			hMap.remove(f);
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)){
			hMap.remove(f, amount);
			return true;
		}else {
			return false;
		}
		
	}
	
	public HashMap<Farm,Integer> printFarm(){

		
		
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		
	
	}
	
	public boolean removeFarm(Farm f) {
		
	}
	
	public ArrayList<Farm> printBuyFarm(){
		
	}
	

}
