package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	{
		lotto = new int[6];
	for(int i = 0 ; i<6 ; i++ ) {
		int num =(int)(Math.random() *45 +1);
		lotto[i] = num;
			for(int j = 0 ; j<i ;j++ ) {
				if(lotto[j]==lotto[i]) {
						i--;
						break;
				}
			}
		}
	}
	
	//기본 생성자
	public Lotto() {};

	
	public void infomation() {
		for(int i = 0 ; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	
		}
		
	}
