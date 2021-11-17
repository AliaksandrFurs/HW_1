package Task_04.Entities;

public class Peugeot_508 extends Peugeot {

	//private final static int maxSpeed = 240;
	//private final static int capacity = 5;
	private final static String model = EntitiesModelEnum.PEUGEOT_508.toString();
	
	public Peugeot_508 () {
		super (EntitiesNameEnum.PEUGEOT.toString(), 230, 5);
	}
	
	public Peugeot_508 (int _price) {
		super (EntitiesNameEnum.PEUGEOT.toString(), 230, 5, _price);
	}
}
