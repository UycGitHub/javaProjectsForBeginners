package bookApp;

import java.time.LocalDate;

public class bookAppTest {

	public static void main(String[] args) {
		Author writer1 = new Author("Kemal Tahir", LocalDate.of(1969, 01, 01));
		Book book1 = new Book(writer1, "Esir Şehir İstanbul", 342, "Macera");
		Book book2 = new Book(writer1, "Esir Şehir İstanbul - 2", 310, "Macera");
		Reader reader1 = new Reader("Umut Yusuf Çınar", 'E', LocalDate.of(2000, 12, 8));
		Reader reader2 = new Reader("Alperen Kuzhan", 'E', LocalDate.of(2000, 11, 11));
		
		writer1.addWrittenBook(book1);
		writer1.addWrittenBook(book2);
		reader1.addReadBook(book1);
		reader2.addReadBook(book2);
		
		writer1.getWrittenBooks(0);
		reader1.getReadBooks(0);
	}

}
