package Task_04.DAO.impl;

import java.util.List;

import Task_04.DAO.VehicleDAO;
import Task_04.Entities.AutoPark;
import Task_04.Entities.Vehicle;


public class MainVehicleDAO implements VehicleDAO {


	@Override
	public void add(AutoPark _autopark, Vehicle _vehicle) {
		_autopark.getAutoPark().add(_vehicle);
		
	}

}
