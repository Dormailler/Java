package jdbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Servlet implementation class DataSourceServlet
 */
public class DataSourceServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//connectionpool 미사용
		try {
//		Class.forName(DBInfo.driver);
//		long starttime = System.currentTimeMillis();
//		for(int i=1; i<=5000; i++) {
//			Connection con = DriverManager.getConnection
//					(DBInfo.url, DBInfo.account, DBInfo.password);
//			System.out.println(i + "번째 mysql db 연결 성공");
//			con.close();
//		}
//		long endtime = System.currentTimeMillis();
//		System.out.println((endtime-starttime) + "(1/1000초단위) 소요"); //20초
			//connectionpool 사용
		Context context = new InitialContext(); //context.xml 설정내용 객체
		Context envContext = (Context)context.lookup("java:/comp/env"); //자바연관설정 찾기
		DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
		long starttime = System.currentTimeMillis();
		for(int i=1; i<=5000; i++) {
			Connection con = ds.getConnection();
			System.out.println(i + "번째 mysql datasource로부터(connection fool) 성공");
			con.close();
		}
		long endtime = System.currentTimeMillis();
		System.out.println((endtime-starttime) + "(1/1000초단위) 소요"); //0.2초
		}catch(Exception e) {}
		
		
	}

}
