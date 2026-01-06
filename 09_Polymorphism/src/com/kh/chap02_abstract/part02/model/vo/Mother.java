package com.kh.chap02_abstract.part02.model.vo;

public class Mother extends Person{
	
	private String babyBirth; // 아기 탄생 여부
	
	
	public Mother () {
		
	}
	
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;

	}

	


	public String getBabyBirth() {
		return babyBirth;
	}


	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}


	public void eat(){
		//엄마가 밥을 먹으면
		//몸무게 10 증가, 건강도 10 감소
		setWeight(getWeight() + 10);
	}	
	
	
	public void sleep() {
		//건강도 10 증가
		setHealth(getHealth() + 10);
	}

	

}
