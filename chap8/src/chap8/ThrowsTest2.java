package chap8;

import java.io.IOException;

class B{
	void m1(int i) {
		System.out.println(100/i);
	}
	void m2(String name) {
		//특정 클래스에 포함된 변수나 메소드 생성자 정보 출력
		try {
		Class c = Class.forName(name);
		System.out.println(c);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Test.class가 존재하지 않습니다.");
		}
	}
	void m3(int i) throws IOException{
		if(i>=0) {
			throw new IOException();
		}
	}
}		
public class ThrowsTest2 {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m2(args[0]);
		try {
		b1.m3(0);
		}catch(IOException e) {
			System.out.println("1이면 입출력할 수 없습니다.");
		}	
	}

}
