package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberInsertView implements VIew {

	@Override
	public void input() {
	//c_member테이블 가입 저장 정보 아이디 암호 이름 폰 이메일 1 member1 1111 김회원 010-9876-5555 member1@a.com
		//c_member테이블 가입 저장 정보 아이디 암호 이름 폰 이메일 1 member1 1111 김회원 010-9876-5555 member1@a.com
		Scanner c = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = c.next();
		System.out.println("암호 입력 : ");
		int pw = c.nextInt();
		System.out.println("이름 입력 : ");
		String name = c.next();
		System.out.println("폰번호 입력 : ");
		String phone = c.next();
		System.out.println("이메일 입력 : ");
		String email = c.next();
		MemberDTO dto = new MemberDTO();
		dto.setMemberid(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		MemberDAO dao = new MemberDAO();
		dao.insertMember(dto);
		System.out.println("회원가입 정상 처리");
	}
}
