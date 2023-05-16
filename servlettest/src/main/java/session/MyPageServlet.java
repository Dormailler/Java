package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

class MyPageDTO{
	String id,pw,name,email,phone;

	public MyPageDTO(String id, String pw, String name, String email, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	
}
public class MyPageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 내정보 로그인 먼저 되어야함
		MyPageDTO dto = new MyPageDTO("sessiontest", "1234", "김길벗", "gul@but.com", "010-4567-8900");
		// 로그인 확인
		HttpSession session = request.getSession();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//로그인한 상태다
		if(session.getAttribute("sessionid") != null) {
			out.println("<h3>내정보 보기</h3>");
			out.println("<h3>아이디 =" + dto.id + "</h3>");
			out.println("<h3>이름 =" + dto.name + "</h3>");
			out.println("<h3>이메일 =" + dto.email + "</h3>");
			out.println("<h3>폰번호 =" + dto.phone + "</h3>");
		}else { // 로그인 안한 상태다(브라우저 종료후 재시작)
			out.println("<h3><a href='loginsession?id=sessiontest&pw=1234'>로그인</a>하지않으면 회원정보를 보여줄 수 없습니다.</h3>");
		}
	}

}
