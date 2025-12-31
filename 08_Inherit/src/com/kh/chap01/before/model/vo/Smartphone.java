package com.kh.chap01.before.model.vo;

public class Smartphone {
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	

	public Smartphone() {}
	
	public Smartphone(String brand,String pCode,String pName,int price,String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
		
		
	}

	private String getBrand() {
		return brand;
	}

	private void setBrand(String brand) {
		this.brand = brand;
	}

	private String getpCode() {
		return pCode;
	}

	private void setpCode(String pCode) {
		this.pCode = pCode;
	}

	private String getpNaem() {
		return pName;
	}

	private void setpNaem(String pNaem) {
		this.pName = pNaem;
	}

	private int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

	private String getMobileAgency() {
		return mobileAgency;
	}

	private void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	
	
}
