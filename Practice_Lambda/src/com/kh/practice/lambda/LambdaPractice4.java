package com.kh.practice.lambda;

public class LambdaPractice4 {
	
	public static void main(String[] args) {
		
		
		MyFunction2 <String, Integer> print = (str, num) ->
		System.out.println(str +"님의 점수는 " + 
		(num>=90 ? 'A' : (num>=80? 'B' : (num>=70 ? 'C' :'D')))
				+ "학점(" + num + ") 입니다" );
		
		
		print.accept("권혁주", 90);
		print.accept("홍길동", 80);
		
	}
	
	
	@FunctionalInterface
	public interface MyFunction2 <K, A> {
		
		void accept(K k, A a);

	}

}
