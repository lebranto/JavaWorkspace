package com.kh.chap03_.protocol.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientRun {
	
	public static void main(String[] args) {
		
		
		try {
			InetAddress server = InetAddress.getByName("localhost");
			int serverPort = 30001;
			
			
			// 매개 변수를 넣지 않으면 미사용 중인 랜덤 포트번호 생성
			DatagramSocket socket = new DatagramSocket();
			String message = "데이터 전송 요청";
			
			byte [] sendData = message.getBytes();
			
			DatagramPacket sendPacket = 
					new DatagramPacket(sendData, sendData.length,server,serverPort);
			
			socket.send(sendPacket);
			
			// 요청메서지 전송후 데이터 수신 대기
			byte[] data = new byte[1024];
			DatagramPacket receiveData = new DatagramPacket(data, data.length);
			socket.receive(receiveData);
			
			// 받은 바이트 값을 문자열로 변환
			String receive = new String(receiveData.getData(), 0 , receiveData.getLength());
			System.out.println(receive);
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
