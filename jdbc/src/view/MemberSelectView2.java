package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberSelectView2 implements VIew {

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		int total = dao.getTotalMember();
		System.out.println("사용 가능한 페이지는 다음과 같습니다.");
		for(int i = 1 ; i <= total; i ++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("페이지 번호 입력");
		int page = sc.nextInt();
		if(page > total) {
			System.out.println("페이지 번호를 초과하였습니다.");
		}
		else dao.getPaigingMember(page);
		
		
		
		
		
		
	}
}
