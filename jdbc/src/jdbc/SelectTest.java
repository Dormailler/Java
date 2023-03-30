package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		
		String sql = "select * from emp_copy";
		st = con.createStatement();
		rs = st.executeQuery(sql);
		System.out.println(rs.toString());
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");
			int dept_id = rs.getInt("dept_id");
			String hire_date = rs.getString("hire_date");
			System.out.printf("사번 : %d 이름: %s 급여 : %f 부서 : %d 입사일 : %s \n",id,name,salary,dept_id,hire_date);
		}
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
				System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
