package Task_04.DAO;

import java.util.List;

import Task_04.Entities.AutoPark;
import Task_04.Entities.Vehicle;


public interface VehicleDAO {
	
	void add(AutoPark _autopark, Vehicle vehicle);
}
