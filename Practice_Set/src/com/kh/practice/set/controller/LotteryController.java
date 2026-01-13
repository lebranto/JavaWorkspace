package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	
	public boolean insertObject(Lottery l) {
		
		
		return lottery.add(l);
		// 참인지 거짓인지 판단
		
		
	}
	public boolean deleteObject(Lottery l) {
		
		boolean result = false;
		
		result = lottery.remove(l); // 실제로 그 값이 존재하는지 확인
		                            //매개변수의 데이터를 찾아간다. 추가된 데이터와 equals 실행 같다면 삭제
		if(result && win != null){
			win.remove(l);
		}                            
		
		
		
//		if(l.hashCode()== lottery.hashCode() && !(win.isEmpty())) {
//			lottery.remove(l); //매개변수의 데이터를 찾아간다. 추가된 데이터와 equals 실행 같다면 삭제
//			win.remove(l);
//			return true;
//		}else {
//			return false;
//		}
	
		return result;
		
	}
	public HashSet<Lottery> winObject() {
		
		List<Lottery> lo = new ArrayList<>(lottery);
		Collections.shuffle(lo); // 데이터 섞어주기
		
		
		if(lo.size() < 4) {
			return null;
		}
		
				
		for(int i =0 ; win.size()< 4; i++) { //i 로 해버리면 계속 새로운 당첨자가 발생함.
			win.add(lo.get(i));
		}
		
		return win;
		
		
//		if(lo.size() < 4) {
//			return null;
//		}
//		
//		return lottery;
		
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		// 인덱스를 이용해 win에 당첨자 저장
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움

		
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		
		winObject();
		
		//Collects.sort(); list가 아니라 사용할 수 없다.
		
		TreeSet<Lottery> set = new TreeSet<>(new SortedLottery());
		set.addAll(win);
		
		
		return set;
	}
	
	public boolean searchWinner(Lottery l) {
		
		return win.contains(l); // get은 없다.
		
		
	}

}
