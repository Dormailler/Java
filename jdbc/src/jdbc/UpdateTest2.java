package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		//emp_copy 테이블 update 키보드로
		// 수정할 사번 : 
		// 수정할 이름 :
		// 인상할 급여 : 
		// delete from emp_copy where 
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 사번:");
		int id = sc.nextInt(); 
		System.out.print("수정할 이름:");
		String name = sc.next();
		System.out.print("수정할 급여:");
		double psal = sc.nextDouble();
		System.out.println(id + name + Double.toString(psal));
		String sql = "update emp_copy set name =? , salary = salary + ? where id =?";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, name);
		pt.setDouble(2, psal);
		pt.setInt(3, id);
		int rowcount = pt.executeUpdate();
		System.out.println("수정행 갯수 = " + rowcount);
		
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
