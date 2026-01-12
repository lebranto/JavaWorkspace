package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	
	public Music() {}
	
	public Music(String title , String Singer) {
		
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public void setTitle(String title) {
		
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	@Override
	public int compareTo(Music o) {
		
		//this.title.compareTo(o.title); //  오름차순
		o.singer.compareTo(this.singer);
		
		return 1;
	}
	
	
	
	

}
