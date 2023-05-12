package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String su1 = request.getParameter("su1");
		String su2 = request.getParameter("su2");
		int su1_int =0, su2_int = 0;
		if(su1 != null && su1 != "") {
			su1_int = Integer.parseInt(su1);
		}
		if(su1 != null && su1 != "") {
			su2_int = Integer.parseInt(su2);
		}
		String op = request.getParameter("operator");
		String result = su1 + op + su2 + "=";
		if(op.equals("+")) {
			result += (su1_int+su2_int);
		}else if(op.equals("-")) {
			result += (su1_int-su2_int);
		}else if(op.equals("*")) {
			result += (su1_int*su2_int);
		}else if(op.equals("/") && su2_int != 0) {
			result += (su1_int/su2_int);
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(result);
	}
	
}
