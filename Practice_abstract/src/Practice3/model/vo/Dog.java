package Practice3.model.vo;

public class Dog extends Animal {
	
	private int weight;
	
	public Dog() {}
	
	public Dog (String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public void speak () {
		
		System.out.println(super.toString() + "몸무게는 " + weight 
				+ "Kg 입니다.");
		
	}

}
