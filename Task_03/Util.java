package Task_03;

import java.util.ArrayList;
import java.util.List;


public class Util {

	// ����� ����
	public static List <Book> findAuthor (List<Book> _library, String author) {
		
		List <Book> resultAuthor = new ArrayList<Book>();
		boolean authorNaN = AuthorNaN(_library);
		boolean authorNotExist = AuthorNotExist (_library, author);
		if (authorNaN == false || authorNotExist == false) {
			throw new RuntimeException("� ���������� ���� ����� � �������� �������");
		} else {
		for (Book book : _library) {
			if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
				resultAuthor.add(book);
			}
		}
		return resultAuthor;
		}
	}
	// ���������� ����� � ����������
	public static void bookAdd (List <Book> _library, Book _book) {
		// ���������� ����� ���� �� �������� �������� �� ����������� ���������� ����� ����� � ����������, �� ����:)
			_library.add(_book);

	}
	
	// ����� ����������
	public static void PrintLibrary(List <Book> _library) {
		
		for (Book book: _library) {
			System.out.println("�����:");
			System.out.println("ID: " + book.getID());
			System.out.println("�����: " + book.getAuthor());
			System.out.println("��� �������: " + book.getDate() + " ���");
			System.out.println("��� ��������: " + book.getBindingType());
			System.out.println("���������� �������: " + book.getPageNumbers());
			System.out.println("����: " + book.getPrice() + " ������");
			System.out.println("��������: " + book.getName());
			System.out.println();
		}
	}
	
	// ��������������� ����� �������� �� null
	private static Boolean AuthorNaN (List<Book> library) {
		for (Book book : library) {
			if (book.getAuthor() == null) {
				return false;
			}
		}
		return true;
	}
	
	// ��������������� ����� �������� �� ���������� ������ � ����������
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
	
	// ����� �� �������� �����
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

