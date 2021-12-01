package Task_04.Entities;

public abstract class Duster extends Renault {


	private final static String model = EntitiesModelEnum.DUSTER.toString();
	
	public Duster () {
		super (EntitiesNameEnum.RENAULT.toString(), 220, 7);
	}
	
	public Duster (int _price) {
		super (EntitiesNameEnum.RENAULT.toString(), 220, 7, _price);
	}
}
