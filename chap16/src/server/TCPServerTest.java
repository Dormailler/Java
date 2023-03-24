package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class TCPServerTest {

	public static void main(String[] args) throws IOException {
		// port 0~65535 5000번 이내 지양 10000번이상사용
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[서버]가 10000번 포트에서 대기중입니다.");
		while(true) {
			Socket s = ss.accept();
			System.out.println("[서버]가 "+ s.getInetAddress().getHostAddress() +" 클라이언트와 연결되었습니다.");
			
			//클라이언트가 서버로 출력 3번
			//키보드로 이름 입력: xxx
			//		 나이 입력: xxx
			//		과정명 입력: xxx
			InputStream request = s.getInputStream();
			Scanner sc = new Scanner(request);
			String request_str = sc.next();
			String request_str1 = sc.next();
			String request_str2 = sc.next();
			System.out.println("[서버] " + request_str + " 를 전달받았습니다.");
			System.out.println("[서버] " + request_str1 + " 를 전달받았습니다.");
			System.out.println("[서버] " + request_str2 + " 를 전달받았습니다.");
			
			HashMap<String, Integer> titlemap = new HashMap();
			titlemap.put("자바", 20);
			titlemap.put("html", 25);
			titlemap.put("리엑트", 30);
			titlemap.put("스프링부트", 35);
			titlemap.put("mysql", 40);
			
			//title이 목록에 있으면 해당 나이가 같으면 "홍길동님은 자바 과정 수강 가능합니다."
			//title이 목록에 있으면 해당 나이가 같지 않으면 "홍길동님은 자바 과정 수강 불가능합니다."
			//title이 목록에 없으면  "홍길동님은 수강신청 불가능합니다."
			if(titlemap.containsKey(request_str2) == false) {
				System.out.println(request_str + "님은 수강신청 불가능합니다.");
			}else {
				if(titlemap.get(request_str2)== Integer.parseInt(request_str1)) {
					System.out.println(request_str + "님은 " + request_str2 + " 과정 수강 가능합니다.");
				}else {
					System.out.println(request_str + "님은 " + request_str2 + " 과정 수강 불가능합니다.");
				}
			}
			OutputStream os = s.getOutputStream(); // 1바이트단위 
			// String -2바이트 1문자를 여러개 -> byte[]
			String response = "저도 안녕합니다.\n";
			byte[] request_byte = response.getBytes();
			os.write(request_byte);
			s.close();
			System.out.println("[서버]가 클라이언트와 연결 해제되었습니다.\n");
			
		}
		
	}

}
