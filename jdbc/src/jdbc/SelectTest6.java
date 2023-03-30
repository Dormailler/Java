package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class Emp{
	int id;//사번
	String name;//이름
	double salary;//급여
	int dept_id;//부서코드
	String hire_date;//입사일
	@Override
	public String toString() {
		return id + "-" + name + "-" + salary + "-" + dept_id + "-" + hire_date;
	}
	
}
class JDBCSelect{
	public ArrayList getEmp(String name) {
		ArrayList<Emp> list = new ArrayList();
		Connection con = null;
		ResultSet rs = null;
		Statement st = null;
		PreparedStatement  pt = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		System.out.println("연결성공");
		// william 사원보다 더 급여를 많이 받는 사원 이름, 급여 조회
		
		String sql = "select employee_id, first_name f , salary s, department_id, date_format(hire_date, '%Y년도%m월%d일') "
				+ "from employees where salary > all(select salary from employees where first_name = ?) ";
		
		pt = con.prepareStatement(sql);
		pt.setString(1, name);
		rs = pt.executeQuery();
		
		while(rs.next()) {
			Emp e = new Emp();
			e.id = rs.getInt(1);
			e.name = rs.getString("f");
			e.salary = rs.getDouble("s");
			e.dept_id = rs.getInt(4);
			e.hire_date = rs.getString(5);
			
			//System.out.printf("사원이름: %s 급여 : %f  \n",empname,salary);
			list.add(e);
		}
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pt.close();
				con.close();
				System.out.println(list.size());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("연결해제성공");
		}
		return list; 
	}
}
public class SelectTest6 {

	public static void main(String[] args) {
		JDBCSelect jdbc = new JDBCSelect();
		ArrayList<Emp> list = jdbc.getEmp("william");
		for(Emp e : list) {
			System.out.println(e);
		}
	}

}
