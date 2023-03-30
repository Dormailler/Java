package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest4 {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		// william 사원보다 더 급여를 많이 받는 사원 이름, 급여 조회
		
		String sql = "select first_name f , salary from employees where salary > "
				+ "all(select salary from employees where first_name = ?) ";
		
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, "william");
		rs = pt.executeQuery();
		
		while(rs.next()) {
			//int id = rs.getInt("id");
			String first_name = rs.getString("f");
			Double salary = rs.getDouble("salary");
			System.out.printf("사원이름: %s 급여 : %f  \n",first_name,salary);
		}
		
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
