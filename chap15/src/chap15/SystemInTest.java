package chap15;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
	public static void main(String[] args) {
		System.out.println("키보드 입력 대기중입니다.");
		try {
			InputStreamReader isr = new InputStreamReader(System.in); 
			while(true) { // os ctrl_z == -1 enter 13
				//int i = System.in.read(); //키보드 1개값 입력.
				int i = isr.read(); //2바이트 읽어옴
				if(i == 'x') break;
				System.out.println((char)i);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
