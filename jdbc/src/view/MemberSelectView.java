package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberSelectView implements VIew {

	@Override
	public void input() {
	//c_member테이블 가입 저장 정보 아이디 암호 이름 폰 이메일 1 member1 1111 김회원 010-9876-5555 member1@a.com
		//c_member테이블 가입 저장 정보 아이디 암호 이름 폰 이메일 1 member1 1111 김회원 010-9876-5555 member1@a.com
		Scanner c = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = c.next();
		System.out.println("암호 입력 : ");
		int pw = c.nextInt();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMember(id,pw);
		if(dto.getMemberid() != null) {
			if(dto.getPw() != 0) {
				System.out.println(dto.toString()); 
			}
			else {
				System.out.println("암호가 다릅니다. 본인 정보 조회 불가");
			}
		}
		else {
			System.out.println("해당 아이디가 없습니다. 회원가입부터 하세요.");
		}
		dto.toString();
		
	}
}
