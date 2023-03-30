package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		String sql = "insert into c_member values('" + args[0] + "', '" + args[1] + "', " + args[2] +
				", '" + args[3] + "', '" + args[4] + "', now())";
		Statement st = con.createStatement();
		int rowcount = st.executeUpdate(sql);
		System.out.println("회원가입행 갯수 = " + rowcount);
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
