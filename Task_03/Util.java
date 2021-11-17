package Task_03;

import java.util.ArrayList;
import java.util.List;


public class Util {

	// поиск книг
	public static List <Book> findAuthor (List<Book> _library, String author) {
		
		List <Book> resultAuthor = new ArrayList<Book>();
		boolean authorNaN = AuthorNaN(_library);
		boolean authorNotExist = AuthorNotExist (_library, author);
		if (authorNaN == false || authorNotExist == false) {
			throw new RuntimeException("¬ библиотеке есть книги с неверным автором");
		} else {
		for (Book book : _library) {
			if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
				resultAuthor.add(book);
			}
		}
		return resultAuthor;
		}
	}
	// добавление книги в библиотеку
	public static void bookAdd (List <Book> _library, Book _book) {
		// технически здесь надо бы написать проверки на возможность добавлени€ такой книги в библиотеку, но лень:)
			_library.add(_book);

	}
	
	// вывод библиотеки
	public static void PrintLibrary(List <Book> _library) {
		
		for (Book book: _library) {
			System.out.println(" нига:");
			System.out.println("ID: " + book.getID());
			System.out.println("јвтор: " + book.getAuthor());
			System.out.println("√од издани€: " + book.getDate() + " год");
			System.out.println("“ип переплЄта: " + book.getBindingType());
			System.out.println(" оличество страниц: " + book.getPageNumbers());
			System.out.println("÷ена: " + book.getPrice() + " рублей");
			System.out.println("Ќазвание: " + book.getName());
			System.out.println();
		}
	}
	
	// вспомогательный метод проверки на null
	private static Boolean AuthorNaN (List<Book> library) {
		for (Book book : library) {
			if (book.getAuthor() == null) {
				return false;
			}
		}
		return true;
	}
	
	// вспомогательный метод проверки на отсутствие автора в библиотеке
	private static Boolean AuthorNotExist (List<Book> library, String _author) {
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
	
	// поиск по заданным годам
	public static List <Book> BookInRange(List <Book> _library, int _startRange, int _endRange) {
		List <Book> resultAuthor = new ArrayList<Book>();
		for (Book _book : _library) {
			if (_book.getDate() >= _startRange && _book.getDate() <= _endRange) {
				resultAuthor.add(_book);
			}
		}
		return resultAuthor;
	}
}

