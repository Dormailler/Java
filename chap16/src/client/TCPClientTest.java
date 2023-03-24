package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("172.30.48.1",10000);
		String serverip = s.getInetAddress().getHostAddress();
		System.out.println("(클라이언트) "+ serverip +" 로 접속 완료했습니다.");
		
		OutputStream os = s.getOutputStream(); // 1바이트단위 
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름 입력: ");
		String name = input.next() + " ";
		System.out.println("나이 입력: ");
		String age = input.next() + " ";
		System.out.println("과정명 입력: ");
		String sub = input.next() + " ";
		
		
		// String -2바이트 1문자를 여러개 -> byte[]
//		String request = "안녕하세요.\n";
//		byte[] request_byte = request.getBytes();
		os.write(name.getBytes());
		os.write(age.getBytes());
		os.write(sub.getBytes());
		
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String request_str = sc.nextLine();
		System.out.println("(클라이언트) " + request_str + " 를 전달받았습니다.");
		
		s.close();
		System.out.println("(클라이언트)서버 접속 해제했습니다.");
	}
}
