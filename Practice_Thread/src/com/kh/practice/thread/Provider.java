package com.kh.practice.thread;

import java.util.Random;

public class Provider extends Thread {

	private Data data;

	public Provider(Data data) {

		this.data = data;

	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			int value = new Random().nextInt(100) + 1;
			data.setValue(value);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
