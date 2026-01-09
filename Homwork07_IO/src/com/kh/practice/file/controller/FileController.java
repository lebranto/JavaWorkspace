package com.kh.practice.file.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
	
		return fd.checkName(file);
		
	}
	
	public void fileSave(String file, StringBuilder sb) {
		
		String str = sb.toString();
		//참조 자료형을 문자열로 바꾸기 위해서는 toString을 사용한다.
		
		fd.fileSave(file, str);
		
	}
	
	public StringBuilder fileOpen (String file) {
		
		StringBuilder b = new StringBuilder(file);
		
		return b;
		
	}
	
	public void fileEdit(String file, StringBuilder sb) {
	
		
		String a = sb.toString();
		
		fd.fileEdit(file, a);
		
		
	}

}
