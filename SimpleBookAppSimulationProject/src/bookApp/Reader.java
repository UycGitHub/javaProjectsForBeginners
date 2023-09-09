package bookApp;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;

public class Reader {
	//fields:
	private String nameString;
	private char sex;
	ArrayList<Book> readBooks  = new ArrayList<Book>();
	private static LocalDate birthDate;
	
	
	//methods:
	
	public Reader(String nameString, char sex, LocalDate birthDate) {
		this.nameString = nameString;
		this.sex = sex;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return nameString;
	}
	
	public static int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }
	
	public char getSex() {
		return sex;
	}
	
	public void getReadBooks() {
		for (Book book : readBooks) {
			System.out.println(book.getBookName());
		}
	}
	
	public void getReadBooks(int i) {
		System.out.println(readBooks.get(i).getBookName());
	}
	
	public void addReadBook(Book book) {
		try { 
			  readBooks.add(book);
			  System.out.println("Kitap okuma listenize eklendi.");
		}
		catch (Exception e) {
			System.out.println("Kitap okuma listenize eklenemedi, hata mesajı:" + e.getMessage());
		}
	}
	
	
	
}
