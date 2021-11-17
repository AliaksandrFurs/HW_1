package Task_04.Entities;

public class DusterCar extends Duster {

	private int ID;
	private String equipment;
	private String company;
	

	public DusterCar() {}
	
	public DusterCar (int _ID, String _equipment, int _price, String _company) {
		super(_price);
		this.ID = _ID;
		this.equipment = _equipment;
		this.company = _company;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getID() {
		return ID;
	}


	public String getEquipment() {
		return equipment;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
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
		DusterCar other = (DusterCar) obj;
		if (ID != other.ID)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (equipment == null) {
			if (other.equipment != null)
				return false;
		} else if (!equipment.equals(other.equipment))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "DusterCar [ID=" + ID + ", equipment=" + equipment + ", company=" + company + "]";
	}
}
