package com.kh.chap05_synccontro.run;

import com.kh.chap05_synccontro.model.thread.Consumer;
import com.kh.chap05_synccontro.model.thread.Data;
import com.kh.chap05_synccontro.model.thread.Provider;

public class Run {
	public static void main(String[] args) {
		
		Data data = new Data();
		Thread provider = new Thread(new Provider(data));
		Thread consumer = new Thread(new Consumer(data));
		
		provider.start();
		consumer.start();
		
		
	}

}
