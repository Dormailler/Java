package forward;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import dto.MemberDTO;

public class ForwardTest2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<MemberDTO> list = (ArrayList<MemberDTO>)request.getAttribute("memberlist");
		
		//table태그로 브라우저 출력
		String result = "<table border=3>";
		for(MemberDTO dto:list) {
			result += "<tr><td>" + dto.getMemberid() + "</td><td>" + dto.getName() + "</td><td>"
					+ dto.getEmail() + "</td><td>" + dto.getPhone() + "</td></tr>";
		}
		result += "</table>";
		ServletContext context = request.getServletContext();
		System.out.println(context.getInitParameter("test")); //emp
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>ForwardTest2 클래스입니다.</h1>");
		out.println("<h1>입력하신 파라미터는 " + request.getParameter("id") + "</h1>");
		out.println("<h1>대문자 변경한 값은 " + request.getAttribute("upperid") + "</h1>");
		out.println(result);
	}

}
