package chap15;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		// 회원관리 프로그램입니다. 사용가능메뉴
		// 1.회원가입 2.로그인 3.로그아웃 4.내정보보기 5.내정보수정 6.프로그램종료 번호 입력:
		Member mem = new Member();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("회원관리 프로그램입니다. 사용가능 메뉴는 다음과 같습니다.");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.로그아웃");
			System.out.println("4.내정보보기");
			System.out.println("5.내정보수정");
			System.out.println("6.종료");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: 
				mem.insert("test", 1234, "이자바", 25);
				break;
			case 2:
				mem.login("test", 1234);
				break;
			case 3:
				mem.logout();
				break;
			case 4:
				mem.getMyInfo();
				break;
			case 5:
				mem.setPassword(1111);
				break;
			case 6:
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			
		}
			
	}
		
		
		
}

}
