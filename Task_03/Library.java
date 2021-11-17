package Task_03;
import java.util.ArrayList;
import java.util.List;

public class Library {

		private List <Book> library;
		
		public Library () {
			library = new ArrayList <Book>();
		}

		public List<Book> getLibrary() {
			return library;
		}

		public void setLibrary(List<Book> library) {
			this.library = library;
		}
		

		@Override
		public String toString() {
			return "Library []";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((library == null) ? 0 : library.hashCode());
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
			Library other = (Library) obj;
			if (library == null) {
				if (other.library != null)
					return false;
			} else if (!library.equals(other.library))
				return false;
			return true;
		}
		
		
		
		
		
}
