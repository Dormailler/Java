package book;

public class BookTest {

	public static void main(String[] args) {
		BookDAO bd = new BookDAO();
		BookDTO bt = new BookDTO("B004" , "HTML/CSS", "고길동", "2023-01-01", 38000, "서울출판사");
		bd.insertBook(bt);
		bd.selectBook();

	}

}
