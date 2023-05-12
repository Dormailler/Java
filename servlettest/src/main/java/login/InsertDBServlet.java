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
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import dao.MemberDAO;
import dto.MemberDTO;
//http://localhost:8081/servlettest/login
@WebServlet("/insertdb")
public class InsertDBServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id,pw전달받아서 
		//request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

//		Date date = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String regtime = dateFormat.format(date);
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO(id,name,Integer.parseInt(pw),phone,email,"now()");
		// id, phone 조회 먼저 (re.next() - false)
		dao.insertMember(dto);
		
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("<h1><a href='loginform_db.html'>로그인</a></h1>");
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
