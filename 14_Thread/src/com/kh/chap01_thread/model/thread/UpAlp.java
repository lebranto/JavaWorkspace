package com.kh.chap01_thread.model.thread;

public class UpAlp extends Thread {
	public void run() {
		for (int i = 'A'; i < 'Z'; i++) {
			System.out.println("대문자 스레드 : " + (char) i);
		}
		System.out.println("대문자 스레드 종료");
		
	}

}
