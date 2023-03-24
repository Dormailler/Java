package chap15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {

	public static void main(String[] args){
		System.out.println("학생 정보를 입력하세요(이름 국어 영어 수학 순서로 입력하세요)");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int sum = kor+eng+mat;
		System.out.println(sum);
		double avg = sum/3.0 ;
		try {
			FileWriter fw = new FileWriter("src/chap15/score.txt",true); // true하면 추가로씀
			fw.write(name + " " + kor + " " + eng + " " + mat+  " " + sum + " " + avg +  "\n"); // 'abcd'
			fw.close(); 
		} catch (IOException e) {
			System.out.println("출력도중예외발생");
		}

	}

}
