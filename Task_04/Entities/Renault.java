package Task_04.Entities;

public abstract class Renault extends Vehicle {
	
	//private final static String name = EntitiesNameEnum.RENAULT.toString();
	
	
	public Renault() {
		
		super (EntitiesNameEnum.RENAULT.toString());
	}
	
	public Renault (String _name, int _maxSpeed, int _fuelConsumption) {
		super (_name, _maxSpeed, _fuelConsumption);
	}
	
	public Renault (String _name, int _maxSpeed, int _fuelConsumption, int _price) {
		super (_name, _maxSpeed, _fuelConsumption, _price);
	}
	
}
