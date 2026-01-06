package com.kh.chap02_abstract.part02.model.vo;

public class Baby extends Person {
	
	
	public Baby() {
		
	}
	
	

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}




	@Override
	public String toString() {
		return "Baby [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHealth()=" + getHealth()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}




	@Override
	public void eat() {
		// 몸무게 3, 건강도 1 증가
		setWeight(getWeight() + 3);
		setHealth(getHealth() + 1);
	}

	@Override
	public void sleep() {
		//건강도 3 증가

		setHealth(getHealth() + 3);
	}

}
