package Task_04.Entities;

public class Audy extends Vehicle{
	
	//private final static String name = EntitiesNameEnum.AUDY.toString();
	
	public Audy() {
		
		super (EntitiesNameEnum.AUDY.toString());
	}
	
	public Audy (String _name, int _maxSpeed, int _fuelConsumption) {
		super (_name, _maxSpeed, _fuelConsumption);
	}
	
	public Audy (String _name, int _maxSpeed, int _fuelConsumption, int _price) {
		super (_name, _maxSpeed, _fuelConsumption, _price);
	}
	

}
