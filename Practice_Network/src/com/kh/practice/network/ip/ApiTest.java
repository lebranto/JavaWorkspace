package com.kh.practice.network.ip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Calendar;

public class ApiTest {
	public static void main(String[] args) {
		

		String key = "fc4d426d016c78402415e91aa7ea37b807532f44c3b34af6cf9e1e047c23cd92";
		String ser = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";

		try {
			ser += "?serviceKey=" + key;
			ser += "&stationName=" + URLEncoder.encode("종로구", "UTF-8");
			ser += "&dataTerm=" + "DAILY";

			System.out.println(ser);
			URL url = new URL(ser);
			URLConnection uc = url.openConnection();

			try (BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
					BufferedWriter bw = new BufferedWriter(new FileWriter("환경.xml"));) {
				String line = null;
				while ((line = br.readLine()) != null) {
					bw.write(line);
					bw.newLine();
				}

			}

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
