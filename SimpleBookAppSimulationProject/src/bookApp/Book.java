package bookApp;

public class Book {
	//fields:
	private Author author;
	private String bookNameString;
	private int pageNumber;
	private String categoryString;
	
	//methods:
	
	public Book( Author author, String bookNameString, int pageNumber,String categoryString) {
		this.author =author;
		this.bookNameString =  bookNameString;
		this.pageNumber =  pageNumber;
		this.categoryString =  categoryString;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public String getBookName() {
		return bookNameString;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public String getCategory() {
		return categoryString;
	}
	
	
}
