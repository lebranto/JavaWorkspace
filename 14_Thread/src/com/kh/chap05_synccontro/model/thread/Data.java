package com.kh.chap05_synccontro.model.thread;

//공유자원
public class Data {
	
	private int item; // 생산 및 소비되는 아이템
	// 1== 생산, 0 == 소비
	
	private boolean empty = true;
	//item 의 상태를 저장하고, 스레드의 흐름을 제어하기 위한 변수
	
	
	// 아이템 소비 메서드
	// consumer의 사용 메서드
	public void getData() {
		// 만약 item이 생산되기 전이라면, item을 소비하지 않도록 "대기" 상태로 전환
		synchronized (this) {
			if(empty) {
				
				try {
					// 동기화 블럭에서 사용하는 sleep같은 메서드
					// 다른 스레드가 깨우기 전까지 대기상태로 전환
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
			
			//아이템소비
			item = 0;
			empty = true;
			System.out.println("소비자가 아이템을 소비하였습니다");
			notify();
		}
		
	}
	
	
	// 아이템 공급용 메서드
	public void setData() {
		synchronized (this) {
			if(empty == false) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			item = 1;
			empty = false;
			System.out.println("생산자가 아이템을 생산했습니다.");
			
			
			notify(); //컨슈머가 대기중인 경우 깨우는 메서드
			
		}
	}

}
