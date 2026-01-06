package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];

	public String[] method() {

		Phone[] arr = new Phone[2];

		arr[0] = new GalaxyNote9("삼성");
		arr[1] = new V40("LG");

		for (int i = 0; i < arr.length; i++) {
			// 1안. downcasting
			result[i] = ((SmartPhone) arr[i]).printInformation();

			// Phone 에는 printInformation 메서드가 없기 때문에
			// 자식 클래스인 SmartPhone 으로 다운 캐스팅을 해줘야 함

			// 2안. instanceof
//			if (arr[i] instanceof V40) {
//				result[i] = ((V40) arr[i]).printInformation();
//			} else if (arr[i] instanceof GalaxyNote9) {
//				result[i] = ((GalaxyNote9) arr[i]).printInformation();
//			}

		}
		return result;

	}
}
