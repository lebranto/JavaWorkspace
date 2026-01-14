package com.kh.practice.thread;

public class MultiThreadTest {
	public static void main(String[] args) {
		
		
		Data d = new Data();
		
		Thread t1 = new Thread(new Provider(d));
		Thread t2 = new Thread(new Consumer(d));
		
		t1.start();
		t2.start();
		
	}

}
