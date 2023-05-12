package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbc.DBInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import dao.MemberDAO;
import dto.MemberDTO;
//http://localhost:8081/servlettest/login
@WebServlet("/logindb")
public class LoginDBServlet extends HttpServlet {
	String result = "";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id,pw전달받아서 
		//request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String role = request.getParameter("role");
		if(role.equals("user")) {

			MemberDAO dao = new MemberDAO();
			MemberDTO dto = dao.getMember(id, Integer.parseInt(pw));
			if(dto.getMemberid() != null && dto.getPw() !=0) {
				result = "<h1 style='color:green'>로그인성공</h1>";
			}else if(dto.getMemberid() != null && dto.getPw() == 0) {
				result = "<h1 style='color:red'>암호 확인하세요</h1><a href='loginform_db.html'>로그인하러 가기</a>";
			}else if(dto.getMemberid() == null){
				result = "<h1 style='color:red'>회원가입부터 하세요</h1><a href='insertform_db.html'>회원가입하러 가기</a>";
			}
		} // if - user end
		else { // 관리자 
			MemberDAO dao = new MemberDAO();
			ArrayList<MemberDTO> list = dao.getNonPagingMember();
			//table태그로 브라우저 출력
			result = "<table border=3>";
			for(MemberDTO dto:list) {
				result += "<tr><td>" + dto.getMemberid() + "</td><td>" + dto.getName() + "</td><td>"
						+ dto.getEmail() + "</td><td>" + dto.getPhone() + "</td></tr>";
			}
			result += "</table>";
		}
	
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("전송한 아이디= " + id);
		out.println("전송한 암호= " + pw);
		out.println("로그인여부 = " + result);
	}

}

/*
 // c_member테이블 id 존재, pw 일치하면 로그인성공
		// c_member테이블 id 존재, pw 불일치 암호를 확인하세요
		// c_member테이블 id 미존재 , 회원가입부터 하세요
		Connection con = null;
		String result = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection
				(DBInfo.url, DBInfo.account, DBInfo.password);
		
		System.out.println("연결성공");
		//SQL 전송
		String sql = "select * from c_member where memberid = ?";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, id);
		ResultSet rs = pt.executeQuery();
		//c_member테이블 - memberid (primary key- 중복x, null x) 0개 or 1개
		if(rs.next() == true) {
			int dbpw = rs.getInt("pw");
			if(dbpw == (Integer.parseInt(pw))) {
				result = "<h1 style='color:green'>로그인성공</h1>";
			}else {
				result = "<h1 style='color:red'>암호 확인하세요</h1>";
			}
		}else {
			result = "<h1 style='color:red'>회원가입부터 하세요</h1>";
		}
		
		con.close();
		System.out.println("연결해제성공");
		}catch(Exception e) {
			e.printStackTrace();
		} 
 */
