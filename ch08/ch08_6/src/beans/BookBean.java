package beans;

public class BookBean {
	int bookId; // 书号
	String bookName; // 书名
	String author; // 作者
	float price; // 价格
	String publisher; // 出版社

	public BookBean() {
		bookId = 1000;
		bookName = "Java Web 开发";
		author = "Mary";
		price = 50;
		publisher = "机械工业出版社";
	}

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
