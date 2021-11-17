package Task_04;

import java.util.Optional;
import java.util.stream.Stream;

import Task_04.DAO.impl.MainVehicleDAO;
import Task_04.Entities.AudyA6_Car;
import Task_04.Entities.AutoPark;
import Task_04.Entities.DusterCar;
import Task_04.Entities.Peugeot_508_Car;
import Task_04.Entities.Vehicle;

public class Main {

	public static void main(String[] args){
		
		AutoPark myAutoPark = new AutoPark();

		MainVehicleDAO mainVehicleDao = new MainVehicleDAO();

		mainVehicleDao.add(myAutoPark, new AudyA6_Car (123, "FULL", 25000, "MyCompany"));
		mainVehicleDao.add(myAutoPark, new Peugeot_508_Car(453, "STANDARD", 13000, "NotMyCompany"));
		mainVehicleDao.add(myAutoPark, new Peugeot_508_Car(459, "FULL", 13000, "NotMyCompany"));
		mainVehicleDao.add(myAutoPark, new DusterCar(756, "STANDARD", 10000, "MyCompany"));
		
		System.out.println("Первый автомобиль по критериям: ");
		Stream <Vehicle> streamVehicle = myAutoPark.getAutoPark().stream();
		Optional <Vehicle> filteredSpeed = streamVehicle.filter(Vehicle -> Vehicle.getMaxSpeed()<240)
				.findAny();
		System.out.println(filteredSpeed);
		streamVehicle.close();
		
		int sum = 0;
		for (Vehicle _vehicle : myAutoPark.getAutoPark()) {
			sum +=_vehicle.getPrice();
		}
		System.out.println("Сумма стоимостей автомобилей: "+ sum + " долларов");
		
		
	}

}
