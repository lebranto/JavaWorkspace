package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDoa;

public class Run {
	
	public static void main(String[] args) {
		
	
		ObjectDao od = new ObjectDao ();
		//od.fileRead();

		ObjectsDoa od2 = new ObjectsDoa();
		od2.fileSave();
		od2.fileRead();
	}
	
	

}
