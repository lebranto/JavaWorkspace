package com.kh.practice.thread;

public class Consumer extends Thread{
	
	
	private Data data;
	
	public Consumer(Data data) {
		this.data=data;
		
	}
	
	
	public void run() {
		
		for(int i = 0; i<11; i++) {
			int value = data.getValue();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		
	}

}
