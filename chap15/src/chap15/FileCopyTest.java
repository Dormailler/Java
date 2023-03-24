package chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1]);
//			int line = 1;
//			while(true) {
//				int i = fr.read();
//				if(i == -1) break;
//				if(i == '\n') {
//					fw.write(line + ":");
//					line += 1;
//				}
//				else fw.write(i);
//			}
			int line = 1;
			Scanner sc = new Scanner(fr);
			while(true){
				String result = sc.nextLine(); // \n 1줄로 인식하고 이전입력내용 저장
				if(sc.hasNextLine() == false)break;
				fw.write(line++ + ": " +  result + "\n");				
			}
			
			
		}
		//catch(FileNotFoundException e) {}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				fw.close();
			}catch(IOException e){}
		}

	}

}
