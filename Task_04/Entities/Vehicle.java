package Task_04.Entities;

public abstract class Vehicle {
	
	private String name;
	private int maxSpeed;
	private int fuelConsumption;
	private int price;
	
	public Vehicle (String _name) {
		this.name = _name;
	}
	
	public Vehicle (String _name, int _maxSpeed, int _fuelConsumption) {
		this.name = _name;
		this.maxSpeed = _maxSpeed;
		this.fuelConsumption = _fuelConsumption;
	}
	
	public Vehicle (String _name, int _maxSpeed, int _fuelConsumption, int _price) {
		this.name = _name;
		this.maxSpeed = _maxSpeed;
		this.fuelConsumption = _fuelConsumption;
		this.price = _price;
	}

	public String getName() {
		return name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public int getPrice() {
		return price;
	}
	
	
}
