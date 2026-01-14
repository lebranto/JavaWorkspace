package com.kh.chap05_synccontro.model.thread;

import java.util.Random;

public class Provider implements Runnable{
	
	private Data data;
	
	public Provider(Data data) {
		this.data = data;
	}
	

	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			data.setData();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
