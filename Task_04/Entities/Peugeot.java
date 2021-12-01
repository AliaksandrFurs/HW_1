package Task_04.Entities;

public class Peugeot extends Vehicle {

	
	public Peugeot() {
		
		super (EntitiesNameEnum.PEUGEOT.toString());
	}
	
	public Peugeot (String _name, int _maxSpeed, int _fuelConsumption) {
		super (_name, _maxSpeed, _fuelConsumption);
	}
	
	public Peugeot (String _name, int _maxSpeed, int _fuelConsumption, int _price) {
		super (_name, _maxSpeed, _fuelConsumption, _price);
	}

	
}
