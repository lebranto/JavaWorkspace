package com.kh.practice.book.model.dao;

import java.io.EOFException;
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
		
		try (ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("Book.txt"));){
			
////			for(int i = 0 ; i<bArr.length ; i++) {
////				if(bArr[i] == null) {
////					a.writeObject(bArr[i]);
////					break;
////				}
			
//			}
			// 내가 못한거
			for (Book b : bArr) {
				if(b != null) {
				   a.writeObject(b);
				   break;
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Book[] fileRead() {
		
		
		
		try (ObjectInputStream read  = new ObjectInputStream(
				new FileInputStream("Book.txt"));){
			
			
			//내가 못한거
			int index = 0; 
			
			while(true) {
			Book b = (Book) read.readObject();
			bArr[index] = b;
			index +=1;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e){  //입력할 값이 더 이상 나오지 않을 때 나오는 오류를 예외처리
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				
		

		
		
		return bArr;
		
	}
	

}
