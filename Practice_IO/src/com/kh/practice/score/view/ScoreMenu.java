package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	Scanner sc = new Scanner(System.in);
	ScoreController scr = new ScoreController();
	
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				saveScore();
				break;
			case 2 :
				readScore();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
		
	}
	
	public void saveScore() {
		
		
		int num = 0;
		while(true) {
			System.out.println(++num + "번 째 학생 정보 기록");
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			int sum = kor + math + eng; 
			double avg = (kor + math + eng) / 3.0;
			
			scr.saveScore(name, kor, eng, math, sum ,avg);
			
			System.out.println("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char ch = sc.next().charAt(0);
			
			if(ch=='n' || ch =='N') {
				return;
			}
			
		}
		
	}
	
	public void readScore() {
		
		
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
		
		
		try (DataInputStream dis = scr.readScore();){ //어려웠던 부분

			System.out.println("이름\t국어\t수학\t영어\t총합\t평균");
			while(true) { //값이 나오지 않을때 까지 계속 출력하기 위해
				System.out.print(dis.readUTF() + "\t"
						+ dis.readInt() + "\t" +dis.readInt() + "\t" + dis.readInt());
			int sum = dis.readInt();
			double avg = dis.readDouble();
			
			System.out.println("\t" + sum + "\t" +avg);
			
			count++;
			sumAll += sum;
			avgAll += avg;
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e){
			System.out.println("읽은횟수\t천체합계\t전체평균");
			System.out.println(count + "\t" + sumAll + "\t" + avgAll/count);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

}
