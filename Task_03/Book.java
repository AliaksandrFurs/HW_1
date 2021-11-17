package Task_03;

public class Book {

	private int ID;
	private String author;
	private int date;
	private int pageNumbers;
	private int price;
	private String bindingType;
	private String name;
	
	public Book () {}
	
	public Book (int _ID, String _author, int _date, int _pageNumbers, int _price, String _bindingType, String _name ) {
		this.ID = _ID;
		this.author = _author;
		this.date = _date;
		this.pageNumbers = _pageNumbers;
		this.price = _price;
		this.bindingType = _bindingType;
		this.name = _name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getPageNumbers() {
		return pageNumbers;
	}

	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + date;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pageNumbers;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ID != other.ID)
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (date != other.date)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pageNumbers != other.pageNumbers)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [ID=" + ID + ", author=" + author + ", date=" + date + ", pageNumbers=" + pageNumbers + ", price="
				+ price + ", bindingType=" + bindingType + ", name=" + name + "]";
	}

	
	
	
}
