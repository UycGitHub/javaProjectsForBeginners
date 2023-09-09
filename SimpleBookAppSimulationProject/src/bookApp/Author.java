package bookApp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Author {
	//fields:
	private String nameString;
	ArrayList<Book> writtenBooks  = new ArrayList<Book>();
	private static LocalDate birthDate;
	
	
	//methods:
	
	public Author(String name, LocalDate bDate) {
		this.nameString = name;
		this.birthDate  = bDate;
	}
	
	public String getName() {
		return nameString;
	}
	
	public void getWrittenBooks() {
		for (Book book : writtenBooks) {
			System.out.println(book.getBookName());
		}
	}
	
	public void getWrittenBooks(int i) {
		System.out.println(writtenBooks.get(i).getBookName());
	}
	
	public void addWrittenBook(Book book) {
		try { 
			  writtenBooks.add(book);
			  System.out.println("Kitap sisteme başarıyla eklendi.");
		}
		catch (Exception e) {
			System.out.println("Kitap sisteme eklenemedi, hata mesajı:" + e.getMessage());
		}
		
	}//end of the method
	
	public static int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }
	
	
}
