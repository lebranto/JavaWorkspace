package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class IPSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 : ");
		String ip = sc.next();
		
		
		try {
			
	
			InetAddress ia = InetAddress.getByName(ip);
			InetAddress [] ia2 = InetAddress.getAllByName(ip);
			String host = ia.getHostName();
			
			System.out.println("호스트명 : " + host);
			System.out.println(host+ "는 "+ ia2.length + "개의 IP 주소를 가지고 있습니다.");
			
			for (int i = 0 ; i< ia2.length; i++) {
				System.out.println((i+1) +"번 IP = " + ia2[i].getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		
	}

}
