package array;

public class Book {
	private int bookId;
	private String bookName;
	private double bookPrice;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Book(int bookId, String bookName, double bookPrice) {
		super();
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder();
		builder.append("Book [bookId= ");
		builder.append(bookId);
		builder.append(", bookName= ");
		builder.append(bookName);
		builder.append(", bookPrice= ");
		builder.append(bookPrice);
		builder.append("]");
		return builder.toString();
	}

}
