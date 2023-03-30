package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		// id name pw phone email regtime
		String sql = "insert into c_member values(?,?,?,?,?,now())";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, args[0]); //아이디
		pt.setString(2, args[1]); //이름
		pt.setInt(3, Integer.parseInt(args[2])); //암호
		pt.setString(4, args[3]); //폰
		pt.setString(5, args[4]); //이메일
		int rowcount = pt.executeUpdate();
		System.out.println("회원가입행 갯수 = " +rowcount);
		
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
