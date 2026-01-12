package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
	
		if(o1.getTitle().compareTo(o2.getTitle())==0){
			o1.getSinger().compareTo(o2.getSinger());
		}
		
		
		
		return o1.getTitle().compareTo(o2.getTitle());
		
	}

}
