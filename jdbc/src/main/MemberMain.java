package main;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;
import view.MemberDeleteView;
import view.MemberInsertView;
import view.MemberSelectView;
import view.MemberSelectView2;
import view.MemberUpdateView;
import view.VIew;


//역할분담
public class MemberMain {

	public static void main(String[] args) {
		VIew view = null;
		while(true) {
			System.out.println("=== 회원 관리 프로그램을 시작합니다 ===");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원정보 수정");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 내정보 조회");
			System.out.println("5. 회원 리스트 조회");
			System.out.println("6. 검색 조회");
			
			System.out.println("0. 종료");
			System.out.print("원하는 메뉴의 번호를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			if(menu == 0) {
				System.exit(0);
			}else if(menu == 1) {
				view =  new MemberInsertView();
				view.input();
			}else if(menu == 2) {
				view =  new MemberUpdateView();
				view.input();	
				/* 1 >아이디 : xxxxx
				 * 수정항목 : 암호 | 이름 | 폰번호 | 이메일 
				 * 수정값 : 1111 | 변경이름 | ... 
				 * 
				 * 2> 아이디+암호 , 아이디+이름 , ....
				 * 3> MemberDTO 객체 생성(생성자 추가 정의 가능.)
				 * MemberDAO 의 int updateEmp(MemberDTO객체)  호출
				 * */
			}else if(menu == 3) {
				view = new MemberDeleteView();
				view.input();
				// 아이디, 암호 입력 - 
				// MemberDAO int deleteMember(String memberid, int pw)
				// select pw from c_member where memberid = ?
				// id,pw 일치 - delete from c_member where memberid = ? "정상적 탈퇴 처리"
				// pw 불일치 - "암호가 다릅니다 탈퇴 불가"
				// id 없음  - "가입된 적이 없습니다"
			}
			
			else if(menu == 4) {
				view = new MemberSelectView();
				view.input();
				// 아이디,암호 입력 --> MemberDAO getMember(String id, String pw)
				// id,pw 맞으면 모든 정보 조회 MemberDTO 객체 리턴 --> 조회정보 출력
				// id 존재하고 pw 다르면  MemberDTO 객체 리턴(아이디,암호x) --> "암호가 다릅니다. 본인 정보 조회 불가" 출력
				// id 존재하지 않으면 MemberDTO 객체 리턴(아이디x,암호x) --> "해당 아이디가 없습니다. 회원가입부터 하세요." 출력
			}
			
			else if(menu == 5){ // 아이디 이름 가입일 1페이지당 3명
				view = new MemberSelectView2();
				view.input();
				//MemberDAO dao = new MemberDAO();
				// INT getTotalMember() 호출
				//사용 가능한 페이지는 다음과 같습니다.
				// select count(*) from c_member; 1 2 3 4 4*3
				// 페이지번호 : 2
				// getPaigingMember(int )
				// 가입일 최근순서부터 정렬하여 2페이지에 3명씩 조회
				// 아이디 이름 가입일 * 3
				 
			}
			/*
			else if(menu == 6) {
				view = new MemberSelectView3();
				view.input();
				// 검색어 : sql
				select * from c_member
				where memberid like '%sql%'
				or name like '%sql%'
				or email like '%sql%'
			}*/
			
			
			/*	MemberSelectView-input
				아이디 : xxx
				암호 : xxx
				-- member 테이블 이미지 입력된 데이터들 
				중복 id, 암호 많다)
				테스트용 입력 id와 암호는 중복되지 않는 걸로 확인.
				
				MemberDAO - MemberDTO selectOneMember(String id, String password)
				1> MEMBER 테이블에서 ID, PASSWORD 같은 레코드 조회 ResulSet 결과를 --> MemberDTO 로 저장
				-- 출력
				   id가 member 존재하지 않으면 "회원가입부터 하세요." 출력
				   id  존재, 암호 다르면 "다시 입력하세요" 출력
				   
				
				*/
		}//while
		
	}//main

}

/*
 * 회원 관리 프로그램을 시작합니다
 * 1. 회원가입
 * 2. 회원정보 수정
 * 3. 회원 탈퇴
 * 4. 내정보 조회
 * 5. 회원 리스트 조회
 * 6. 종료
 * 원하는 메뉴의 번호를 입력하세요 : 
 *  
 *  */











