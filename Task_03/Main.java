package Task_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		//закоменчен хардкорный вариант решени€ части задани€ без Stream
		Library MyLibrary = new Library();
		Util.bookAdd(MyLibrary.getLibrary(), new Book (25, "Tolkien", 2005, 400, 1000, "Normal", "Lord"));
		Util.bookAdd(MyLibrary.getLibrary(), new Book (190, "Tolkien", 2008, 325, 278, "Hard", "Silmar"));
		Util.bookAdd(MyLibrary.getLibrary(), new Book (165, "Azimov", 1987, 120, 10, "Normal", "What?"));
		Util.bookAdd(MyLibrary.getLibrary(), new Book (234, "Korotkevich", 1976, 365, 55, "Soft", "Kalasy"));
		Util.bookAdd(MyLibrary.getLibrary(), new Book (12, "Aleksievich", 2019, 100, 100, "Normal", "Baby"));
		
		System.out.println(" ниги по автору: ");
		List <Book> resultLibraryAuthor = new ArrayList<Book>();
		Stream <Book> streamAuthor = MyLibrary.getLibrary().stream();
		Stream <Book> filteredAuthor = streamAuthor.filter(Book -> Book.getAuthor().equals("Tolkien"));
		filteredAuthor.forEach(Book -> resultLibraryAuthor.add(Book));
		Util.PrintLibrary(resultLibraryAuthor);
		streamAuthor.close();
		
		System.out.println(" ниги по диапазону лет: ");
		List <Book> resultLibraryRange = new ArrayList<Book>();
		Stream <Book> streamRange = MyLibrary.getLibrary().stream();
		Stream <Book> filteredRange = streamRange.filter(Book -> Book.getDate() > 2005 && Book.getDate() < 2019);
		filteredRange.forEach(Book -> resultLibraryRange.add(Book));
		Util.PrintLibrary(resultLibraryRange);
		streamRange.close();
		
		System.out.println(" ниги по наличию в названии: ");
		List <Book> resultLibraryNameContains = new ArrayList<Book>();
		Stream <Book> streamLibraryNameContains = MyLibrary.getLibrary().stream();
		Stream <Book> filteredLibraryNameContains = streamLibraryNameContains.filter(Book -> Book.getName().contains("Ka"));
		filteredLibraryNameContains.forEach(Book -> resultLibraryNameContains.add(Book));
		Util.PrintLibrary(resultLibraryNameContains);
		
		//System.out.println(" ниги по автору: ");
		//List <Book> resultLibrary = Util.findAuthor(MyLibrary.getLibrary(), "Tolkien");
		//Util.PrintLibrary(resultLibrary);
		
		//System.out.println(" ниги по диапазону лет: ");
		//List <Book> resultLibraryRange = Util.BookInRange(MyLibrary.getLibrary(), 2005, 2019);
		//Util.PrintLibrary(resultLibraryRange);
		
	}

}
