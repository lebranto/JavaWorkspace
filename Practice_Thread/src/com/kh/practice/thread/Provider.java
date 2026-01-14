package com.kh.practice.thread;

import java.util.Random;

public class Provider extends Thread {

	private Data data;

	public Provider(Data data) {

		this.data = data;

	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			data.setValue(new Random().nextInt(100) + 1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
