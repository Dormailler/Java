package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginSessionServlet
 */
@WebServlet("/loginsession")
public class LoginSessionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// id = sessiontest 이고 pw = 1234 이면 세션에 로그인아이디 저장 
		// member테이블에서 로그인사용자 확인 상태 가정
		HttpSession session = request.getSession();
		System.out.println(session.isNew());
		System.out.println(session.getId());
		System.out.println(session.getMaxInactiveInterval()); //초단위 설정분단위
		
		if(id != null && pw != null) {
			if(id.equalsIgnoreCase("sessionTest")&&pw.equals("1234")) {
				// 세션 id 저장
				// 브라우저 열고 최초 /loginsession 요청시 세션객체 생성-리턴(저장정보 x) 
				session.setAttribute("sessionid", id);
				//session.setAttribute("sessionpw", pw);
			}
		}
		
//		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(session.getAttribute("sessionid") != null ) {
			out.println("<h1>사용 가능한 메뉴는 다음과 같습니다</h1>");
			out.println("<h1><a href='bank'>은행앱 가기</a></h1>");
			out.println("<h1><a href='mypage'>내정보 보러가기</a></h1>");
			out.println("<h1><a href='logout'>로그아웃하러 가기</a></h1>");
		}else {
			out.println("<h1>로그인한 적이 없습니다.</h1>");
		}
		
		
	}

}
