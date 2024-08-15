package com.vehicle.service;

import java.util.List;

import com.vehicle.dtos.VehicleDTO;
import com.vehicle.entities.Vehicle;

public interface VehicleService {

	Vehicle insertInVehicle(VehicleDTO vehicledto);

	List<Vehicle> selectVehicleByUname(String uname);

	void deleteFromVehicle(String uname);
	
}
