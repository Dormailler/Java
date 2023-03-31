package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDTO;
import jdbc.DBInfo;

public class MemberDAO {
	//가입메소드
	public void insertMember(MemberDTO dto){
		Connection con = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		//System.out.println("연결성공");
		// id name pw phone email regtime
		String sql = "insert into c_member values(?,?,?,?,?,now())";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, dto.getMemberid()); //아이디
		pt.setString(2, dto.getName()); //이름
		pt.setInt(3, dto.getPw()); //암호
		pt.setString(4, dto.getPhone()); //폰
		pt.setString(5, dto.getEmail()); //이메일
		
		int rowcount = pt.executeUpdate();
		System.out.println("회원가입행 갯수 = " +rowcount);
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				//System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//수정메소드
	public void updateMember(MemberDTO dto){
		Connection con = null;
		String sql = null;
		PreparedStatement pt = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		//System.out.println("연결성공");
		// id name pw phone email regtime
		String colName = "";
		String colValue = "";
		if(dto.getPw()!=0) {
			colName = "pw";
			colValue = String.valueOf(dto.getPw());
		}
		else if(dto.getName() != null) {
			colName= "name";
			colValue = dto.getName();
		}
		
		else if(dto.getPhone() != null) {
			colName= "phone";
			colValue = dto.getPhone();
		}
		else if(dto.getEmail() != null) {
			colName= "email";
			colValue = dto.getEmail();
		}
		sql = "update c_member set " + colName + "= ? where memberid = ?";
		pt = con.prepareStatement(sql);
		pt.setString(1, colValue);
		pt.setString(2, dto.getMemberid()); //아이디
		int rowcount = pt.executeUpdate();
		System.out.println("회원가입행 갯수 = " +rowcount);
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				//System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//내정보조회메소드
	public MemberDTO getMember(String id, int pw) {
		Connection con = null;
		MemberDTO dto = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		
		String sql = "select memberid,name,pw,phone,email,date(regtime) from c_member where memberid = ?";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, id);
		ResultSet rs = pt.executeQuery();
		dto = new MemberDTO();
		if(rs.next()) { //true/false
			if(rs.getInt("pw") == pw) {
				dto = new MemberDTO(rs.getString("memberid"),rs.getString("name"),rs.getInt("pw"),
						rs.getString("phone"),rs.getString("email"),rs.getString("date(regtime)"));
			}
			else { // getmemberid != null getpw -> 0
				dto = new MemberDTO();
				dto.setMemberid(id);
			}
		} 
		else { //id가 없을때
			dto = new MemberDTO();
		}
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				con.close();
				//System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return dto;
	} //getMember end
	//삭제메소드
	public int deleteMember(String id, int pw){
		Connection con = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		
		String sql = "select pw from c_member where memberid = ?";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, id);
		ResultSet rs = pt.executeQuery();
		if(rs.next()) { //true/false
			if(rs.getInt("pw") == pw) {
				sql = "delete from c_member where memberid = ?";
				pt = con.prepareStatement(sql);
				pt.setString(1, id);
				return pt.executeUpdate();
			}
			else { // getmemberid != null getpw -> 0
				return 0;
			}
		} 
		else { //id가 없을때
			return -1;
		}
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				con.close();
				//System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	//리스트확인메소드
	public int getTotalMember(){
		Connection con = null;
		int total = 0;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		
		String sql = "select count(*) from c_member";
		PreparedStatement pt = con.prepareStatement(sql);

		ResultSet rs = pt.executeQuery();
		rs.next();
		total = rs.getInt(1);
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				con.close();
				//System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return (Integer)total/3 + 1;
	}
	public void getPaigingMember(int page){
		Connection con = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
		int start = (page-1)*3;
		String sql = "select memberid, name, regtime from c_member order by regtime limit ?,3";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setInt(1, start);
		ResultSet rs = pt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1) + ":" +rs.getString(2) + ":" + rs.getString(3));  
		}
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				con.close();
				//System.out.println("연결해제성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}// class end
