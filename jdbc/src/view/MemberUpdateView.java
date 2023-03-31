package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberUpdateView implements VIew {

	@Override
	public void input() {
	//c_member테이블 가입 저장 정보 아이디 암호 이름 폰 이메일 1 member1 1111 김회원 010-9876-5555 member1@a.com
		Scanner c = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = c.next();
		System.out.println("수정항목 입력 : ");
		String update_name = c.next();
		System.out.println("수정값 입력 : ");
		String value = c.next();

		MemberDTO dto = new MemberDTO();
		dto.setUpdate_name(update_name);
		dto.setMemberid(id);
		
		switch (update_name) {
		case "이름": {
			dto.setName(value);
			break;
		}
		case "암호":{
			dto.setPw(Integer.parseInt(value));
			break;
		}
		case "폰번호": {
			dto.setPhone(value);
			break;
		}
		case "이메일": {
			dto.setEmail(value);
			break;
		}
		}

		MemberDAO dao = new MemberDAO();
		dao.updateMember(dto);
		System.out.println("정보수정 정상 처리");
	}
	
}
