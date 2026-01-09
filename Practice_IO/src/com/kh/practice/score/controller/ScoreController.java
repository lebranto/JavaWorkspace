package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {  
	//기능을 가지고 있는 클래스와 쓸 클래스의 중계 역할을 함
	private ScoreDAO sd = new ScoreDAO();
	
	public void saveScore(String name,int kor, int eng, 
			int math, int sum, double ave) {
		
		sd.saveScore(name, kor, eng, math, sum, ave);
		
	}
	
	public DataInputStream readScore() throws FileNotFoundException {
		
		DataInputStream dis = sd.readScore();
		
		return dis; //sd.readScore 그대로 써도 됨
	}
	
}
