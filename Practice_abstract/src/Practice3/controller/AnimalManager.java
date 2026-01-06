package Practice3.controller;

import Practice3.model.vo.Animal;
import Practice3.model.vo.Cat;
import Practice3.model.vo.Dog;

public class AnimalManager{
	
	public static void main(String[] args) {
		
		Animal [] a = new Animal[5];
		
		a[0] = new Dog("권","강아지",45);
		a[1] = new Cat("냥","고양이","스위스","흰색");
		a[2] = new Cat("왕","고양이","영국","고등어");
		a[3] = new Dog("멍","강아지",60);
		a[4] = new Dog("월","강아지",70);
		
		for(Animal b : a) { // as
			b.speak();  
		}
		
	}

}
