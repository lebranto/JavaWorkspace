package com.kh.chap03_.protocol.udp.server.run;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerRun {
	
	
	/*
	 * UDP
	 * 	- 비연결형 프로토콜로 클라이언트가 데이터를 받았는지 아닌지 상관하지 않는 방식의 프로토콜
	 * 	- 데이터 전송의 신뢰도가 낮으며, 데이터 손실이 발생할 수 있다.
	 * 	- 번거로운 확인 절차(3 Way Handshake)를 없앰으로써, 신속하게 데이터를 전달 할 수 있다.
	 * 	- 빠른 데이터 전송이 중요한 실시간 스트리밍, 게임 등에서 사용된다.
	 * 
	 * 
	 * DatagramSocket
	 * 	- UDP 통신에서 DatagramPacket을 보내고 받는데 사용하는 클래스
	 * 	- UDP는 DatagramPacket 단위로 데이터를 송/수신 할 수 있다.  
	 * 
	 * DatagramPacket
	 * 	- UDP 통신시 데이터를 포장하는 클래스
	 * 	- 전송할 데이터(byte[])와 호스트의 ip주소 및 포트 번호를 함께 전송한다.
	 * 
	 */
	
	
	public static void main(String[] args) {
		// 서버 포트 번호지정
		int serverPort = 30001;
		
		try {
			
			// 서버소켓 생성
			DatagramSocket socket = new DatagramSocket(serverPort);
			
			// 전송할 byte배열 준비
			
			byte[] data = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			// 클라이언트가 연결요청을 보낼때까지 대기.
			socket.receive(packet);
			// 패킷 내부에 누군가 데이터를 전송할떄 까지 대기

			// 데이터를 전송한 클라이언트의 ip주소와 port번호 확인하기
			InetAddress clientAddress = packet.getAddress();
			System.out.println("clientAddress : " + clientAddress.getHostAddress()+
					":" + packet.getPort());
			
			String str = "UDP Server에서 전송하는 데이터";
			
			byte [] serverData= str.getBytes();
			//문자열을 바이트로 정렬
			DatagramPacket packet2 = new DatagramPacket(serverData,serverData.length
					, clientAddress, packet.getPort());
			//클라이언트에서 요청받은 데이터를 요청한 아이피 주소와 포트로 보낸다.
			
			socket.send(packet2);
			// 클라이언트에서 오류가나도 서버에서는 에러는 나지 않는다.
			
			socket.close();
			
			
			
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

}
