package com.kh.chap04_sync.sync;

import java.util.Random;

public class Atm implements Runnable{

	
	private Account acc;
	
	public Atm(Account acc) {
		this.acc = acc;
	}
	
	
	@Override
	public void run() {
		//잔액이 300원보다 크면 무한 반복.
		while(acc.getBalance() > 300) {
			int money = 
					(new Random().nextInt(3) +1) *300; // 0~ 2까지의 값 반환
			
			acc.whitdraw(money);
		
			try {
				Thread.sleep(2000); // 2초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		System.out.println(Thread.currentThread().getName()+ "종료");
		
		
		
		
	}
	
	

}
