 package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//http://localhost:8081/servlettest/login
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id,pw전달받아서 
		//request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String result = null;
		String[] subject = request.getParameterValues("subject");
		String subject_result = "";
		//id = servlet pw = 1234 인 경우에만 로그인 성공
		if(id.equalsIgnoreCase("servlet") && pw.equals("1234")) {
			result = "로그인성공";
		}else {
			result = "로그인실패";
		}
		for(String one:subject) {
			subject_result += one + ", ";
		}
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("전송한 아이디= " + id);
		out.println("전송한 암호= " + pw);
		out.println("전송한 과목= " + subject_result);
		out.println("로그인여부 = " + result);
	}

}
