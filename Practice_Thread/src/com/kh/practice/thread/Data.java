package com.kh.practice.thread;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Data {

	private int value;
	private boolean isEmpty = true;

	public Data() {
	}

	public int getValue() {

		synchronized (this) {

			if (isEmpty) {
				try {
					throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오…");
				}catch(EmptyException e ) {
					System.out.println(e.getMessage());
					try {
						wait();
					} catch (InterruptedException i) {
						i.printStackTrace();
					}
				}
			}
			isEmpty = true;
			System.out.println("get value : " + value);
			System.out.println("값을 꺼냈습니다. value가 비어있습니다.");
			notify();
			return value;
		}

	}

	public void setValue(int value) {
		

		synchronized (this) {
			this.value = value;	

			if (!isEmpty) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : " + value);
			notify();
		}
	}

}
