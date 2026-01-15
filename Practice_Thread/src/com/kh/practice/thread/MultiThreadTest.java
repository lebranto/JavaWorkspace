package com.kh.practice.thread;

public class MultiThreadTest {
	public static void main(String[] args) {
		
		
		Data d = new Data();
		
		Thread putThread = new Thread(new Provider(d));
		Thread getThread = new Thread(new Consumer(d));
		
		putThread.start();
		getThread.start();
		
	}

}
