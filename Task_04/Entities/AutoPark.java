package Task_04.Entities;

import java.util.ArrayList;
import java.util.List;

public class AutoPark {

	List <Vehicle> autoPark;
	
	public AutoPark () {
		
		autoPark = new ArrayList <Vehicle>();
	}
	
	public List<Vehicle> getAutoPark() {
		return autoPark;
	}
	
	public void setAutoPark(List<Vehicle> autoPark) {
		this.autoPark = autoPark;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autoPark == null) ? 0 : autoPark.hashCode());
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
		AutoPark other = (AutoPark) obj;
		if (autoPark == null) {
			if (other.autoPark != null)
				return false;
		} else if (!autoPark.equals(other.autoPark))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AutoPark [autoPark=" + autoPark + "]";
	}
}
