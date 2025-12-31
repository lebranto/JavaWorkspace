package com.kh.chap01.after.model.vo;

public class SmartPhone extends Product {

	private String mobileAgency;
	
	public SmartPhone () {}
	
	public SmartPhone (String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand,pCode,pName,price);
		this.mobileAgency = mobileAgency;
		}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	
	@Override //-> 오버라이드가 된다면 적을 수 있는 문장 
	public String information() {
		return super.information()+ ", " + mobileAgency;
		
	}
	
}
