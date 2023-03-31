package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.DBInfo;


public class BookDAO {
	
	public void insertBook(BookDTO BookDTO) {
		Connection con = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);

		String sql = "insert into book values(?,?,?,?,?,?)";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, BookDTO.getBookNo());
		pt.setString(2, BookDTO.getBookTitle());
		pt.setString(3, BookDTO.getBookAuthor()); 
		pt.setString(4, BookDTO.getBookYear()); 
		pt.setInt(5, BookDTO.getBookPrice()); 
		pt.setString(6, BookDTO.getBookPublisher());
		pt.executeUpdate();
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 여부를 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void selectBook() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.url,DBInfo.account,DBInfo.password);
	
		String sql = "select bookNo 도서번호,bookTitle 도서제목,bookAuthor 저자,year(bookYear) 발행연도,bookPrice 가격,bookPublisher 출판사 from book";
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.printf("%s\t%s\t%s\t%s\t%d\t%s\n",
					rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
		}
		
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} 
}
