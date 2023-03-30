package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectTest3 {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		
		String sql = "select sum(salary) sums from emp_copy";
		PreparedStatement pt = con.prepareStatement(sql);
		rs = pt.executeQuery();
		rs.next();
		System.out.println(rs.getDouble("sums"));
		
		sql = "select * from emp_copy";
		pt = con.prepareStatement(sql);
		rs = pt.executeQuery();
		// rs 컬럼명 , 컬럼타입, 컬럼갯수
		ResultSetMetaData rsmd = rs.getMetaData();
		int col_cnt = rsmd.getColumnCount();
		for(int i = 1; i <= col_cnt; i++) {
			String col_name = rsmd.getColumnName(i);
			String type = rsmd.getColumnTypeName(i);
			System.out.println(i + " 번째 컬럼정보 ="+col_name + ":" + type);
		}

//		while(rs.next()) {
//			for(int i = 1; i <= 3; i++) {
//				System.out.print(rs.getString(i) + ":");
//			}
//			System.out.println();
//		}
		/*
		while(rs.next()) {
			//int id = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");
			int dept_id = rs.getInt("dept_id");
			//String hire_date = rs.getString("hire_date");
			System.out.printf("이름: %s 급여 : %.2f 부서 : %d \n",name,salary,dept_id);
		}
		*/
		
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
