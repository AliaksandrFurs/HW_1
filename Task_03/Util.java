package Task_03;

import java.util.ArrayList;
import java.util.List;


public class Util {


	public static List <Book> findAuthor (List<Book> _library, String author) {
		
		List <Book> resultAuthor = new ArrayList<Book>();
		boolean authorNaN = authorNaN(_library);
		boolean authorNotExist = authorNotExist (_library, author);
		if (authorNaN == false || authorNotExist == false) {
			throw new RuntimeException("Library has invalid author books");
		} else {
		for (Book book : _library) {
			if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
				resultAuthor.add(book);
			}
		}
		return resultAuthor;
		}
	}
	public static void bookAdd (List <Book> _library, Book _book) {
			_library.add(_book);

	}
	
	public static void printLibrary(List <Book> _library) {
		
		for (Book book: _library) {
			System.out.println("Book:");
			System.out.println("ID: " + book.getID());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Publish year: " + book.getDate() + " год");
			System.out.println("Type: " + book.getBindingType());
			System.out.println("Page quantity: " + book.getPageNumbers());
			System.out.println("Price: " + book.getPrice() + " рублей");
			System.out.println("Name: " + book.getName());
			System.out.println();
		}
	}
	
	private static Boolean authorNaN (List<Book> library) {
		for (Book book : library) {
			if (book.getAuthor() == null) {
				return false;
			}
		}
		return true;
	}
	
	private static Boolean authorNotExist (List<Book> library, String _author) {
		boolean authorExist = false;
		for (Book _book : library) {
			if(_book.getAuthor().equals(_author)) {
				authorExist = true;
			}
		}
		if(authorExist = true) {
			return true;
		}
		return false;
	}
	
	public static List <Book> bookInRange(List <Book> _library, int _startRange, int _endRange) {
		List <Book> resultAuthor = new ArrayList<Book>();
		for (Book _book : _library) {
			if (_book.getDate() >= _startRange && _book.getDate() <= _endRange) {
				resultAuthor.add(_book);
			}
		}
		return resultAuthor;
	}
}

