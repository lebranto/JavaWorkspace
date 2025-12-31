package com.kh.chap01.after.model.vo;

public class Product {
	
	/* 
	 * 세 클래스 모두 공통적으로 가지고 있는 요소들을 정의해둘 클래스
	 */
		protected String brand;
		protected String pCode;
		protected String pName;
		protected int price;
		
		public Product() {}
		
		public Product(String brand,String pCode,String pName,int price) {
			this.brand = brand;
			this.pCode = pCode;
			this.pName = pName;
			this.price = price;
			
		}
		
		
		
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getBrand() {
			return brand;
		}
		
		public String getpCode() {
			return pCode;
		}
		public void setpCode(String pCode) {
			this.pCode = pCode;
		}
		public String getpName() {
			return pName;
		}
		public void setpName(String pNaem) {
			this.pName = pNaem;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		
		public String information () {
			return  brand + ", " +pCode + ", "+pName + ", "+price;
		}
		
		
	}


