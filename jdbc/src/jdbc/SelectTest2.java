package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest2 {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		
		String sql = "select name,salary,dept_id from emp_copy where salary between ? and ? and dept_id = ?";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setDouble(1, 5000);
		pt.setDouble(2, 10000);
		pt.setInt(3, 50);
		rs = pt.executeQuery();
		
		while(rs.next()) {
			//int id = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");
			int dept_id = rs.getInt("dept_id");
			//String hire_date = rs.getString("hire_date");
			System.out.printf("이름: %s 급여 : %.2f 부서 : %d \n",name,salary,dept_id);
		}
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				con.close();
				System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
