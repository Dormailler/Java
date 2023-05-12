package first;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/first")
public class firstServlet extends HttpServlet {
	
	
	@Override
	public void destroy() {
		System.out.println("--destroy 호출--");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("--init 호출(수정)--");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--doGet 호출--");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello Servlet</h1>");
	}

}
