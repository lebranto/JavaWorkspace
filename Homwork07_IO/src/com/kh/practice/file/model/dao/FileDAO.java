package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		
			
		File f = new File(file);
			
		return f.exists();
		
	}
	
	public void fileSave(String file, String s) {
		
		FileWriter fo = null;
		
		try {
			fo = new FileWriter(file,true);
			fo.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public StringBuilder fileOpen(String file) {
		
		StringBuilder b = new StringBuilder(file);
		
		return b;
		
	}
	
	public void fileEdit(String file, String s) {
		
	}

}
