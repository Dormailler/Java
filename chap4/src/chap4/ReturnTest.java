package chap4;

public class ReturnTest {
	public static void mymethod() {
		System.out.println("mymethod 실행 시작");
		if(true) return;
		System.out.println("mymethod 실행 종료");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main시작");
		mymethod();
		System.out.println("main시작");
	}

}
