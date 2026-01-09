package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
			fo = new FileWriter(file);
			fo.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		
		FileReader r = null;
		
		StringBuilder b = new StringBuilder(file);
		
		try {
			r = new FileReader(file);
			
			int value = 0;
			while((value = r.read()) != -1){
				b.append((char) value);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return b;
		
	}
	
	public void fileEdit(String file, String s) {
		
		
		FileWriter fo = null;
		
		try {
			fo = new FileWriter(file,true);
			fo.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
