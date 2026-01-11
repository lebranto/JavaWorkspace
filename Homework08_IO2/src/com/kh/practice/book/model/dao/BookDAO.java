package com.kh.practice.book.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	
	private Book[] bArr = new Book [10];

	
	public void fileSave(Book[] bArr) {
		
		this.bArr = bArr;
		
		ObjectOutputStream a = null;
		
		
		try {
			a=new ObjectOutputStream(new FileOutputStream(new File("Book.txt")));
			
			for(int i = 0 ; i<bArr.length ; i++) {
				if(bArr[i] == null) {
					a.writeObject(bArr);
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			a.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Book[] fileRead() {
		
		ObjectInputStream read = null;
		
		
		try {
			read = new ObjectInputStream(new FileInputStream("Book.txt"));
		
			while(true) {
			Book b = (Book) read.readObject();
			if(bArr != null) {
				System.out.println(b);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				
		

		
		
		return bArr;
		
	}
	

}
