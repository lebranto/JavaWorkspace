package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	static
	//초기화는 프로그램 켤 때 한 번만
	{
		
		grade = 1;
	}
	
	
	//초기화 블럭을 이용한 초기화
	{
		classroom = 3;
		name = "권혁주";
		height = 160;
		gender = 'm';
		
		
	}
	
	//기본 생성자
	public Student() {};

	
	public void infomation() {
		System.out.println(name + " ,"+ classroom 
				+ " ,"+ gender+ " ," +height + ", "+grade);
		
	}
	

}
