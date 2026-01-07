package com.kh.chap03_wrapper;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스
		 *  => 기본자료형을 객체로 포장(Wrapping)해주는 클래스들 ,기능을 추가해 준다고 생각하면 됨
		 *  기본 자료형 < ---- > Wrapper 클래스
		 *  boolean          Boolean
		 *  char             Character
		 *  byte             Byte
		 *  short            Short
		 *  int              integer
		 *  long             Long 
		 *  float            Float
		 *  double           Double
		 *  
		 *  양방형으로 형변환이 이루어 진다.
		 *  
		 *  -> boxing
		 *  <- unboxing
		 *  
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		// 기본자료형은 값만을 저장하기 때문에 특별한 기능이 존재하지 않는다.
		//System.out.println(num1.equals(num2)); 값이기 때문에 클래스에 쓰이는 equals는 안된다.
		
		//기본자료형 -> Wrapper 자료형으로 변환(Boxing)
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2)); //두 값이 같은지
		
		System.out.println(i1.hashCode()); // 본인의 값을 주소값으로 저장함
		System.out.println(i1.compareTo(i2)); // 대소비교의 결과값을 1,0,-1로 출력
		// a.compareTo (b)
		// a가 b보다 작은 경우 -1
		// a와 b가 같은 경우 0
		// a가 b보다 큰 경우 1
		
		// Wrapper -> 기본자료형 (UnBoxing)
		int num3 = i1;
		int num4 = i2;
		
		System.out.println("=====================");
		// String 형태로 이루어진 기본자료형을 일반 기본자료형으로 변환하는 방법
		String str1 = "10";
		String str2 = "15.3";
		
		// String --> 기본자료형 : 파싱하는 방법
		//Wrapper.클래스.parse변환할자료형(변환할 문자열);
		int i =Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
		//정확하게 어떤 값을 가지고 있는지 알아야 쓸 수 있다.
		
		
		//기본 자료형 --> String
		// 10 --> "10"
		String strI = String.valueOf(i);
		String strI2 = i + "";
		
		
		
	}

}
