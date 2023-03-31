package book;

public class BookDTO {
	String bookNo,bookTitle,bookAuthor,bookYear;
	int bookPrice;
	String bookPublisher;
	public BookDTO(String bookNo, String bookTitle, String bookAuthor, String bookYear, int bookPrice,
			String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}
	public String getBookNo() {
		return bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public String getBookYear() {
		return bookYear;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	
}
