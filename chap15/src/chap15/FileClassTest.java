package chap15;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileClassTest {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		File f = new File(input);
		if(f.exists()){
			if(f.isFile()) { // 파일
				System.out.println("파일읽기여부 = "+ f.canRead());
				System.out.println("파일쓰기여부 = "+ f.canWrite());
				System.out.println("파일실행여부 = "+ f.canExecute());
				System.out.println("경료 = "+ f.getCanonicalPath());
				System.out.println("크기(byte단위) = "+ f.length());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초에 수정");
				System.out.println("파일최종수정시각 = "+ sdf.format(new Date(f.lastModified())));
			}
			else { // 디렉토리
				System.out.println("경료 = "+ f.getCanonicalPath());
				String[] details = f.list();
				for(String s : details) {
					File f1 = new File(s);
					String result = f1.isFile()? " 파일입니다." : " 디렉토리입니다."; 
					System.out.println(s + result);
				}
			}
		}
		else {
			System.out.println(input + " 이름의 파일이나 디렉토리는 존재하지 않습니다.");
		}

	}

}
