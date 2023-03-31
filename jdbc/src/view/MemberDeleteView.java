package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberDeleteView implements VIew {

	@Override
	public void input() {
		Scanner c = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = c.next();
		System.out.println("암호 입력 : ");
		int pw = c.nextInt();
		
		MemberDAO dao = new MemberDAO();
		int num = dao.deleteMember(id,pw);
		if(num == 1) {
			System.out.println("정상적으로 탈퇴 처리되었습니다.");
		}
		else if(num == 0) {
			System.out.println("암호가 다릅니다. 탈퇴가 불가능합니다.");
		}
		else if(num == -1) {
			System.out.println("가입된 적이 없습니다.");
		}
	}
}
