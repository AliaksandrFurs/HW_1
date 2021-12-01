package Task_04.Entities;

public class Audy_A6 extends Audy{


	private final static String model = EntitiesModelEnum.AUDY_A6.toString();
	
	public Audy_A6 () {
		super (EntitiesNameEnum.AUDY.toString(), 260, 6);
	}
	
	public Audy_A6 (int _price) {
		super (EntitiesNameEnum.AUDY.toString(), 260, 6, _price);
	}


}
