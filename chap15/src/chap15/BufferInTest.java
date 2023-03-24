package chap15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferInTest {

	public static void main(String[] args) throws IOException {
		long starttime = 0, endtime = 0;
		FileReader fr = new FileReader("src/chap15/BufferInTest.java");
		//현재시간
		starttime = System.currentTimeMillis();
		while(true) {
			int i = fr.read();
			if(i == -1) break;
		}
		endtime = System.currentTimeMillis();
		System.out.println("버퍼 미사용시 소요시간 = " + (endtime-starttime) + "ms");
		
		fr = new FileReader("src/chap15/BufferInTest.java");
		BufferedReader br = new BufferedReader(fr);
		//현재시간
		starttime = System.currentTimeMillis();
		while(true) {
			int i = br.read();
			if(i == -1) break;
		}
		endtime = System.currentTimeMillis();
		System.out.println("버퍼 사용시 소요시간 = " + (endtime-starttime) + "ms");
		fr.close();

	}

}
