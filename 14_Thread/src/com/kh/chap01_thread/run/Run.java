package com.kh.chap01_thread.run;

import com.kh.chap01_thread.model.thread.Thread1;
import com.kh.chap01_thread.model.thread.Thread2;
import com.kh.chap01_thread.model.thread.UpAlp;

public class Run {
	public static void main(String[] args) {
	/*
	 * 프로그램
	 *  - 어떤 작업을 실행할 수 있는 파일
	 * 	- 코드형태로 이루어져 있다.
	 * 	- 실행전 단계(cpu를 할당받지 못함)
	 *  △ 즉 실행되기 전의 코드의 집합이라고 보면 됨
	 *  
	 * 프로세스
	 * 	- 현재 동작하고 있는 프로그램
	 * 	- 작업을 위한 cpu를 할당받은 상태
	 * 
	 * 스레드
	 * 	- 프로세스를 수행하는 실제 작업단위(일꾼)
	 * 	- 모든 프로세스에는 반드시 1개 이상의 스레드가 존재한다.
	 * 	- 스레드는 메인스레드 1개와 n개의 일반 스레드가 존재한다. -> 자바 기준
	 * 	- 각 스레드는 독립적인 메모리를 가진다.
	 * 
	 * 싱글스레드
	 * 	- 메인스레드 1개 가지고 작업을 처리 한다.
	 * 	- 한 작업씩 순차적으로 처리한다. -> 들어온 순서대로
	 * 
	 * 멀티스레드
	 * 	- 메인스레드와 추가 스레드를 이용하여 동시에 여러 작업을 처리 한다.
	 * 
	 * 멀티스레드의 장점
	 * 	1) 작업의 효율성이 증대.
	 * 	  - A쓰레드 B쓰레드 나눠서 작업을 처리해 훨씬 더 빨리 작업 완료가 가능.
	 * 
	 * 	2) 응답성 향상 
	 * 	  - 사용자 입장에서 일처리가 빠르게 보인다.
	 * 
	 * 	3) cpu를 효율적으로 사용 가능
	 * 	  - 멀티 스레드 환경에서는 여러작업이 동시에 수행되므로, cpu의 대기시간이 줄어든다.
	 * 
	 * 멀티스레드 프로그래밍시 주의점(단점)
	 * 	 - 동기화 처리가 복잡해진다
	 * 	 - 스레드가 많을수록 메모리 공간이 줄어든다.(Stack)
	 * 	 - 프로그램이 복잡해진다. 
	 */
		
	// 싱글스레드
	// - 실행할 작업(메서드라 보면됨)을 순차적으로 수행.
		
		for(int i = 1 ; i<= 100; i++){
			System.out.println("작업 1 [" + i + "]");
		}
		for(int i = 1 ; i<= 100; i++){
			System.out.println("작업 2 [" + i + "]");
		}
		
		
		// 스레드를 통한 멀티스레드 프로그래밍
		// 스레드 생성방법 1. thread클래스를 상속받아 생성
		
		Thread th1 = new Thread1();
		
		//스레드 실행
		
		//th1.run(); 
		// 이건 메서드를 실행하는 것 뿐, 메모리를 할당 받은게 아니다. 메인스레드에 run이 쌓이는 것 뿐
		// 여전히 스레드는 한개
		
		th1.start();
		//메인 스레드 생성 -> stack 메모리 할당 -> main() 메서드 실행
		//일반 스레드 생성 -> stack 메모리 할당 -> run() 메서드 실행
		
		//스레드 생성방법2. Runnable 인터페이스를 구현
		//간단해서 많이 쓰인다.
		Thread th2 = new Thread(new Thread2());
		th2.start();
		
		//현재 스레드 갯수 3개( 메인 + 만든 스레드 2개)
		
		
		// 스레드 생성방법3. 내부 클래스를 활용하는 방법.
		// 필드 위치, 메서드 메인 위치 내부 생성가능
		// 메서드 내부에서만 쓰는 용도
		class Thread3 extends Thread{
			
			public void run() {
				System.out.println("Thread3 가동");
			}
			
		}
		
		Thread3 th3 =new Thread3();
		th3.start();
		
		
		//4. 익명 내부클래스를 통한 생성
		// 3의 방법을 좀더 쉽게 사용하는 방법
		
		Thread th4 = new Thread(){	//=> 생성자의 역할을 하며 상속받는 클래스의 역할을 함
			@Override
			public void run() {
				System.out.println("Thread4 가동");
			}
		};
		
		
		// 5. 람다식을 활용한 스레드 설정
		// 4번보다 좀 더 간단히 하는 법
		Thread th5 = new Thread(() -> {
			System.out.println("Thread5 가동");		
		});
		th5.start();
		
		/*
		 * 스레드의 특징
		 * 
		 * 1. 동시성
		 * 	- 멀티 스레드 프로그래밍에서 여러개의 스레드가 "동시에" 실행되는 것처럼 보이는 현상으로
		 * 	  실제로는 OS의 "스케쥴러"에 의해 스레드의 전환이 순식간에 이루어져 동시에 실행되는
		 * 	  것처럼 보이는 현상이다.
		 * 	- 단 CPU 코어의 개수가 많다면 실제로 여러개의 스레드가 동시에 실행된다.
		 * 
		 * 2. 병렬성
		 * 	- 멀티스레드 프로그래밍에서 여러개의 스레드가 동시에 실행되는 특징
		 * 	- 코어의 개수만큼 동시에 실행된다.
		 * 
		 * 3. 독립성
		 * 	- 각 스레드는 독립적으로 실행되며, 다른 스레드의 영향을 받지 않는다.
		 * 	- 개별적인 실행 흐름을 보장하기 위해 고유 stack 영역을 할당받는다. heap과 static은 공유
		 * 	- 메인스레드가 종료되더라도, 개별스레드가 실행중이라면 프로세스가 종료되지 않는다.
		 */
		
		System.out.println("메인 메서드 끝");
		
		
		/* 	
		[실습문제]
		알파벳 A~Z 까지 출력하는 스레드 생성
		알파벳 a~z 까지 출력하는 스레드 생성
		각 스레드 생성후 main스레드에서 실행.
		출력예시 :
		[대문자쓰레드 시작]
		[소문자쓰레드 시작]
		[대문자쓰레드 : A]
		[대문자쓰레드 : B]
		[소문자쓰레드 : a]
		[대문자쓰레드 : C]
		[소문자쓰레드 : b]
		....
		[소문자쓰레드 : z]
		[대문자쓰레드 : Z]
		[대문자쓰레드 종료]
		[소문자쓰레드 종료]
	*/
		
		class LowAlp extends Thread{
			
			public void run() {
				char ch = 'a';
				for (int i = 0; i < 26; i++) {
					System.out.println("소문자 쓰레드 : " + ch);
					ch++;
				}
				
				System.out.println("소문자 스레드 종료");
				
			}
			
		}
		
		Thread th6 = new LowAlp();
		th6.start();
		
		
		
		Thread th7 = new UpAlp();
		th7.start();
			
		
	}

}
