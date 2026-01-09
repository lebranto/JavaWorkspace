package com.kh.chap04_assist.part03_data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {
	
	public static void main(String[] args) {
		
		DataRun dr = new DataRun(); 
		//dr.fileSave();
		dr.fileRead();
	}
	
	
	public void fileSave() {
		
		
		try(DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream("sample.txt"));){
			
			// 자바의 자료형별 데이터 작성
			dos.writeBoolean(true);
			// 값을 입력하고 개행처리 함
			dos.writeInt(123);
			dos.writeDouble(3.14);
			dos.writeChar('음');
			dos.writeUTF("자바자바");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(DataInputStream dis = new DataInputStream(new FileInputStream(new File("sample.txt")));){
			// 저장한 자료형 순서대로 읽어온다
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
			
			System.out.println(dis.readUTF()); // EOFException 발생
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

}
