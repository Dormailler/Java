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
 * Servlet implementation class LogoutSessionServlet
 */
public class LogoutSessionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//xx 회원님 로그아웃하셨습니다. 
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(session.getAttribute("sessionid") != null) {
			out.println("<h3>" + session.getAttribute("sessionid") 
			+ " 회원님 로그아웃하셨습니다. 다시 로그인하셔야 정상 사용 가능합니다.</h3>");
		}
		session.removeAttribute("sessionid");
		//session 저장 변수가 sessionid 1개밖에 없다
		//session.invalidate();
	}

}
