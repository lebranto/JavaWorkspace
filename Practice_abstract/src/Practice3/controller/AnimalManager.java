package Practice3.controller;

import Practice3.model.vo.Animal;
import Practice3.model.vo.Cat;
import Practice3.model.vo.Dog;

public class AnimalManager{
	
	public static void main(String[] args) {
		
		Animal [] a = new Animal[5]; // null, null, null
		
		a[0] = new Dog("왕","이탈리안 하운드",5);
		a[1] = new Cat("냥","브리티쉬 숏헤어","스위스","흰색");
		a[2] = new Cat("양","메인쿤","영국","고등어");
		a[3] = new Dog("멍","러셀 테리어",3);
		a[4] = new Dog("월","꼬통 트 툴레아",4);
		
		for(Animal b : a) {     // b는 값을 넣을 변수 a는 주소값
			b.speak();          // b를 출력하면 Animal의 toString 메서드 형식이 출력된다.   
		}
		
	}

}
