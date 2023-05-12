package forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import dao.MemberDAO;
import dto.MemberDTO;

/**
 * Servlet implementation class ForwarTest1
 */
public class ForwarTest1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청데이터
		String id = request.getParameter("id");
		//대문자변경
		request.setAttribute("upperid", id.toUpperCase());
		// 추가 처리
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.getNonPagingMember();
		request.setAttribute("memberlist", list);
		
		//응답 구현하더라도 forward 삭제(무시)하고 이동
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>ForwardTest1 클래스입니다.</h1>");
		out.println("<h1>입력하신 파라미터는 " + id +"</h1>");
		// 응답 ForwardTest2로 이동
		RequestDispatcher rd = request.getRequestDispatcher("/forward2");
		rd.forward(request, response);
	}

}
