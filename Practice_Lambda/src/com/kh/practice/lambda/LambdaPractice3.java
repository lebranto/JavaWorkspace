package com.kh.practice.lambda;

public class LambdaPractice3 {

	public static void main(String[] args) {
		MyFunction<String, String> first = str -> str.toUpperCase(); // String  
		MyFunction<String, Boolean> second = str -> str.length() >= 5;
		MyFunction<String, String> third = str ->  {
			
			String [] arr = str.split("");
			StringBuilder sb = new StringBuilder();
			for(String s : arr) {
			sb.append(s).append("-");
			}
			sb.deleteCharAt(sb.length()-1);
			return sb.toString();
		};
	

		System.out.println(first.apply("hello"));
		System.out.println(second.apply("안녕하세요"));
		System.out.println();
		

	}

	@FunctionalInterface
	public interface MyFunction<V, B> {
		B apply(V v);
	}

}
